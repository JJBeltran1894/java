package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;
		
		calcu= new Calculadora();
		
		resultadoSuma=calcu.sumar(5,8);
		resultadoResta=calcu.restar(10,3);
		resultadoMultiplicacion=calcu.multiplicar(25, 13.25);
		resultadoDivision=calcu.dividir(resultadoMultiplicacion, 4);		
		resultadoPromedio=calcu.promediar(resultadoMultiplicacion, resultadoDivision, resultadoResta);
		System.out.println("Resultado Suma: "+resultadoSuma);
		System.out.println("Resultado Resta: "+resultadoResta);
		System.out.println("Resultado Multiplicacion: "+resultadoMultiplicacion);
		System.out.println("Resultado Division: "+resultadoDivision);
		System.out.println("Resultado Promedio entre: "+resultadoMultiplicacion+", "+resultadoDivision+", "+resultadoResta+" es igual a : " +resultadoPromedio);
		calcu.mostrarResultado();
	}

}
