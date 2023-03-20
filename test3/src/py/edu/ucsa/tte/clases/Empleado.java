package py.edu.ucsa.tte.clases;

import java.util.Objects;

public class Empleado {
	private int legajo;
	private String nombre;
	private String apellido;
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", tolerancia="
				+ tolerancia + ", minutosTolerancia=" + minutosTolerancia + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(legajo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return legajo == other.legajo;
	}
	
	
	

}
