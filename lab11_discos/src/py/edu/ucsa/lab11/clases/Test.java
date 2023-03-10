package py.edu.ucsa.lab11.clases;

import java.util.ArrayList;
import java.util.List;

import py.edu.ucsa.lab11.interfaces.Borrable;
import py.edu.ucsa.lab11.interfaces.Grabable;



public class Test {
	public static void main(String[] args) {
		Cd cd1 = new Cd(true, false, 0, 1400, "ETI");
		Cd cd2 = new Cd(false, false, 0, 800, "SHIMPO");

		DVD dvd1 = new DVD(true, false, 0, 8600, "CHINA");
		DVD dvd2 = new DVD(false, false, 0, 4300, "TAIWAN");

		Bd bd1 = new Bd(true, false, 0, 50000, "MAGNETICO");
		Bd bd2 = new Bd(false, false, 0, 25000, "METALICO");

		PortaDiscos portaDiscos = new PortaDiscos();
		Grabador grab = new Grabador();

		List<Grabable> discosAGrabar = new ArrayList<>();
		discosAGrabar.add(bd2);
		discosAGrabar.add(bd1);
		discosAGrabar.add(dvd2);
		discosAGrabar.add(dvd1);
		discosAGrabar.add(cd2);
		discosAGrabar.add(cd1);

		grab.grabarDiscosYAgregar(discosAGrabar, portaDiscos);

		grab.mostrarInfoDiscosGrabables(portaDiscos);

		List<Borrable> discosABorrar = new ArrayList<>();
		discosABorrar.add(dvd2);
		discosABorrar.add(dvd1);
		discosABorrar.add(cd2);
		discosABorrar.add(cd1);


		grab.borrarDiscosYAgregar(discosABorrar, portaDiscos);
		grab.mostrarInfoDiscosBorrables(portaDiscos);
	}
}
