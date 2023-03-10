package py.edu.ucsa.clases;

import py.edu.ucsa.interfaces.Mentiroso;
import py.edu.ucsa.interfaces.Peleador;
import py.edu.ucsa.interfaces.Volador;

public class Loki implements Volador,Peleador,Mentiroso {

	@Override
	public void mentir() {
		System.out.println("LOKI MINTIENDO");
		
	}

	@Override
	public void pelear() {
		System.out.println("LOKI PELEANDO");
		
	}

	@Override
	public void volar() {
		System.out.println("LOKI VOLANDO");
		
	}

	@Override
	public void despegar() {
		System.out.println("LOKI DESPEGANDO");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("LOKI ATERRIZANDO");
		
	}

}
