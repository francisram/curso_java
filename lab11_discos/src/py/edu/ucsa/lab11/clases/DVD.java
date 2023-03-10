package py.edu.ucsa.lab11.clases;

import py.edu.ucsa.lab11.interfaces.Borrable;

public class DVD extends DiscoDigital implements Borrable{
	private String procedencia;

	public DVD(boolean ambosLados, boolean cerrado, double cantGrabada, double capacidad, String procedencia) {
		super(ambosLados, cerrado, cantGrabada, capacidad);
		this.procedencia = procedencia;
	}

	@Override
	public void grabar() {
		System.out.println("***** GRABANDO DVD *****");
		this.setCantGrabada(this.getCapacidad());
	}

	@Override
	public void borrar() {
		System.out.println("***** BORRANDO DVD *****");
		this.setCantGrabada(0);
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("PROCEDENCIA: " + this.procedencia);
	}
	

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

}
