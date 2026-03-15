package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<String> jugadores;
	
	public Juego(ArrayList<String> idsJugadores) {
		naipe=new Naipe();
		naipeBarajado=naipe.barajar();
		
		cartasJugadores= new ArrayList<ArrayList<Carta>>();
		jugadores=new ArrayList<String>();
		jugadores.addAll(idsJugadores);
		for(int i=0;i<idsJugadores.size();i++) {
			cartasJugadores.add(new ArrayList<Carta>());
			
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
	public int devolverTotal(int idJugador) {
		int total=0;
		for(int i=0;i<cartasJugadores.get(idJugador).size();i++) {
			total+=cartasJugadores.get(idJugador).get(i).getNumero().getValor();
		}
		return total;
	}
	public String determinarGanador() {
		String idGanador=jugadores.get(0);
		int sumaGanador=devolverTotal(0);
		for(int i=1;i<jugadores.size();i++) {
			if(devolverTotal(i)>=sumaGanador) {
				idGanador=jugadores.get(i);
			}
		}
		return idGanador;
	}
	
}
