package py.edu.ucsa.test.clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Test {
	public static final String DEFAULT_CHARSET = "UTF-8";

	public static void main(String[] args) {
		


		try {
			
			
			ManejadorRecursos mr = new ManejadorRecursos();			
			Path path = Paths.get(args[0]);
			Path pathb = Paths.get(args[1]);
			Path pathp = Paths.get(args[0]);
			
			Files.lines(path, Charset.forName(DEFAULT_CHARSET)).forEach(line -> {
				String[] menus = line.split(",");
				Menu m = new Menu(Integer.parseInt(menus[0]),menus[1],menus[2],"S".equals(menus[3]));
				//System.out.println(m.toString());
				mr.getRecursos().add(m);
			});
			
			Files.lines(pathb, Charset.forName(DEFAULT_CHARSET)).forEach(lineb -> {
				String[] botones = lineb.split(",");
				Pagina pag = new Pagina();
				pag.setNombre(botones[3]);
				Boton b = new Boton(Integer.parseInt(botones[0]),botones[1],botones[2],pag);
				//System.out.println(b.toString());
				
				mr.getRecursos().add(b);
			});
			Files.lines(pathp, Charset.forName(DEFAULT_CHARSET)).forEach(linep -> {
				//System.out.println(linep);
				String[] pags = linep.split(",");
				Pagina p = new Pagina(Integer.parseInt(pags[0]), pags[1], pags[2],"N".equals(pags[3]));
				//System.out.println(p.toString());
				
				mr.getRecursos().add(p);
			});
			
			
			
			ProcesarRecursos.mostrarRecursos(mr.getRecursos());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
