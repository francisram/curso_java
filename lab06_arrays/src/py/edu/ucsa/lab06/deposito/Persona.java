package py.edu.ucsa.lab06.deposito;

public class Persona extends Object {

	private String nro_cedula = "1111" ;
	private String nombre = "-- ingrese nombre" ;
	private String direccion ;
	private int anho_nacimiento;
	public String getNro_cedula() {
		return nro_cedula;
	}
	public void setNro_cedula(String nro_cedula) {
		this.nro_cedula = nro_cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [nro_cedula=" + nro_cedula + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", anho_nacimiento=" + anho_nacimiento + "]";
	}
	public Persona(String nro_cedula, String nombre, String direccion, int anho_nacimiento) {
		super();
		this.nro_cedula = nro_cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.anho_nacimiento = anho_nacimiento;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getAnho_nacimiento() {
		return anho_nacimiento;
	}
	public void setAnho_nacimiento(int anho_nacimiento) {
		this.anho_nacimiento = anho_nacimiento;
	}
	
	
}
