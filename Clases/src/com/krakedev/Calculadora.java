package com.krakedev;

public class Calculadora {
	public int sumar(int valor1, int valor2) {
		int resultado; //declarar la variable
		resultado=valor1+valor2;
		return resultado;
	}
	public double restar(int valor1,int valor2) {
		double resultado;
		resultado=valor1-valor2;
		return resultado;
	}
	
	public int multiplicar(int valor1,int valor2) {
		int resultado;
		resultado=valor1*valor2;
		return resultado;
	}
	public int dividir(int valor1, int valor2) {
		int resultado;
		resultado=valor1/valor2;
		return resultado;
	}
	public double promediar(double valor1,double valor2,double valor3) {
		double promedio;
		promedio=(valor1+valor2+valor3)/3;
		return promedio;
	}
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, salí al almuerzo. Regreso en 15 minutos");
	}
}
