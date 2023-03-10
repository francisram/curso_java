package py.edu.ucsa.tte.clases;

import java.time.LocalDate;
import java.util.List;

public class Marcacion {
	
	private LocalDate fechaMarcacion;
	private int horaMinutoMarcacion;
	private Empleado empleado;
	public static int hora_entrada = 800;
	
	
	public static List<Marcacion> leerMarcaciones(){
		return null;
		
	}
	
	
	
	
	public LocalDate getFechaMarcacion() {
		return fechaMarcacion;
	}
	public void setFechaMarcacion(LocalDate fechaMarcacion) {
		this.fechaMarcacion = fechaMarcacion;
	}
	public int getHoraMinutoMarcacion() {
		return horaMinutoMarcacion;
	}
	public void setHoraMinutoMarcacion(int horaMinutoMarcacion) {
		this.horaMinutoMarcacion = horaMinutoMarcacion;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
	
	
}
