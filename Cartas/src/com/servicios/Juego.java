package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;
	
	public Juego(ArrayList<String> idsJugadores) {
		naipe=new Naipe();
		naipeBarajado=naipe.barajar();
		ArrayList<Carta> arregloCartas= new ArrayList<Carta>(); 
		cartasJugadores= new ArrayList<ArrayList<Carta>>();
		for(int i=0;i<idsJugadores.size();i++) {
			cartasJugadores.add(arregloCartas);
			
		}
	}
	public Juego() {
		naipe=new Naipe();
		naipeBarajado=naipe.barajar();
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
		
	}
	public void entregarCartas(int cartasPorJugador) {
		int ordenCarta=0;
		for(int x=0;x<cartasPorJugador;x++) {
			for(int i=0;i<cartasJugadores.size();i++) {
				cartasJugadores.get(i).add(naipeBarajado.get(ordenCarta));
				ordenCarta++;
			}
		}
	}
	
}
