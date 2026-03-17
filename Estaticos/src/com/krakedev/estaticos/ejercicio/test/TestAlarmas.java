package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarma;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma a1=new Alarma(DiasSemana.LUNES,6,30);
		Alarma a2=new Alarma(DiasSemana.MARTES,7,45);
		Alarma a3=new Alarma(DiasSemana.SABADO,8,30);
		Alarma a4=new Alarma(DiasSemana.DOMINGO,6,40);
		
		AdminAlarma adminA=new AdminAlarma();
		
		adminA.agregarAlarma(a1);
		adminA.agregarAlarma(a2);
		adminA.agregarAlarma(a3);
		adminA.agregarAlarma(a4);
		
		adminA.getAlarmas();
		
		ArrayList<Alarma> alarmasActuales=adminA.getAlarmas();
		System.out.println(alarmasActuales);

	}

}
