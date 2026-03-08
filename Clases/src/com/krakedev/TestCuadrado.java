package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();
		
		c1.lado=13;
		c2.lado=25.63;
		c3.lado=128.6;
		
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
