package com.entidades;

import java.util.ArrayList;

public class Naipe {
	ArrayList<Numero> numerosPosibles;
	ArrayList<Carta> cartas;
	
	public Naipe() {
		numerosPosibles=new ArrayList<Numero>();
		cartas= new ArrayList<Carta>();
		
		Numero np1= new Numero("A",11);
		numerosPosibles.add(np1);
		Numero np2= new Numero("2",2);
		numerosPosibles.add(np2);
		Numero np3= new Numero("3",3);
		numerosPosibles.add(np3);
		Numero np4= new Numero("4",4);
		numerosPosibles.add(np4);
		Numero np5= new Numero("5",5);
		numerosPosibles.add(np5);
		Numero np6= new Numero("6",6);
		numerosPosibles.add(np6);
		Numero np7= new Numero("7",7);
		numerosPosibles.add(np7);
		Numero np8= new Numero("8",8);
		numerosPosibles.add(np8);
		Numero np9= new Numero("9",9);
		numerosPosibles.add(np9);
		Numero np10= new Numero("10",10);
		numerosPosibles.add(np10);
		Numero np11= new Numero("J",10);
		numerosPosibles.add(np11);
		Numero np12= new Numero("Q",10);
		numerosPosibles.add(np12);
		Numero np13= new Numero("K",10);
		numerosPosibles.add(np13);
		
		Numero n=new Numero("",0);
		Palos palo=new Palos();
		Carta c1=new Carta(n,palo.getCorazonNegro());
		Carta c2=new Carta(n,palo.getCorazonRojo());
		Carta c3=new Carta(n,palo.getDiamantte());
		Carta c4=new Carta(n,palo.getTrebol());
		
		for(int i=0;i<numerosPosibles.size();i++) {
			c1.setNumero(numerosPosibles.get(i));
			c2.setNumero(numerosPosibles.get(i));
			c3.setNumero(numerosPosibles.get(i));
			c4.setNumero(numerosPosibles.get(i));
			cartas.add(c1);
			cartas.add(c2);
			cartas.add(c3);
			cartas.add(c4);
		}
		
		
		
	}
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar=new ArrayList<Carta>();
		int posicion;
		for(int i=0;i<100;i++) {
			posicion = Random.obtenerPosicion();
			if(cartas.get(posicion).getEstado().equals("N")) {
				auxiliar.add(cartas.get(posicion));
				cartas.get(posicion).setEstado("C");
			}
		}
		for(int p=0;p<cartas.size();p++) {
			if(cartas.get(p).getEstado().equals("N")) {
				auxiliar.add(cartas.get(p));
				cartas.get(p).setEstado("C");
			}
		}
		return auxiliar;
	}
	
}
