package com.krakedev.evaluacion;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	
	public Contacto(String cedula, String nombre, String apellido) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
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
	
	
}
