package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("claro","091239871",19);
		Telefono telf2=new Telefono("movi","0910081374",21);
		Telefono telf3=new Telefono("claro","0955588881",82);
		Telefono telf4=new Telefono("claro","0933302227",17);
		AdminTelefono admTelf1=new AdminTelefono();
		
		int claros=admTelf1.contarClaro(telf1, telf2, telf3,telf4);
		
		System.out.println("Tenemos "+claros+" telefonos con Operadora Claro");		
	
	}

}
