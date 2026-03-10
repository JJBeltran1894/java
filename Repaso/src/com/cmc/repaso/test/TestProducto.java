package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto=new Producto("Doritos",0.75);
		producto.setPrecio(-1);
		double aPagar=producto.calcularPrecioPromo(25);
		System.out.println("El precio del producto "+producto.getNombre()+" es: $"+producto.getPrecio()+". Menos el descuento el precio a pagar es de: $"+aPagar);

	}

}
