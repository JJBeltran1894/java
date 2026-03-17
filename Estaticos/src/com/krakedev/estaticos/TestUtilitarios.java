package com.krakedev.estaticos;

public class TestUtilitarios {

	public static void main(String[] args) {
		Utilitarios util=new Utilitarios();
		util.validaRango(15);
		
		Boolean resultado=Utilitarios.validaRango(100);
		System.out.println(resultado);

	}

}
