package py.edu.ucsa.lab12.clases;

import java.util.List;
import java.util.Objects;

public class Mecanica extends Parte {
private String origen;

public String getOrigen() {
	return origen;
}

public void setOrigen(String origen) {
	this.origen = origen;
}

@Override
public void mostrarDatos() {
	// TODO Auto-generated method stub
	super.mostrarDatos();
}

@Override
public List<Componente> getComponentes() {
	return super.getComponentes();
}



}
