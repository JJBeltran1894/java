package com.cmc.evaluacion.utilitario;

public class Utilitario {
	public static double redondear(double valor) {
		/*BigDecimal bd = new BigDecimal(valor);
		bd=bd.setScale(2,RoundingMode.HALF_UP);*/
		double redondeado=Math.round(valor*100.0)/100.0;
		
		return redondeado;
	}

}
