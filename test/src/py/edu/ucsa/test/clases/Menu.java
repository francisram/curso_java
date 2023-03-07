package py.edu.ucsa.test.clases;

public class Menu extends Recurso {
	private String Descripcion;
	private boolean padre ;
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public boolean isPadre() {
		return padre;
	}
	public void setPadre(boolean padre) {
		this.padre = padre;
	}
}
