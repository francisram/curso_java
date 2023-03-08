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
				
				String[] botones = lineb.split(",");
				Boton b = new Boton();
				b.setId(Integer.parseInt(botones[0]));
				b.setAbreviatura(botones[1]);
				b.setTexto(botones[2]);
				Pagina pag = new Pagina();
				pag.setNombre(botones[3]);
				b.setPag(pag);
				
				lineb = bufReaderboton.readLine();
				
			}
			
			linep = bufReaderpag.readLine();
			
			while (linep != null) {
				System.out.println(linep);
				
				String[] pags = linep.split(",");
				
				Pagina p = new Pagina();
				p.setId(Integer.parseInt(pags[0]));
				p.setAbreviatura(pags[1]);
				p.setNombre(pags[2]);
				boolean modal = (pags[3] == "N") ? false : true;
				p.setModal(modal);
				linep = bufReaderpag.readLine();
			}
			
			
			bufReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
