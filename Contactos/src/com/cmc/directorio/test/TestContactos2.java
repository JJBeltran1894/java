package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf1=new  Telefono("movi","093645841",852);
		Telefono telf2=new  Telefono("movi","099015541",166);
		Contacto c1=new Contacto("Domenica","Arias",telf1,76.25);
		Contacto c2=new Contacto("Carlos","Prado",telf2,60.1);
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
