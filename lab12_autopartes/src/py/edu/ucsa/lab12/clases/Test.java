package py.edu.ucsa.lab12.clases;

public class Test {
	

	public static void main(String[] args) {
		
	Componente c1 = new Componente("espaciador");
	Componente c2 = new Componente("valvula");
	Componente c3 = new Componente("piston");
	Componente c4 = new Componente("toron");
	Componente c5 = new Componente("alambre central");
	Componente c6 = new Componente("alma");
	

		
	Mecanica pMec = new Mecanica();
	pMec.setNombre("cabo acelerador");
	pMec.setMaterial("acero");
	pMec.setOrigen("brasil");
	pMec.getComponentes().add(c4);
	pMec.getComponentes().add(c5);
	pMec.getComponentes().add(c6);
	
	
	Automatica pAut = new Automatica();
	pAut.setNombre("pico inyector");
	pAut.setMaterial("policarbonato, alumnio");
	pAut.setAnhoVidaUtil(10);
	pAut.getComponentes().add(c1);
	pAut.getComponentes().add(c2);
	pAut.getComponentes().add(c3);

	
	Automovil a1 = new Automovil();
	a1.setMarca("toyota");
	a1.setModelo("land Cruiser|");
	a1.setDuenho("Francis Lopez");
	a1.setDeportivo(false);
	a1.getPartes().add(pMec);
	a1.getPartes().add(pAut);


	System.out.println( a1.getMarca()+ "|" + a1.getModelo() + "|" + a1.getDuenho());
	a1.mostrarPartes();
	
	
		
		
	}

}
