package py.edu.ucsa.lab06.tarea;

public class Camino {

	public Camino() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int logintud;
	private int posicion;
	public int getLogintud() {
		return logintud;
	}
	public Camino(int logintud, int posicion) {
		super();
		this.logintud = logintud;
		this.posicion = posicion;
	}
	public void setLogintud(int logintud) {
		this.logintud = logintud;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
}
