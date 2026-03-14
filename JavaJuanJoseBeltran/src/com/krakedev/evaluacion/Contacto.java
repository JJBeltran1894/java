package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	
	public Contacto(String cedula, String nombre, String apellido) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos=new ArrayList<Telefono>();
		
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public void imprimir1() {
		System.out.println("Cédula: "+cedula+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nDirección:\n  Calle Principal: "+direccion.getCallePrincipal()+"\n  Calle Secundaria: "+direccion.getCalleSecundaria());
		
	}
	public void imprimir() {
		String texto="***"+nombre+" "+apellido+"***\n";
		if(direccion!=null) {
			texto+="Dirección: "+direccion.getCallePrincipal()+" y "+direccion.getCalleSecundaria();
		}else {
			texto+="No tiene asociada una dirección";
		}
		System.out.println(texto);
	}
	public void agregarTelefono(Telefono telefono) {
		boolean error=false;
		if(telefonos.size()==0) {
			telefonos.add(telefono);
		}else {
			for(int i=0;i<telefonos.size();i++) {
				if(telefonos.get(i).getNumero().equals(telefono.getNumero())) {
					error=true;
					System.out.println("Telefono Duplicado");
					break;
				}
			}	
			if(error==false) {
				telefonos.add(telefono);
			}
			
		}
	}
	public void mostrarTelefonos() {
		String texto="Teléfonos con estado 'C':";
		if(telefonos==null) {
			texto="Contacto no tiene telefonos registrados";
		}else {
			for(int i=0;i<telefonos.size();i++) {
				if(telefonos.get(i).getEstado().equals("C")) {
					texto+="\nNúmero: "+telefonos.get(i).getNumero()+", Tipo: "+telefonos.get(i).getTipo();
				}
			}
		}
		System.out.println(texto);
	}
	
	
}
