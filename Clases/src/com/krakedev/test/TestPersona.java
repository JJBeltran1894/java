package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; //1. Declaro una variable p de tipo persona
		p=new Persona(); //2. Instanciar un objeto persona, referenciado a la variable p
		Persona p2 =new Persona();//
		Persona p3=new Persona("Pablo");
		Persona p4=new Persona("Juan",15,1.67);
		
		System.out.println("Hola Mundo");
		System.out.println("Nombre: "+p4.getNombre());
		System.out.println("Edad: "+p4.getEdad());
		System.out.println("Estatura: "+p4.getEstatura());
		
		//3. Accedo a los atributos
		System.out.println("Hola Mundo");
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Edad: "+p.getEdad());
		System.out.println("Estatura: "+p.getEstatura());
		
		//4. Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		
		System.out.println("------------");
		
		//5. Accedo a los atributos
		System.out.println("Hola Mundo");
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Edad: "+p.getEdad());
		System.out.println("Estatura: "+p.getEstatura());
		
		p2.setNombre("Angelina");
		System.out.println("******");
		System.out.println("p.nombre: "+p.getNombre());
		System.out.println("p2.nombre: "+p2.getNombre());
		
		p3.setNombre("Angel");
		
	}

}
