package py.edu.ucsa.test4.clases;

import py.edu.ucsa.test4.interfaces.Calculable;

public class Comercio extends Cliente  {
	private int porcentajeComercio;

	
	public int getPorcentajeComercio() {
		return porcentajeComercio;
	}


	public void setPorcentajeComercio(int porcentajeComercio) {
		this.porcentajeComercio = porcentajeComercio;
	}


	@Override
	public void calcularConsumo() {
		for (Lectura l : super.getLecturas()) {
			int porcentaje = ((super.getPrecioKwh() * l.getConsumoKWH())* (porcentajeComercio/100));
			int consumo = super.getPrecioKwh() * l.getConsumoKWH()+porcentaje;
			super.setMontoConsumo(consumo);
		}
		
	}


	public Comercio(int porcentajeComercio) {
		super();
		this.porcentajeComercio = porcentajeComercio;
	}


	@Override
	public String toString() {
		return "Comercio [porcentajeComercio=" + porcentajeComercio + ", toString()=" + super.toString() + "]";
	}
	
	

}
