package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public void imprimir() {
		System.out.println("*********************");
		System.out.println("Producto: "+this.nombre);
		System.out.println("*********************");
		System.out.println("Stock Actual: "+this.productosActuales);
		System.out.println("Items Devueltos: "+this.productosDevueltos);
		System.out.println("Items Vendidos: "+this.productosVendidos);
		System.out.println("");
		
	}
	public void vender(int cantidadVendida) {
		this.productosActuales-=cantidadVendida;
		this.productosVendidos+=cantidadVendida;
	}
	
	public void devolver(int cantidadDevueltos) {
		this.productosActuales+=cantidadDevueltos;
		this.productosDevueltos+=cantidadDevueltos;
		this.productosVendidos-=cantidadDevueltos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	

}
