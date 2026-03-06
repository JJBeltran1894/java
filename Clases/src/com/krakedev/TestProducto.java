package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// 1. y 2. Crear 3 variables e instanciar los objetos
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		
		// 2. Modificar los atributos de cada producto (tipo farmacia)
		// A
		productoA.nombre="Apronax 500mg";
		productoA.descripcion="Desinflamatorio en tableta";
		productoA.precio=3.26;
		productoA.stockActual=120;
		
		//B
		productoB.nombre="Alcohol antiseptico 70%";
		productoB.descripcion="Desinfectate, antibacterial, cicatrizante";
		productoB.precio=2.61;
		productoB.stockActual=65;
		
		//C
		productoC.nombre="Vendas elasticas de 15cm * 1m";
		productoC.descripcion="Para fijar o inmovilizar articulaciones";
		productoC.precio=7.75;
		productoC.stockActual=20;
		
		System.out.println("------------");
		
		// 3. Imprimir los atributos de los objetos auto1, auto2, auto3
		
		System.out.println("Producto A Nombre: "+productoA.nombre);
		System.out.println("Descripcion: "+productoA.descripcion);
		System.out.println("Precio: "+productoA.precio);
		System.out.println("Stock: "+productoA.stockActual);
		
		System.out.println("------------");
		
		System.out.println("Producto B Nombre: "+productoB.nombre);
		System.out.println("Descripcion: "+productoB.descripcion);
		System.out.println("Precio: "+productoB.precio);
		System.out.println("Stock: "+productoB.stockActual);
		
		System.out.println("------------");
		
		System.out.println("Producto C Nombre: "+productoC.nombre);
		System.out.println("Descripcion: "+productoC.descripcion);
		System.out.println("Precio: "+productoC.precio);
		System.out.println("Stock: "+productoC.stockActual);
		
		System.out.println("------------");
		

		

	}

}
