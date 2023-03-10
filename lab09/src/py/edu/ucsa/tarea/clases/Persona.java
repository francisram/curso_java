package py.edu.ucsa.tarea.clases;

public class Persona {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
