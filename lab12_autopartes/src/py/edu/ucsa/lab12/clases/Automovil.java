package py.edu.ucsa.lab12.clases;

import py.edu.ucsa.lab12.interfaces.Arreglable;

public class Automovil extends Vehiculo implements Arreglable{
	
	private boolean deportivo;

	public boolean isDeportivo() {
		return deportivo;
	}

	public void setDeportivo(boolean deportivo) {
		this.deportivo = deportivo;
	}
	


	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		super.acelerar();
	}

	@Override
	public void arreglar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarPartes() {
		// TODO Auto-generated method stub
		super.mostrarPartes();
	}
	
	
	

	
	

}
