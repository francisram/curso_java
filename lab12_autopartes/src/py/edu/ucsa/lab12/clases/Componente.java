package py.edu.ucsa.lab12.clases;

public class Componente {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarDatos() {
		System.out.println("Componente :" + nombre);
	}

	public Componente(String nombre) {
		this.nombre = nombre;
	}
	
	

}
