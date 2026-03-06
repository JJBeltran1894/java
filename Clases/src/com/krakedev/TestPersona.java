package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; //1. Declaro una variable p de tipo persona
		p=new Persona(); //2. Instanciar un objeto persona, referenciado a la variable p
		Persona p2 =new Persona();//
		
		//3. Accedo a los atributos
		System.out.println("Hola Mundo");
		System.out.println("Nombre: "+p.nombre);
		System.out.println("Edad: "+p.edad);
		System.out.println("Edad: "+p.estatura);
		
		//4. Modificar los atributos
		p.nombre="Mario";
		p.edad=45;
		p.estatura=1.56;
		
		System.out.println("------------");
		
		//5. Accedo a los atributos
		System.out.println("Hola Mundo");
		System.out.println("Nombre: "+p.nombre);
		System.out.println("Edad: "+p.edad);
		System.out.println("Edad: "+p.estatura);
		
		p2.nombre="Angelina";
		System.out.println("******");
		System.out.println("p.nombre: "+p.nombre);
		System.out.println("p2.nombre: "+p2.nombre);
		
		
	}

}
