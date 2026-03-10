package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto producto1= new Producto(21,"Arroz");
		producto1.setDescripcion("Arroz macareño");
		producto1.setPeso(500.00);
		
		System.out.println("------Producto------");
		System.out.println("----"+producto1.getNombre()+"----");
		System.out.println(" >> Codigo: "+producto1.getCodigo());
		System.out.println(" >> Nombre: "+producto1.getNombre());
		System.out.println(" >> Descripcion: "+producto1.getDescripcion());
		System.out.println(" >> Peso: "+producto1.getPeso());
	

	}

}
