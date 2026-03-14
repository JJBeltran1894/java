package com.krakedev.evaluacion;


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
			ingresado=true;
		}else {
			resultado=buscarPorCedula(contacto.getCedula());
			if(resultado==null) {
				contactos.add(contacto);
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
}
