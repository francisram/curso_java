package py.edu.ucsa.tarea.clases;

public class Entidad {
	private String nombre;
	private int presupuesto;
	private Administrador administrador;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	public Administrador getAdministrador() {
		return administrador;
	}
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	public Entidad(String nombre, int presupuesto, Administrador administrador) {
		super();
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.administrador = administrador;
	}
	public Entidad() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Entidad [nombre=" + nombre + ", presupuesto=" + presupuesto + ", administrador=" + administrador + "]";
	}

}
