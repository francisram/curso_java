package py.edu.ucsa.test.clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		FileReader reader;
		FileReader readerb;
		FileReader readerp;
		try {
			reader = new FileReader("C:\\tarea\\Menus.txt");
			readerb = new FileReader("C:\\tarea\\Botones.txt");
			readerp = new FileReader("C:\\\\tarea\\\\Paginas.txt");
			BufferedReader bufReader = new BufferedReader(reader);
			BufferedReader bufReaderboton = new BufferedReader(readerb);
			BufferedReader bufReaderpag = new BufferedReader(readerp);
			String line = null;
			String lineb = null;
			String linep = null;
			line = bufReader.readLine();
			ManejadorRecursos mr = new ManejadorRecursos();
			while (line != null) {
				String[] menus = line.split(",");
				Menu m = new Menu();
				m.setId(Integer.parseInt(menus[0]));
				m.setAbreviatura(menus[1]);
				m.setDescripcion(menus[2]);
				boolean p = (menus[3] == "s") ? true : false;
				m.setPadre(p);
				mr.getRecursos().add(m);

				line = bufReader.readLine();
			}
			mr.getRecursos();
			lineb = bufReaderboton.readLine();
			while (lineb !=null ) {
				System.out.println(lineb);
				lineb = bufReaderboton.readLine();
				
			}
			
			
			bufReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
