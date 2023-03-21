package py.edu.ucsa.test4.clases;

public class Comercio extends Cliente {
	private int porcentajeComercio;

	
	public int getPorcentajeComercio() {
		return porcentajeComercio;
	}


	public void setPorcentajeComercio(int porcentajeComercio) {
		this.porcentajeComercio = porcentajeComercio;
	}


	@Override
	public void calcularConsumo() {
		// TODO Auto-generated method stub
		
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
