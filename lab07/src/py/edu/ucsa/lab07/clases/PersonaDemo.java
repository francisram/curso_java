package py.edu.ucsa.lab07.clases;

public class PersonaDemo {

	public static void main(String[] args) {
		Persona p = new Persona("francis", 35);
		Persona p2 = new Persona("marcos", 6);
		System.out.println("el mayor es:");
		if(p.getEdad() > p2.getEdad()) {
			System.out.println(p.getNombre());
		}else {
			
		}

	}

}
