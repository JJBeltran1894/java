package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.entidades.CalculadoraAmortizacion;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;
	
	public Banco() {
		clientes= new ArrayList<Cliente>();
		prestamos= new ArrayList<Prestamo>();
	}
	
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public Cliente buscarCliente(String cedula) {
		Cliente clienteEncontrado=null;
		if(clientes.size()==0) {
		
		}else {
			for(int i=0;i<clientes.size();i++) {
				if(clientes.get(i).getCedula()==cedula) {
					clienteEncontrado=clientes.get(i);
				}
			}
		}
		return clienteEncontrado;
	}
	public void registrarCliente(Cliente cliente) {
		Cliente resultadoBusqueda=buscarCliente(cliente.getCedula());
		if (resultadoBusqueda==null) {
			clientes.add(cliente);
			System.out.println("Se ha registrado al cliente con CI: "+cliente.getCedula());
		}else {
			System.out.println("Clientecon CI: "+cliente.getCedula()+" ya existe");
		}
	}
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente resultadoBusqueda=buscarCliente(cedula);
		if (resultadoBusqueda==null) {
			System.out.println("No es cliente del Banco");
		}else {
			prestamo.setCedulaCliente(cedula);
			prestamos.add(prestamo);
			CalculadoraAmortizacion.generarTabla(prestamo);
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedula){
		ArrayList<Prestamo> prestamosCliente=new ArrayList<Prestamo>();
		Cliente resultadoBusqueda=buscarCliente(cedula);
		if (resultadoBusqueda==null) {
			System.out.println("No existe cliente");
		}else {
			if(prestamos.size()==0) {
				System.out.println("Cliente no registra Creditos");
			}else {
				for(int i=0;i<prestamos.size();i++) {
					if(prestamos.get(i).getCedulaCliente().equals(cedula)) {
						prestamosCliente.add(prestamos.get(i));
					}
				}
			}
		}
		return prestamosCliente;
	}
	
}
