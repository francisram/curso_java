package py.edu.lab05.clases;

public class Bicicleta {

	private int velocidad;
	
	public void acelerar() {
		velocidad++;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public void frenanGolpe() {
		this.velocidad = 0;
	}
	
	public void frenar(int vel) {
		if(vel>=velocidad){
			velocidad = 0;
		}else {
			velocidad= velocidad - vel;
		}
	}
	
}
