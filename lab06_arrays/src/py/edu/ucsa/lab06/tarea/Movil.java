package py.edu.ucsa.lab06.tarea;

public class Movil {
	
	private int masa ;
	private int vida;
	public int getMasa() {
		return masa;
	}
	public void setMasa(int masa) {
		this.masa = masa;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	@Override
	public String toString() {
		return "Movil [masa=" + masa + ", vida=" + vida + "]";
	}
	public Movil(int masa, int vida) {
		super();
		this.masa = masa;
		this.vida = vida;
	}
	
	static boolean chocar(int m1, int m2) {
		if(m1 == m2) {
			return true;
			}else {
				return false;
				}
	};
	

}
