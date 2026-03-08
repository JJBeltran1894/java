package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; //1. Declaro una variable p de tipo persona
		p=new Persona(); //2. Instanciar un objeto persona, referenciado a la variable p
		Persona p2 =new Persona();//
		
		//3. Accedo a los atributos
		System.out.println("Hola Mundo");
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Edad: "+p.getEdad());
		System.out.println("Edad: "+p.getEstatura());
		
		//4. Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		
		System.out.println("------------");
		
		//5. Accedo a los atributos
		System.out.println("Hola Mundo");
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Edad: "+p.getEdad());
		System.out.println("Edad: "+p.getEstatura());
		
		p2.setNombre("Angelina");
		System.out.println("******");
		System.out.println("p.nombre: "+p.getNombre());
		System.out.println("p2.nombre: "+p2.getNombre());
		
		
	}

}
