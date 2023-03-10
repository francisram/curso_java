package py.edu.ucsa.lab11.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import py.edu.ucsa.lab11.interfaces.Borrable;
import py.edu.ucsa.lab11.interfaces.Grabable;





public class PortaDiscos {
	
	private List<Borrable> listaDiscosBorrados;
	private List<Grabable> listaDiscosGrabados;
	
	public List<Borrable> getListaDiscosBorrados() {
		if (listaDiscosBorrados == null) {
			listaDiscosBorrados = new ArrayList<>();
		}
		return listaDiscosBorrados;
	}
	
	public List<Grabable> getListaDiscosGrabados() {
		if (Objects.isNull(listaDiscosGrabados)) {
			listaDiscosGrabados = new ArrayList<>();
		}
		return listaDiscosGrabados;
	}

}
