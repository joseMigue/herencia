package clases;

public class Estudiante extends Persona {

	private String legajo;
	private String carrera;

	
	public Estudiante(String nombre,String dni,String legajo, String carrera) {
		super(nombre,dni);
		this.legajo = legajo;
		this.carrera = carrera;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
}
