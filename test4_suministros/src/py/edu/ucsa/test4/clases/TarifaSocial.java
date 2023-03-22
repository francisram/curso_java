package py.edu.ucsa.test4.clases;



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
		for (Lectura l : super.getLecturas()) {
			int r = 0;
			int tolerancia = (300 * (porcentajeTolerancia/100));
			int limiteConsumo = 300 + tolerancia;
			if(l.getConsumoKWH()>limiteConsumo) {
				r = l.getConsumoKWH() * super.getPrecioKwh();
			}else {
				r = (l.getConsumoKWH() * super.getPrecioKwh())/2;
			}
			super.setMontoConsumo(r);
		}
		
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
