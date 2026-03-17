package com.krakedev.estaticos;

public class Calculos {
	//final hace que elvalro no se pueda cambiar, es decir lo convierte en constante
	private final double iva=12;
	
	public double calcularIva(double monto){
		return monto *iva/100;
		
	}
}
