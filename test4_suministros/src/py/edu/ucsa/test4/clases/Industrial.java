package py.edu.ucsa.test4.clases;



public class Industrial extends Cliente   {
	private int porcentajeSubcidio;
	
	
	public int getPorcentajeSubcidio() {
		return porcentajeSubcidio;
	}



	public void setPorcentajeSubcidio(int porcentajeSubcidio) {
		this.porcentajeSubcidio = porcentajeSubcidio;
	}



	@Override
	public void calcularConsumo() {
		// TODO Auto-generated method stub
		
	}



	public Industrial(int porcentajeSubcidio) {
		super();
		this.porcentajeSubcidio = porcentajeSubcidio;
	}



	@Override
	public String toString() {
		return "Industrial [porcentajeSubcidio=" + porcentajeSubcidio + ", toString()=" + super.toString() + "]";
	}




	

}
