package com.cmc.evaluacion.entidades;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double monto=prestamo.getMonto();
		double interesPeriodo=(prestamo.getInteres()/100/12);
		int plazo=prestamo.getPlazo();
		double cuota=0;
		
		cuota=(monto*interesPeriodo)/(1-Math.pow((1+interesPeriodo), -plazo));		
		
		return cuota;
	}
}
