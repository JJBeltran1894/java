package com.krakedev;

import java.lang.Math;

public class Cuadrado {
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	
	public double calcularArea() {
		double area=Math.pow(lado, 2);
		return area;
	}
	public double calcularPerimetro() {
		double perimetro=lado*4;
		return perimetro;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
}
