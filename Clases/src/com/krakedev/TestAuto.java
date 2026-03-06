package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// 1. Instanciar dos autos (auto1 y auto2)
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		// 2. Modificar los atrbutos
		auto1.marca="Audi";
		auto1.anio=2023;
		auto1.precio=21590;
		
		auto2.marca="Opel";
		auto2.anio=2025;
		auto2.precio=26200;
		
		System.out.println("------------");
		// 3. Imprimir atributos en consola
		
		
		System.out.println("A1 Marca: "+auto1.marca);
		System.out.println("A1 Año: "+auto1.anio);
		System.out.println("A1 Precio: "+auto1.precio);
		
		System.out.println("------------");
		
		System.out.println("A2 Marca: "+auto2.marca);
		System.out.println("A2 Año: "+auto2.anio);
		System.out.println("A2 Precio: "+auto2.precio);
		
	}

}
