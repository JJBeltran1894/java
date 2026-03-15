package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugador;
	
	public Juego(ArrayList<String> idsJugadores ) {
		ArrayList<Carta> arregloCartas= new ArrayList<Carta>(); 
		cartasJugador= new ArrayList<ArrayList<Carta>>();
		for(int i=0;i<idsJugadores.size();i++) {
			cartasJugador.add(arregloCartas);
		}
	}
	

}
