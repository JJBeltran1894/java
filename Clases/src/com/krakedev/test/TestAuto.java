package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		// 1. Instanciar dos autos (auto1 y auto2)
		Auto auto1=new Auto(" ",0,0.0);
		Auto auto2=new Auto(" ",0,0.0);
		// 2. Modificar los atrbutos
		auto1.setMarca("Audi");
		auto1.setAnio(2023);
		auto1.setPrecio(21590);
		
		auto2.setMarca("Opel");
		auto2.setAnio(2025);
		auto2.setPrecio(26200);
		
		System.out.println("------------");
		// 3. Imprimir atributos en consola
		
		
		System.out.println("A1 Marca: "+auto1.getMarca());
		System.out.println("A1 Año: "+auto1.getAnio());
		System.out.println("A1 Precio: "+auto1.getPrecio());
		
		System.out.println("------------");
		
		System.out.println("A2 Marca: "+auto2.getMarca());
		System.out.println("A2 Año: "+auto2.getAnio());
		System.out.println("A2 Precio: "+auto2.getPrecio());
		
	}

}
