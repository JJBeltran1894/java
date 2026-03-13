package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		ArrayList<Producto> productosMenores;
		//maquina.agregarCelda(new Celda("A"));
        //maquina.agregarCelda(new Celda("B"));
        //maquina.agregarCelda(new Celda("C"));
        //maquina.agregarCelda(new Celda("D"));
		maquina.agregarCelda("A1");
        maquina.agregarCelda("A2");
        maquina.agregarCelda("B1");
        maquina.agregarCelda("B2");
        maquina.agregarCelda("C1");
        maquina.agregarCelda("C2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "A1", 6);
		
		Producto producto3=new Producto("AS99","Trident",0.15);
		maquina.cargarProducto(producto3, "B2", 10);
		
		Producto producto4=new Producto("23AP","Galletas",0.75);
		maquina.cargarProducto(producto4, "A2", 8);
		
		Producto producto5=new Producto("17PS","Chifles",0.99);
		maquina.cargarProducto(producto5, "C1", 11);
		
		Producto producto6=new Producto("78EE","Yogurt",1.15);
		maquina.cargarProducto(producto6, "C2", 7);
		
		productosMenores=maquina.buscarMenores(0.86);
		System.out.println("Productos Menores: "+productosMenores.size());
		for(int i=0;i<productosMenores.size();i++) {
			System.out.println("Nombre: "+productosMenores.get(i).getNombre()+" Precio: "+productosMenores.get(i).getPrecio());
		}
	}

}
