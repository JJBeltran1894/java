package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> cadenas;
		cadenas=new ArrayList<String>();
		String valorRecuperado;
		
		System.out.println(cadenas.size());
		
		cadenas.add("uno");
		cadenas.add("dos");
		
		System.out.println(cadenas.size());
		
		valorRecuperado=cadenas.get(1);
		
		String cadena;
		System.out.println(valorRecuperado);
		
		for(int i=0;i<cadenas.size();i++) {
			cadena=cadenas.get(i);
			System.out.println("Cadena "+(i+1)+": "+cadena);
		}
	}

}
