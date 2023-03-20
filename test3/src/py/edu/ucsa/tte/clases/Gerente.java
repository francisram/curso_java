package py.edu.ucsa.tte.clases;

public class Gerente extends Empleado {
	private double sobreSueldo;
	private String area;
	public double getSobreSueldo() {
		return sobreSueldo;
	}
	public void setSobreSueldo(double sobreSueldo) {
		this.sobreSueldo = sobreSueldo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Gerente [sobreSueldo=" + sobreSueldo + ", area=" + area + ", toString()=" + super.toString() + "]";
	}

	
	
}
