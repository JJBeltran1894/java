package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf=new  Telefono("movi","099925841",255);
		Contacto c=new Contacto("Jordan","Diaz",telf,0.0);
		c.imprimir();
		
	}

}
