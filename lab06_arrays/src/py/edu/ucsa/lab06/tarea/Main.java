package py.edu.ucsa.lab06.tarea;

import java.util.Iterator;
import py.edu.ucsa.lab06.tarea.Movil;

public class Main {
	
	public static void main(String[] args) {
		Movil auto = new Movil(100, 10);
		Movil moto = new Movil(50, 100);
		Camino c = new Camino();
		c.setLogintud(100);
		int pos_auto = 0;
		int pos_moto = c.getLogintud();
		int vida = 0;
		for (int i = 0; i < c.getLogintud(); i++) {
			pos_auto++;
			pos_moto--;
			if(auto.chocar(pos_auto, pos_moto) ) {
				System.out.println("chocaron");
				vida = auto.getVida() - moto.getVida();
				if(vida <= 0) { System.out.println("El auto ya no tiene vida"); break; }
				vida =   moto.getVida() - auto.getVida();
				if(vida <= 0) { System.out.println("La moto ya no tiene vida"); break; }
			}
			System.out.println("auto: "+ pos_auto + ", moto :" + pos_moto  );
		}
		
		
	}

}
