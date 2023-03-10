package py.edu.ucsa.tarea.clases;

public class Zoologico {
	private String nombre;
	private Director director;
	private int cantidadEspecies;
	private String direccion;
	private Fundador fundador;
	private Entidad entidad;
	public Entidad getEntidad() {
		return entidad;
	}
	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public int getCantidadEspecies() {
		return cantidadEspecies;
	}
	public void setCantidadEspecies(int cantidadEspecies) {
		this.cantidadEspecies = cantidadEspecies;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Fundador getFundador() {
		return fundador;
	}
	public void setFundador(Fundador fundador) {
		this.fundador = fundador;
	}
	public Zoologico() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Zoologico [nombre=" + nombre + ", director=" + director + ", cantidadEspecies=" + cantidadEspecies
				+ ", direccion=" + direccion + ", fundador=" + fundador + ", entidad=" + entidad + "]";
	}
	
	
}
