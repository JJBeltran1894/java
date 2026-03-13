package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVender {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		//maquina.agregarCelda(new Celda("A"));
        //maquina.agregarCelda(new Celda("B"));
        //maquina.agregarCelda(new Celda("C"));
        //maquina.agregarCelda(new Celda("D"));
		maquina.agregarCelda("A1");
        maquina.agregarCelda("A2");
        maquina.agregarCelda("B1");
        maquina.agregarCelda("B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "A1", 6);
		
		Producto producto3=new Producto("AS99","Trident",0.15);
		maquina.cargarProducto(producto3, "B2", 10);
		
		Producto producto4=new Producto("23AP","Galletas",0.75);
		maquina.cargarProducto(producto4, "A2", 8);
		
		maquina.vender("A1");
		maquina.vender("B1");
		maquina.vender("B2");
		maquina.vender("A2");
		
		maquina.mostrarProductos();

	}

}
