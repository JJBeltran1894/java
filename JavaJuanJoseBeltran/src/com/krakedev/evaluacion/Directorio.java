package com.krakedev.evaluacion;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;

	public Directorio() {
		this.contactos = new ArrayList<Contacto>();
	}
	
	public boolean agregarContacto1(Contacto contacto) {
		boolean valido=true;
		if(contactos.size()==0) {
			contactos.add(contacto);
		}else {
			for(int i=0;i<contactos.size();i++) {
				if(contactos.get(i).getCedula().equals(contacto.getCedula())) {
					valido=false;
					System.out.println("Contacto Duplicado");
					break;
				}
			}	
			if(valido==true) {
				contactos.add(contacto);
				fechaModificacion=new Date();
			}
			
		}
		return valido;
	}
	public boolean agregarContacto(Contacto contacto) {
		boolean ingresado=false;
		Contacto resultado;
		if(contactos.size()==0) {
			contactos.add(contacto);
			fechaModificacion=new Date();
			ingresado=true;
		}else {
			resultado=buscarPorCedula(contacto.getCedula());
			if(resultado==null) {
				contactos.add(contacto);
				fechaModificacion=new Date();
				ingresado=true;
			}
			
		}
		return ingresado;
	}
	public Contacto buscarPorCedula(String cedula) {
		Contacto contactoEncontrado=null;
		if(contactos.size()==0) {
			System.out.println("Direcctorio Vacio");
		}else {
			for(int i=0;i<contactos.size();i++) {
				if(contactos.get(i).getCedula().equals(cedula)) {
					contactoEncontrado=contactos.get(i);
					break;	
				}
			}
		}
		return contactoEncontrado;
	}
	public String consultarUltimaModificacion() {
		SimpleDateFormat fechaConFormato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ultimaModificacion=fechaConFormato.format(fechaModificacion);
		return ultimaModificacion;
	}
	public int contarPerdidos() {
		int perdidos=0;
		if(contactos.size()==0) {
			System.out.println("Direcctorio Vacio");
		}else {
			for(int i=0;i<contactos.size();i++) {
				if(contactos.get(i).getDireccion()==null) {
					perdidos+=1;
				}
			}
		}
		return perdidos;
	}
	public int contarFijos() {
		int fijos=0;
		if(contactos.size()==0) {
			System.out.println("Direcctorio Vacio");
		}else {
			for(int i=0;i<contactos.size();i++) {
				ArrayList<Telefono> telefonos=contactos.get(i).getTelefonos();
				if(telefonos==null) {
					//System.out.println("Contacto no tiene telefonos asociados");
				}else {
					for(int t=0;t<telefonos.size();t++) {
						if(telefonos.get(t).getTipo().equals("Convencional") && telefonos.get(t).getEstado().equals("C")) {
							fijos+=1;
						}
					}
				}
			}
		}
		return fijos;
	}
}
