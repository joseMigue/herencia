package clases;

public class Profesor extends Persona {

	private  String materia;
	private int antiguedad;
	
	public Profesor(String nombre, String dni, String materia, int antiguedad) {
		super(nombre, dni);
		this.materia = materia;
		this.antiguedad = antiguedad;
	}
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
}
