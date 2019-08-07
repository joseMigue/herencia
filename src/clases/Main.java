package clases;

public class Main {

	public static void main(String[] args) {
		Estudiante jose = new Estudiante("jose", "1234567", "2942/4", "Abogacia");
		Profesor pablo = new Profesor("Pablo", "1234231", "matematica", 3);

		//usando metodos de la clase padre(Persona)
		System.out.println("Estudiante: "+jose.getNombre()+"  estudia la carrera: "+jose.getCarrera());
		System.out.println("Profesor: "+pablo.getNombre()+"  materia que dicta: "+pablo.getMateria());
	}

}
