package py.edu.ucsa.test2.clases;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ManejadorDePersonajes {

	private List<Personaje> personajes;

	public List<Personaje> getListaPersonajes() {
		if (Objects.isNull(personajes)) {
			personajes = new ArrayList<>();
		}
		return personajes;
	}

	public void generarPersonajes() {
		try {
			
			FileReader reader = new FileReader("C:\\clase_java\\wow\\fracciones.txt");
			BufferedReader bufReader = new BufferedReader(reader);
			String line = null;
			line = bufReader.readLine();
			while (line != null) {
				// ("alianza".equals(line.toLowerCase())) {
			
					FileReader r = new FileReader("C:\\clase_java\\wow\\RAZAS_"+line.toUpperCase()+".txt");
					BufferedReader br = new BufferedReader(r);
					String p = null;
					p = br.readLine();
					int indice = 0 ;
					while (p != null) {
						Personaje person = new Personaje();
						person.setId(indice);
						indice++;
						person.setRaza(p);
						person.setFraccion(line);
						System.out.println(person);
						this.getListaPersonajes().add(person);
						p = br.readLine();
					}
					br.close();
					r.close();

				
				line = bufReader.readLine();
			}
			bufReader.close();
			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void escribirArchivosPersonajes() {
			
		try {
			//path contenido
			this.getListaPersonajes().forEach((x)->x.escribirAArchivo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public ManejadorDePersonajes() {
		super();
		// TODO Auto-generated constructor stub
	}

}
