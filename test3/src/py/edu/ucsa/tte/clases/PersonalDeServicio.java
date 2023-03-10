package py.edu.ucsa.tte.clases;

public class PersonalDeServicio extends Empleado {
	private int cantidadLLegadasTardias;
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
	
	
}
