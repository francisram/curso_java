package py.edu.ucsa.tarea.clases;

public class Animal {
	private String nombre;
	private String especie;
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + "]";
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String nombre, String especie) {
		super();
		this.nombre = nombre;
		this.especie = especie;
	}
	

}
