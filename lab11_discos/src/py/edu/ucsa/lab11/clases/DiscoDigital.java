package py.edu.ucsa.lab11.clases;

import py.edu.ucsa.lab11.interfaces.Grabable;

public class DiscoDigital implements Grabable {
	
	private boolean ambosLados;
	private boolean cerrado;
	private double cantGrabada;
	private double capacidad;
	
	@Override
	public void mostrarInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void grabar() {
		// TODO Auto-generated method stub
		
	}
	public boolean isAmbosLados() {
		return ambosLados;
	}
	public void setAmbosLados(boolean ambosLados) {
		this.ambosLados = ambosLados;
	}
	public boolean isCerrado() {
		return cerrado;
	}
	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}
	public double getCantGrabada() {
		return cantGrabada;
	}
	public void setCantGrabada(double cantGrabada) {
		this.cantGrabada = cantGrabada;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	

}
