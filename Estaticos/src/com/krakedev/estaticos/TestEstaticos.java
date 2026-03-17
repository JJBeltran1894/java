package com.krakedev.estaticos;

public class TestEstaticos {

	public static void main(String[] args) {
		// para invocar un metodo estatico, se lo hace directamente desde la clase, no hace falta instanciar el objeto
		double numero=Math.random();
		System.out.println(numero);
		System.out.println(Math.TAU);
		
		int radio=10;
		double area=Math.PI*radio;
		System.out.println(area);
		

	}

}
