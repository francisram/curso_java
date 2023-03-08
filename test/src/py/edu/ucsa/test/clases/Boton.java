package py.edu.ucsa.test.clases;

public class Boton extends Recurso {
	private String texto;
	private Pagina pag;
	
	
	
	public Boton(int id, String abreviatura, String texto, Pagina pag) {
		super(id, abreviatura);
		this.texto = texto;
		this.pag = pag;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Pagina getPag() {
		return pag;
	}
	public void setPag(Pagina pag) {
		this.pag = pag;
	}
	@Override
	public String toString() {
		return "Boton [texto=" + texto + ", pag=" + pag + ", toString()=" + super.toString() + "]";
	}
	
	

}
