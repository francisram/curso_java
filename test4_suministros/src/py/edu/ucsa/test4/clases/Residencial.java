package py.edu.ucsa.test4.clases;

public class Residencial extends Cliente {

	@Override
	public void calcularConsumo() {
		for (Lectura l : super.getLecturas()) {
			super.setMontoConsumo(l.getConsumoKWH() * super.getPrecioKwh());
		}

	}

	@Override
	public String toString() {
		return "Residencial [toString()=" + super.toString() + "]";
	}

}
