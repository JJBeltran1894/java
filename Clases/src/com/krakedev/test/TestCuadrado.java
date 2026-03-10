package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado(0);
		Cuadrado c2=new Cuadrado(0);
		Cuadrado c3=new Cuadrado(0);
		
		c1.setLado(13);
		c2.setLado(25.63);
		c3.setLado(128.6);
		
		double areaC1=c1.calcularArea();
		double areaC2=c2.calcularArea();
		double areaC3=c3.calcularArea();
		
		System.out.println("Area C1: "+areaC1);
		System.out.println("Area C2: "+areaC2);
		System.out.println("Area C3: "+areaC3);
		
		double perimetroC1=c1.calcularPerimetro();
		double perimetroC2=c2.calcularPerimetro();
		double perimetroC3=c3.calcularPerimetro();	
		
		System.out.println("Perimetro C1: "+perimetroC1);
		System.out.println("Perimetro C2: "+perimetroC2);
		System.out.println("Perimetro C3: "+perimetroC3);

	}

}
