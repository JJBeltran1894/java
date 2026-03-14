package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;
	
	public Curso() {
		estudiantes=new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		String mensaje=null;
		if(estudiantes.size()==0) {
		
		}else {
			for(int i=0;i<estudiantes.size();i++) {
				if(estudiante.getCedula()==estudiantes.get(i).getCedula()) {
					mensaje="Estudiante con CI: "+estudiante.getCedula()+" encontrado";
				}
			}
		}
		return mensaje;
		
	}
	public void matricularEstudiante(Estudiante estudiante) {
		String resultadoBusqueda=buscarEstudiantePorCedula(estudiante);
		if (resultadoBusqueda==null) {
			estudiantes.add(estudiante);
			System.out.println("Se ha matriculado al estudiante con CI: "+estudiante.getCedula());
		}else {
			System.out.println("Estudiante ya existe:");
			System.out.println("\t>"+resultadoBusqueda);
		}
	}
	public double calcularPromedioCurso() {
		double sumatoria=0;
		double promedio;
		for(int i=0;i<estudiantes.size();i++) {
			sumatoria+=estudiantes.get(i).calcularPromedioNotasEstudiante();
		}
		promedio=sumatoria/estudiantes.size();
		return promedio;
	}
	public void mostrar() {
		System.out.println("Curso [estudiantes=[");
		for(int i=0;i<estudiantes.size();i++) {
			estudiantes.get(i).mostrar();
		}
		System.out.println("]");
	}
}
