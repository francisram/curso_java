package py.edu.ucsa.test.clases;

public class Recurso {
	
	private int id;
	private String abreviatura;
	
		
	public Recurso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recurso(int id, String abreviatura) {
		super();
		this.id = id;
		this.abreviatura = abreviatura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	@Override
	public String toString() {
		return "Recurso [id=" + id + ", abreviatura=" + abreviatura + "]";
	}
	
	

	
}
