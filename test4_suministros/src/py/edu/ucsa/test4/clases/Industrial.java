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
		for (Lectura l : super.getLecturas()) {
			int r = 0;
			int subsidio = (l.getConsumoKWH() *  (porcentajeSubcidio/100));
			int nosub =(l.getConsumoKWH() *  (5/100));
			
			if(l.getConsumoKWH()>1000) {
				r = (l.getConsumoKWH() - subsidio )* super.getPrecioKwh();
			}else {
				r = (l.getConsumoKWH() -nosub) * super.getPrecioKwh();
			}
			super.setMontoConsumo(r);
		}
		
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
