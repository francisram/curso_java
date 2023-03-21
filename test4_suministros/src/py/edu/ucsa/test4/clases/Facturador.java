package py.edu.ucsa.test4.clases;

import java.util.List;

import py.edu.ucsa.test4.interfaces.Calculable;

public class Facturador {
	public void procesarConsumos(List<Calculable> clientes) {
		
		for (Calculable c : clientes) {
			System.out.println(c.toString());
		}
	}
	public void generarFacturas(List<Cliente> clientes) {
		
	}
}
