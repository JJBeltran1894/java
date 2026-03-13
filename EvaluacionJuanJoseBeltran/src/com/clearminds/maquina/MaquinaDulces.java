package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public void agregarCelda(String codCelda) {
		Celda celda= new Celda(codCelda);
		celdas.add(celda);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("**Configuracion Maquina**");
		for(int i=0;i<celdas.size();i++) {
			System.out.println("  >Celda "+i+": "+celdas.get(i).getCodigo());
		}

		System.out.println("-------------------------");
	}
}
