package py.edu.ucsa.tarea.principal;

import py.edu.ucsa.tarea.clases.Administrador;
import py.edu.ucsa.tarea.clases.Animal;
import py.edu.ucsa.tarea.clases.Director;
import py.edu.ucsa.tarea.clases.Entidad;
import py.edu.ucsa.tarea.clases.Fundador;
import py.edu.ucsa.tarea.clases.Zoologico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zoologico zoo = new Zoologico();
		Director d = new Director();
		Administrador adm = new Administrador("NENEcho ");
		Entidad e = new Entidad("Munipalidad de Asuncion", 50000000,adm );
		d.setNombre("francis lopez");
		Fundador f = new Fundador();
		f.setNombre("Marcos");
		zoo.setDirector(d);
		zoo.setFundador(f);
		zoo.setNombre("jardin Botanico");
		zoo.setDireccion("Av Primer Presidente, entre Ruta y Av. artigas, Transchaco, Asunción");
		Animal a[] = new Animal[5];
		a[0] = new Animal("Avestruz", "ave estrutioniforme de la familia Struthionidae");
		a[1] = new Animal("Elefante", "el pigmeo de Borneo");
		a[2] = new Animal("Elefante", "lodoxonta africana");
		a[3] = new Animal("Capibara", "Caviidae");
		a[4] = new Animal("Serpiente de cascabel", "Caviidae");
		zoo.setCantidadEspecies(a.length);
		zoo.setEntidad(e);
		System.out.println(zoo.toString());

		
	}

}
