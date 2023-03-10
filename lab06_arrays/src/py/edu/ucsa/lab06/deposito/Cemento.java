package py.edu.ucsa.lab06.deposito;

public class Cemento extends Material{
	 @Override
	public String toString() {
		return "Cemento [marca=" + marca + ", peso=" + peso + ", procedencia=" + procedencia + ", calidad=" + calidad
				+ "]";
	}
	public Cemento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cemento(String marca, double peso, String procedencia, String calidad) {
		super(marca);
		this.peso = peso;
		this.procedencia = procedencia;
		this.calidad = calidad;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getCalidad() {
		return calidad;
	}
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	private String marca;
	 private double peso;
	 private String procedencia;
	 private String calidad;
	
}
