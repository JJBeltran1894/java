package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf=new  Telefono("claro","098555831",211);
		Contacto c=new Contacto("Damian","Correa",telf,0.0);
		c.imprimir();
		c.getTelefono().imprimir();
		
		AdminContactos admContact=new AdminContactos();
		
		admContact.activarUsuario(c);
		
		System.out.println("Luego de intentar activacion");
		
		c.imprimir();
		c.getTelefono().imprimir();
	}

}
