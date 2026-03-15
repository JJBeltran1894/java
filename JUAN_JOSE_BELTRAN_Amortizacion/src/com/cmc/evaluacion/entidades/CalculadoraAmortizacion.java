package com.cmc.evaluacion.entidades;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double monto=prestamo.getMonto();
		double interesPeriodo=(prestamo.getInteres()/100/12);
		int plazo=prestamo.getPlazo();
		double cuota=0;
		
		cuota=(monto*interesPeriodo)/(1-Math.pow((1+interesPeriodo), -plazo));		
		
		return cuota;
	}
	public static void generarTabla(Prestamo prestamo) {
		double cuota=calcularCuota(prestamo);
		double interesMensual=(prestamo.getInteres()/100/12);
		for(int i=0;i<prestamo.getPlazo();i++) {
			prestamo.getCuotas().add(new Cuota(i+1,cuota));
		}
		prestamo.getCuotas().get(0).setCapital(prestamo.getMonto());
		for(int j=0;j<prestamo.getCuotas().size();j++) {
			if(prestamo.getCuotas().size()==(j+1)) {
				calcularValoresCuota(interesMensual,prestamo.getCuotas().get(j),null);
				prestamo.getCuotas().get(j).setCuota(prestamo.getCuotas().get(j).getCuota()+prestamo.getCuotas().get(j).getSaldo());
				break;
			}
			calcularValoresCuota(interesMensual,prestamo.getCuotas().get(j),prestamo.getCuotas().get(j+1));
		}
	}
	
	public static void calcularValoresCuota(double interes,Cuota cuota,Cuota cuotaSiguiente) {
		cuota.setInteres(cuota.getCapital()*interes);
		cuota.setAbonoCapital(cuota.getCuota()-cuota.getInteres());
		cuota.setSaldo(cuota.getCapital()-cuota.getAbonoCapital());
		if(cuotaSiguiente!=null) {
			cuotaSiguiente.setCapital(cuota.getSaldo());
		}
	}
	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("N°| Cuota | Inicio | Interes | Abono | Saldo");
		for(int i=0;i<prestamo.getCuotas().size();i++) {
			prestamo.getCuotas().get(i).mostrarPrestamo();
		}
	}
}
