package com.entidades;

public class Random {
	public static int obtenerPosicion() {
		double aleatorio=Math.random();
		int posicion=(int)(Math.round(aleatorio*52));
		return posicion;				
	}
}
