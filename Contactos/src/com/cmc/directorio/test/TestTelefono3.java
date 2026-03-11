package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("claro","091239871",25);
		Telefono telf2=new Telefono("movi","091928374",29);
		Telefono telf3=new Telefono("movi","095552228",32);
		AdminTelefono admTelf1=new AdminTelefono();
		
		int movis=admTelf1.contarMovi(telf1, telf2, telf3);
		
		System.out.println("Tenemos "+movis+" telefonos con Operadora Movistar");
	
	}

}
