package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// 1. y 2. Crear 3 variables e instanciar los objetos
		Producto productoA=new Producto(" "," ",0,0);
		Producto productoB=new Producto(" "," ",0,0);
		Producto productoC=new Producto(" "," ",0,0);
		
		// 2. Modificar los atributos de cada producto (tipo farmacia)
		// A
		productoA.setNombre("Apronax 500mg");
		productoA.setDescripcion("Desinflamatorio en tableta");
		productoA.setPrecio(3.26);
		productoA.setStockActual(120);
		
		//B
		productoB.setNombre("Alcohol antiseptico 70%");
		productoB.setDescripcion("Desinfectate, antibacterial, cicatrizante");
		productoB.setPrecio(2.61);
		productoB.setStockActual(65);
		
		//C
		productoC.setNombre("Vendas elasticas de 15cm * 1m");
		productoC.setDescripcion("Para fijar o inmovilizar articulaciones");
		productoC.setPrecio(7.75);
		productoC.setStockActual(20);
		
		System.out.println("------------");
		
		// 3. Imprimir los atributos de los objetos auto1, auto2, auto3
		
		System.out.println("Producto A Nombre: "+productoA.getNombre());
		System.out.println("Descripcion: "+productoA.getDescripcion());
		System.out.println("Precio: "+productoA.getPrecio());
		System.out.println("Stock: "+productoA.getStockActual());
		
		System.out.println("------------");
		
		System.out.println("Producto B Nombre: "+productoB.getNombre());
		System.out.println("Descripcion: "+productoB.getDescripcion());
		System.out.println("Precio: "+productoB.getPrecio());
		System.out.println("Stock: "+productoB.getStockActual());
		
		System.out.println("------------");
		
		System.out.println("Producto C Nombre: "+productoC.getNombre());
		System.out.println("Descripcion: "+productoC.getDescripcion());
		System.out.println("Precio: "+productoC.getPrecio());
		System.out.println("Stock: "+productoC.getStockActual());
		
		System.out.println("------------");
		

		

	}

}
