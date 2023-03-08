package py.edu.ucsa.test.clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Principal {

	public static void main(String[] args) {
		FileReader reader;
		FileReader readerb;
		FileReader readerp;
		try (reader = new FileReader(args[0]);	
				readerb = new FileReader(args[1]);
				readerp = new FileReader(args[2]);
				BufferedReader bufReader = new BufferedReader(reader);
				BufferedReader bufReaderboton = new BufferedReader(readerb);
				BufferedReader bufReaderpag = new BufferedReader(readerp)
				){
			/*
			 * reader = new FileReader("C:\\clase_java\\Menus.txt"); readerb = new
			 * FileReader("C:\\clase_java\\Botones.txt"); readerp = new
			 * FileReader("C:\\\\clase_java\\\\Paginas.txt");
			 */
			
			String line = null;
			String lineb = null;
			String linep = null;
			line = bufReader.readLine();
			ManejadorRecursos mr = new ManejadorRecursos();
			while (line != null) {
				String[] menus = line.split(",");
				boolean p = (menus[3] == "s") ? true : false;
				Menu m = new Menu(Integer.parseInt(menus[0]),menus[1],menus[2],p);
				//System.out.println(m.toString());
				mr.getRecursos().add(m);
				
								
				line = bufReader.readLine();
			}
			
			mr.getRecursos();
					
			
			lineb = bufReaderboton.readLine();
			while (lineb !=null ) {
				//System.out.println(lineb);
				String[] botones = lineb.split(",");
				Pagina pag = new Pagina();
				pag.setNombre(botones[3]);
				Boton b = new Boton(Integer.parseInt(botones[0]),botones[1],botones[2],pag);
				//System.out.println(b.toString());
				
				mr.getRecursos().add(b);
				lineb = bufReaderboton.readLine();
				
			}
			
			linep = bufReaderpag.readLine();
			
			while (linep != null) {
				//System.out.println(linep);
				String[] pags = linep.split(",");
				boolean modal = (pags[3] == "N") ? false : true;
				Pagina p = new Pagina(Integer.parseInt(pags[0]), pags[1], pags[2],modal);
				//System.out.println(p.toString());
				
				mr.getRecursos().add(p);
				linep = bufReaderpag.readLine();
			}
			
		/*	bufReader.close();
			bufReaderboton.close();
			bufReaderpag.close();*/
			
			ProcesarRecursos.mostrarRecursos(mr.getRecursos());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
