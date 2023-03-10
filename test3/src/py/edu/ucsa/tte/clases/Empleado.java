package py.edu.ucsa.tte.clases;

public class Empleado {
	private int legajo;
	private String nombre;
	private boolean tolerancia ;
	private int minutosTolerancia ;
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isTolerancia() {
		return tolerancia;
	}
	public void setTolerancia(boolean tolerancia) {
		this.tolerancia = tolerancia;
	}
	public int getMinutosTolerancia() {
		return minutosTolerancia;
	}
	public void setMinutosTolerancia(int minutosTolerancia) {
		this.minutosTolerancia = minutosTolerancia;
	}
	

}
