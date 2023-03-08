package py.edu.ucsa.test.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ManejadorRecursos {
	private List<Recurso> recursos;

	public List<Recurso> getRecursos() {
		
		if(Objects.isNull(recursos)) {
			recursos = new ArrayList<>();
		}
		
		return recursos;
	}
	
	
 
}
