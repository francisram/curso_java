package py.edu.ucsa.clases;

import py.edu.ucsa.interfaces.Peleador;
import py.edu.ucsa.interfaces.Volador;

public class Superman implements Volador, Peleador {
	@Override
	public void volar() {

	System.out.println("SUPERMAN VOLANDO");

	}

	@Override

	public void despegar() {

	System.out.println("SUPERMAN DESPEGANDO");

	}

	@Override

	public void aterrizar() {

	System.out.println("SUPERMAN ATERRIZANDO");

	}

	@Override
	public void pelear() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {

		Volador v = new Superman();

		v.volar();

		Peleador p = new Superman();

		p.pelear();

		}
}
