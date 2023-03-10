package py.edu.ucsa.lab01.clases;

public class Alumno {
	private String nroCedula;
	private String codigoEmpleado;
	private String nombre;
	private String direccion;
	private int anhoIngreso;
	private int anhoNacimiento;
	private double salario;
	public String getNroCedula() {
		return nroCedula;
	}
	public void setNroCedula(String nroCedula) {
		this.nroCedula = nroCedula;
	}
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getAnhoIngreso() {
		return anhoIngreso;
	}
	public void setAnhoIngreso(int anhoIngreso) {
		this.anhoIngreso = anhoIngreso;
	}
	public int getAnhoNacimiento() {
		return anhoNacimiento;
	}
	public void setAnhoNacimiento(int anhoNacimiento) {
		this.anhoNacimiento = anhoNacimiento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int anhoEmpresa() {
		return 0;
	}
	
	public int getEdad() {
		return 0;
	}
	
	public double getSueldoTotal() {
		return 0;
	}
	
	
}
