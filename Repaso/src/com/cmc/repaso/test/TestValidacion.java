package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validador=new Validacion();
		boolean montoValido=validador.validarMonto(-2);
		System.out.println(montoValido);
		
	}

}
