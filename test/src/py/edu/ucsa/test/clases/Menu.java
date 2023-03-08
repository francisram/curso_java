package py.edu.ucsa.test.clases;

public class Menu extends Recurso {
	private String Descripcion;
	private boolean padre ;
	
	
		
	
	public Menu(int id, String abreviacion ,String descripcion, boolean padre) {
		super(id, abreviacion);
		Descripcion = descripcion;
		this.padre = padre;
	}
	

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


	@Override
	public String toString() {
		return "Menu [Descripcion=" + Descripcion + ", padre=" + padre + ", toString()=" + super.toString() + "]";
	}

  

	
	
	
	
	
	
}
