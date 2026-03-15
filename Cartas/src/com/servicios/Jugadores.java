package com.servicios;

import java.util.ArrayList;

public class Jugadores {
	private ArrayList<String> jugadores;

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	public void jugar(){
		jugadores= new ArrayList<String>();
		jugadores.add("1");
		jugadores.add("2");
		jugadores.add("3");
		Juego juego =new Juego(jugadores);
		juego.entregarCartas(5);
		
		
	}

}
