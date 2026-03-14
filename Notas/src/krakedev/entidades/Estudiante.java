package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	
	
	public Estudiante(String cedula,String nombre, String apellido) {
		notas=new ArrayList<Nota>();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	public void agregarNota(Nota nota) {
		boolean error=false;
		if(nota.getCalificacion()>=0 && nota.getCalificacion()<=10){
			if (notas.size()==0) {
				notas.add(nota);
			}else {
				
				for(int i=0;i<notas.size();i++) {
					if(notas.get(i).getMateria()==nota.getMateria()) {
						error=true;
						System.out.println("Materia duplicada");
						break;
					}
				}
				if(error==false) {
					notas.add(nota);
					System.out.println("Nota ingresada correctamente: "+nota.getMateria().getNombre()+" calificacion: "+nota.getCalificacion());
				}
			}
		}else{
			error=true;
			System.out.println("Nota ingresada no valida");
		}
		
	}
	public void modificarNota(String codigo,double nuevaNota) {
		boolean noencontrado=true;
		if(nuevaNota>=0 && nuevaNota<=10){
			for(int i=0;i<notas.size();i++) {
				if(codigo==notas.get(i).getMateria().getCodigo()) {
					notas.get(i).setCalificacion(nuevaNota);
					System.out.println("Nota modificada correctamente: "+notas.get(i).getMateria().getNombre()+" calificacion: "+notas.get(i).getCalificacion());
					noencontrado=false;
					break;
				}
			}
			if(noencontrado==true) {
				System.out.println("Materia no encontrada");
			}	
		}else {
			System.out.println("Nota ingresada no valida");
		}
		
		
	}
	public double calcularPromedioNotasEstudiante() {
		double sumatoria=0;
		double promedio;
		for(int i=0;i<notas.size();i++) {
			sumatoria+=notas.get(i).getCalificacion();
		}
		promedio=sumatoria/notas.size();
		return promedio;
	}
	public void mostrar() {
		//String mensaje="Estudiante [nombre= "+nombre+", apellido= "+apellido+", cedula= "+cedula+", notas= ";
		System.out.println("Estudiante [nombre= "+nombre+", apellido= "+apellido+", cedula= "+cedula+", notas= ");
		for(int i=0;i<notas.size();i++) {
			//mensaje+="\n\t> materia= "+notas.get(i).getMateria().getNombre()+"\\n\\t> calificacion= "+notas.get(i).getCalificacion();
			notas.get(i).mostrar();
		}
		System.out.println("]");
		//System.out.println(mensaje);
	}
	
	
}
