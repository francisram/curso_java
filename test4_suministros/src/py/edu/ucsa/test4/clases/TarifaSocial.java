package py.edu.ucsa.test4.clases;

import py.edu.ucsa.test4.interfaces.Calculable;

public class TarifaSocial extends Cliente {
	private int porcentajeTolerancia;

	public int getPorcentajeTolerancia() {
		return porcentajeTolerancia;
	}

	public void setPorcentajeTolerancia(int porcentajeTolerancia) {
		this.porcentajeTolerancia = porcentajeTolerancia;
	}

	@Override
	public void calcularConsumo() {
		// TODO Auto-generated method stub
		
	}

	public TarifaSocial(int porcentajeTolerancia) {
		super();
		this.porcentajeTolerancia = porcentajeTolerancia;
	}

	@Override
	public String toString() {
		return "TarifaSocial [porcentajeTolerancia=" + porcentajeTolerancia + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	

}
