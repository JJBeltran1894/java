package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telf1=new  Telefono("movi","099645841",655);
		Telefono telf2=new  Telefono("claro","099015841",256);
		Contacto c1=new Contacto("Andres","Lopez",telf1,56.5);
		Contacto c2=new Contacto("Carmen","Ramirez",telf2,80);
		AdminContactos admContact=new AdminContactos();
	
		Contacto pesado=admContact.buscarMasPesado(c1, c2);
		pesado.imprimir();
		
		boolean compara=admContact.compararOperadoras(c1, c2);
		
		if(compara==true) {
			System.out.println("Misma Operadora");
		}else {
			System.out.println("Diferente Operadora");
		}
		

	}

}
