package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int numero) {
		if (numero < 10) {
            return "0" + numero;
        } else {
            return numero + "";
        }
	}
	
	public static String formatearDia(int numero) {
		String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        
        if (numero >= 0 && numero < dias.length) {
            return dias[numero];
        }
        return "día no valido";
	}
}
