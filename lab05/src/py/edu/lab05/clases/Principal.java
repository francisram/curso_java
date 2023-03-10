package py.edu.lab05.clases;

import java.util.Iterator;

public class Principal {
	public static void main(String[] args) {
		Bicicleta bici = new Bicicleta();
		for (int i = 0; i < 10; i++) {
			bici.acelerar();
			bici.frenanGolpe();
		}
		System.out.println(bici.getVelocidad());
	}

}
