package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces(){
		celdas = new ArrayList<Celda>();
	}
	
	public void agregarCelda(String codCelda) {
		Celda celda= new Celda(codCelda);
		celdas.add(celda);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("**Configuracion Maquina**");
		for(int i=0;i<celdas.size();i++) {
			System.out.println("  >Celda "+(i+1)+": "+celdas.get(i).getCodigo());
		}

		System.out.println("-------------------------");
	}
	public Celda buscarCelda(String codCelda) {
		Celda celdaEncontrada=null;
		for(int i=0;i<celdas.size();i++) {
			if(celdas.get(i).getCodigo()==codCelda) {
				celdaEncontrada=celdas.get(i);
			}
		}
		return celdaEncontrada;
	}
	public void cargarProducto(Producto prod,String codCelda,int cant) {
		Celda celdaRecuperada=this.buscarCelda(codCelda);
		celdaRecuperada.setProducto(prod);
		celdaRecuperada.setStock(cant);
	}
	public void mostrarProductos() {
		System.out.println("**Productos por Celda**");
		System.out.println("-------------------------");
		for(int i=0;i<celdas.size();i++) {
			System.out.println("  >Celda "+(i+1)+": "+celdas.get(i).getCodigo());
			System.out.println("  ----Stock Actual: "+celdas.get(i).getStock());
			if(celdas.get(i).getProducto()==null) {
				System.out.println("  ---- La Celda no tiene Producto!");
			}else{
				System.out.println("  ----Producto: "+celdas.get(i).getProducto().getNombre());
				System.out.println("  ----Precio: "+celdas.get(i).getProducto().getPrecio());
				System.out.println("  ----Código: "+celdas.get(i).getProducto().getCodigo());
			}
		}
		System.out.println("-------------------------");
		System.out.println("  >SALDO: $"+saldo);
		System.out.println("--------- FIN ----------");
	}
	public Producto buscarProductoEnCelda(String codCelda) {
		Celda celda=this.buscarCelda(codCelda);
		if(celda!=null) {
			return celda.getProducto();
		}else {
			return null;
		}
	
	}
	public double consultarPrecio(String codCelda) {
		Celda celda=this.buscarCelda(codCelda);
		return celda.getProducto().getPrecio();
	}
	public Celda buscarCeldaProducto(String codProducto) {
		Celda celdaEncontrada=null;
		Celda elementoCelda=null;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getProducto()!=null && elementoCelda.getProducto().getCodigo()==codProducto) {
				celdaEncontrada=elementoCelda;
			}
		}
		return celdaEncontrada;
	}
	public void incrementarProductos(String codProducto,int cantidad) {
		Celda celdaEncontrada=this.buscarCeldaProducto(codProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidad);
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
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> menores= new ArrayList<Producto>();
		Producto elementoProducto=null;
		for(int i=0;i<celdas.size();i++) {
			elementoProducto=celdas.get(i).getProducto();
			if(elementoProducto.getPrecio()<limite) {
				menores.add(elementoProducto);
			}
		}
		return menores;
	}
}
