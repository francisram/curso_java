package py.edu.ucsa.test.clases;

public class Pagina extends Recurso {
	
	private String nombre;
	private boolean modal;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isModal() {
		return modal;
	}
	public void setModal(boolean modal) {
		this.modal = modal;
	}
	public Pagina(int id, String abreviatura, String nombre, boolean modal) {
		super(id, abreviatura);
		this.nombre = nombre;
		this.modal = modal;
	}
	public Pagina() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pagina [nombre=" + nombre + ", modal=" + modal + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

	

}
