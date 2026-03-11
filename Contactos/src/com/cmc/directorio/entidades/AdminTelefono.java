package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telf) {
		if(telf.getOperadora()=="movi") {
			telf.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono telf1,Telefono telf2,Telefono telf3) {
		int count=0;
		if(telf1.getOperadora()=="movi") {
			count+=1;
		}
		if(telf2.getOperadora()=="movi") {
			count+=1;
		}
		if(telf3.getOperadora()=="movi") {
			count+=1;
		}
		return count;
	}
	public int contarClaro(Telefono telf1,Telefono telf2,Telefono telf3,Telefono telf4) {
		int count=0;
		if(telf1.getOperadora()=="claro") {
			count+=1;
		}
		if(telf2.getOperadora()=="claro") {
			count+=1;
		}
		if(telf3.getOperadora()=="claro") {
			count+=1;
		}
		if(telf4.getOperadora()=="claro") {
			count+=1;
		}
		return count;
	}
}
