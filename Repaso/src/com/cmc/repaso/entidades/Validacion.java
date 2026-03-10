package com.cmc.repaso.entidades;

public class Validacion {
	public boolean validarMonto(double monto) {
		boolean valido;
		if(monto>0) {
			valido=true;
		}else {
			valido=false;
		}
		return valido;
	}
}
