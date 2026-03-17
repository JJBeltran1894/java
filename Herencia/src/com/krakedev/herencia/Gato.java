package com.krakedev.herencia;

public class Gato extends Animal {
	@Override
	public void dormir() {
		System.out.println("Es un gatico mimido");
	}
	public void maullar() {
		System.out.println("Ahora el michi maulla");
	}
	
	public void maullar(String adjetivo) {
		System.out.println("gato maullando "+adjetivo);
	}

}
