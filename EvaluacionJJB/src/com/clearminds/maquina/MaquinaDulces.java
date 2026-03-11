package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public void configurarMaquina(String codCelda1,String codCelda2,String codCelda3,String codCelda4) {
		Celda c1=new Celda(codCelda1);
		this.celda1=c1;
		Celda c2=new Celda(codCelda2);
		this.celda2=c2;
		Celda c3=new Celda(codCelda3);
		this.celda3=c3;
		Celda c4=new Celda(codCelda4);
		this.celda4=c4;
	}
	public void mostrarConfiguracion() {
		System.out.println("**Configuracion Maquina**");
		System.out.println("  >Celda 1: "+celda1.getCodigo());
		System.out.println("  >Celda 2: "+celda2.getCodigo());
		System.out.println("  >Celda 3: "+celda3.getCodigo());
		System.out.println("  >Celda 4: "+celda4.getCodigo());
		System.out.println("-------------------------");
	}
	
	public Celda buscarCelda(String codCelda) {
		if(celda1.getCodigo()==codCelda) {
			return celda1;
		}else if(celda2.getCodigo()==codCelda) {
			return celda2;
		}else if(celda3.getCodigo()==codCelda) {
			return celda3;
		}else if(celda4.getCodigo()==codCelda) {
			return celda4;
		}else {
			return null;
		}
	}
	public void cargarProducto(Producto prod,String codCelda,int cant) {
		Celda celdaRecuperada=this.buscarCelda(codCelda);
		celdaRecuperada.setProducto(prod);
		celdaRecuperada.setStock(cant);
	}
	public void mostrarProductos() {
		System.out.println("**Productos por Celda**");
		System.out.println("-------------------------");
		System.out.println("  >Celda 1: "+celda1.getCodigo());
		System.out.println("  ----Stock Actual: "+celda1.getStock());
		if(celda1.getProducto()==null) {
			System.out.println("  ---- La Celda no tiene Producto!");
		}else{
			System.out.println("  ----Producto: "+celda1.getProducto().getNombre());
			System.out.println("  ----Precio: "+celda1.getProducto().getPrecio());
			System.out.println("  ----Código: "+celda1.getProducto().getCodigo());
		}
		System.out.println("-------------------------");
		System.out.println("  >Celda 2: "+celda2.getCodigo());
		System.out.println("  ----Stock Actual: "+celda2.getStock());
		if(celda2.getProducto()==null) {
			System.out.println("  ---- La Celda no tiene Producto!");
		}else{
			System.out.println("  ----Producto: "+celda2.getProducto().getNombre());
			System.out.println("  ----Precio: "+celda2.getProducto().getPrecio());
			System.out.println("  ----Código: "+celda2.getProducto().getCodigo());
		}
		System.out.println("-------------------------");
		System.out.println("  >Celda 3: "+celda3.getCodigo());
		System.out.println("  ----Stock Actual: "+celda3.getStock());
		if(celda3.getProducto()==null) {
			System.out.println("  ---- La Celda no tiene Producto!");
		}else{
			System.out.println("  ----Producto: "+celda3.getProducto().getNombre());
			System.out.println("  ----Precio: "+celda3.getProducto().getPrecio());
			System.out.println("  ----Código: "+celda3.getProducto().getCodigo());
		}
		System.out.println("-------------------------");
		System.out.println("  >Celda 4: "+celda4.getCodigo());
		System.out.println("  ----Stock Actual: "+celda4.getStock());
		if(celda4.getProducto()==null) {
			System.out.println("  ---- La Celda no tiene Producto!");
		}else{
			System.out.println("  ----Producto: "+celda4.getProducto().getNombre());
			System.out.println("  ----Precio: "+celda4.getProducto().getPrecio());
			System.out.println("  ----Código: "+celda4.getProducto().getCodigo());
		}
		System.out.println("-------------------------");
		System.out.println("  >SALDO: $"+saldo);
		System.out.println("--------- FIN ----------");
		
	}
	public Producto buscarProductoEnCelda(String codCelda) {
		Celda celda=this.buscarCelda(codCelda);
		return celda.getProducto();
	}
	public double consultarPrecio(String codCelda) {
		Celda celda=this.buscarCelda(codCelda);
		return celda.getProducto().getPrecio();
	}
	public Celda buscarCeldaProducto(String codProducto) {
		if(celda1.getProducto().getCodigo()==codProducto) {
			return celda1;
		}else if(celda2.getProducto().getCodigo()==codProducto) {
			return celda2;
		}else if(celda3.getProducto().getCodigo()==codProducto) {
			return celda3;
		}else if(celda4.getProducto().getCodigo()==codProducto) {
			return celda4;
		}else {
			return null;
		}
	}
	public void incrementarProductos(String codProducto,int cantidad) {
		Celda celdaEncontrada=this.buscarCeldaProducto(codProducto);
		celdaEncontrada.setStock(cantidad);
	}
	public void vender(String codCelda) {
		Celda celdaEncontrada=this.buscarCelda(codCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		this.saldo+=this.consultarPrecio(codCelda);
	}
	public double venderConCambio(String codCelda,double valor) {
		this.vender(codCelda);
		double precio=this.consultarPrecio(codCelda);
		double cambio=valor-precio;
		return cambio;
	}

}
