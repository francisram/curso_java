package py.edu.ucsa.clases;

import py.edu.ucsa.interfaces.Lanzador;
import py.edu.ucsa.interfaces.Peleador;
import py.edu.ucsa.interfaces.Volador;

public class Thor implements Volador,Lanzador,Peleador {

	@Override
	public void pelear() {
		System.out.println("THOR PELEANDO");
		
	}

	@Override
	public void lanzar() {
		System.out.println("THOR LANZADO");
		
	}

	@Override
	public void volar() {
		System.out.println("THOR VOLANDO");
		
	}

	@Override
	public void despegar() {
		System.out.println("THOR DESPEGANDO");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("THOR ATERRIZANDO");
		
	}

}
