package py.edu.ucsa.clases;

import py.edu.ucsa.interfaces.Lanzador;
import py.edu.ucsa.interfaces.Mentiroso;
import py.edu.ucsa.interfaces.Peleador;
import py.edu.ucsa.interfaces.Volador;

public class Batalla {
	public void hacerVolar(Volador v1, Volador v2){

		v1.volar();

		v2.volar();

		}

		public void hacerPelear(Peleador p1, Peleador p2){

		p1.pelear();

		p2.pelear();

		}

		public void hacerMentir(Mentiroso m1, Mentiroso m2){

		m1.mentir();

		m2.mentir();

		}

		public void hacerLanzar(Lanzador l1, Lanzador l2){

		l1.lanzar();

		l2.lanzar();

		}
}
