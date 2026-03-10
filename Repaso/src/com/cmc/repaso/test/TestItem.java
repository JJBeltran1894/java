package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1=new Item();
		item1.setNombre("Flash Memory 64GB");
		item1.setProductosActuales(20);
		
		item1.imprimir();
		
		item1.vender(12);
		item1.devolver(5);
		
		item1.imprimir();
		
		Item item2=new Item();
		item2.setNombre("Disco Duro Solido 1TB Sata");
		item2.setProductosActuales(50);
		
		item2.imprimir();
		
		item2.vender(41);
		item2.devolver(17);
		
		item2.imprimir();
		

	}

}
