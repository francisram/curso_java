package py.edu.ucsa.tte.clases;

import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Marcacion> marcaciones =   Marcacion.leerMarcaciones();
		Validador validador = new Validador();
		validador.procesarMarcaciones(marcaciones);
	}
	
	
	

}
