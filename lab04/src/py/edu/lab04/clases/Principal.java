package py.edu.lab04.clases;

public class Principal {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.setNombre("francis");
		p1.setApellido("lopez");
		p1.setSexo("masculino");
		p2.setNombre("blanca");
		p2.setApellido("lezcano");
		p2.setSexo("femenino");
		
		System.out.println("persona 1");
		System.out.println("================");
		System.out.println(p1.getNombre()+'|'+p1.getApellido()+'|'+p1.getSexo());
		System.out.println("================");
		System.out.println("persona 2");
		System.out.println("================");
		System.out.println(p2.getNombre()+'|'+p2.getApellido()+'|'+p2.getSexo());
		System.out.println("================");
		
	}
	
}
