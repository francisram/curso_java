package py.edu.ucsa.test4.clases;

import java.util.List;

import py.edu.ucsa.test4.interfaces.Calculable;

public class Facturador {
	public void procesarConsumos(List<Calculable> clientes) {
		
		for (Calculable calc : clientes) {
			if(calc instanceof TarifaSocial){System.out.println(true);			}else { System.out.println(false);}
			if(calc instanceof Residencial){System.out.println(true);			}else { System.out.println(false);}
			if(calc instanceof Comercio){System.out.println(true);			}else { System.out.println(false);}
			if(calc instanceof Industrial){System.out.println(true);			}else { System.out.println(false);}
		}
	
	}
	public void generarFacturas(List<Cliente> clientes) {
		
	}
}
