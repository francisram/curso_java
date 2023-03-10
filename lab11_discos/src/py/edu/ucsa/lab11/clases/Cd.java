package py.edu.ucsa.lab11.clases;

import py.edu.ucsa.lab11.interfaces.Borrable;


public class Cd extends DiscoDigital implements Borrable {

	private String marca;

	public Cd(boolean ambosLados, boolean cerrado, double cantGrabada, double capacidad, String marca) {
		super(ambosLados, cerrado, cantGrabada, capacidad);
		this.marca = marca;
	}

	@Override
	public void grabar() {
		System.out.println("=== GRABANDO ===  ");
		this.setCantGrabada(this.getCapacidad());
	}

	@Override
	public void borrar() {
		System.out.println("==== BORRANDO  ====");
		this.setCantGrabada(0);
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("MARCA: " + this.marca);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
