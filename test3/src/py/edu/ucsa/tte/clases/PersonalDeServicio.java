package py.edu.ucsa.tte.clases;

import py.edu.ucsa.tte.interfaces.Validable;

public class PersonalDeServicio extends Empleado implements Validable {
	private int cantidadLLegadasTardias = 0;
	private boolean cobraInsalubridad;
	private double montoInsalubridad;
	public int getCantidadLLegadasTardias() {
		return cantidadLLegadasTardias;
	}
	public void setCantidadLLegadasTardias(int cantidadLLegadasTardias) {
		this.cantidadLLegadasTardias = cantidadLLegadasTardias;
	}
	public boolean isCobraInsalubridad() {
		return cobraInsalubridad;
	}
	public void setCobraInsalubridad(boolean cobraInsalubridad) {
		this.cobraInsalubridad = cobraInsalubridad;
	}
	public double getMontoInsalubridad() {
		return montoInsalubridad;
	}
	public void setMontoInsalubridad(double montoInsalubridad) {
		this.montoInsalubridad = montoInsalubridad;
	}
	@Override
	public boolean validar(int horaMinuto) {
		if (this.isTolerancia()) {
			if (horaMinuto <= Marcacion.hora_entrada + this.getMinutosTolerancia()) {
				return false;
			} else {
				return true;
			}
		} else {
			if (horaMinuto <= Marcacion.hora_entrada) {
				return false;
			} else {
				return true;
			}
		}
	}
	@Override
	public String toString() {
		return "PersonalDeServicio [cantidadLLegadasTardias=" + cantidadLLegadasTardias + ", cobraInsalubridad="
				+ cobraInsalubridad + ", montoInsalubridad=" + montoInsalubridad + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
}
