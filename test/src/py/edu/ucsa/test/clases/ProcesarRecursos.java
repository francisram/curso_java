package py.edu.ucsa.test.clases;

import java.util.Arrays;
import java.util.List;


public class ProcesarRecursos {
	//private static Recurso recursos;

	public ProcesarRecursos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void mostrarRecursos(List<Recurso> recursos) {
		System.out.println("Recursos");
		try {
			Arrays.asList(recursos).forEach((x)->System.out.println(x.toString()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
