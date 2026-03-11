package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telf1 =new Telefono("movi","098234234",20);
		AdminTelefono admTelf= new AdminTelefono();
		admTelf.activarMensajeria(telf1);
		telf1.imprimir();

	}

}
