package py.edu.ucsa.tte.clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Marcacion {
	
	private LocalDate fechaMarcacion;
	private int horaMinutoMarcacion;
	private Empleado empleado;
	public static int hora_entrada = 800;
	
	
	public static List<Marcacion> leerMarcaciones(){
		List<Marcacion> marcaciones = new  ArrayList<Marcacion>();
		try(FileReader reader = new FileReader("C:\\clase_java\\Marcaciones.txt");
			BufferedReader bufReader = new BufferedReader(reader);) {
			String line = null;
			line = bufReader.readLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			while (line != null) {
				String[] datos = line.split("\t");
				if("S".equals(datos[5])) {
					PersonalDeServicio e = new PersonalDeServicio();
					e.setLegajo(Integer.parseInt(datos[2]));
					e.setNombre(datos[3]);
					e.setApellido(datos[4]);
					e.setTolerancia(true);
					e.setTolerancia(false);
					e.setMinutosTolerancia(0);
					LocalDate fecha = LocalDate.parse(datos[0],formatter);
					Marcacion m = new Marcacion();
					/*
					if(hora_entrada > Integer.parseInt(datos[1].replace(":", ""))) {
						e.setMinutosTolerancia(Integer.parseInt(datos[1].replace(":", "")) - hora_entrada);						
					}
					*/
					m.setHoraMinutoMarcacion(Integer.parseInt(datos[1].replace(":", "")));
					m.setFechaMarcacion(fecha);
					m.setEmpleado(e);
					marcaciones.add(m);
					//System.out.println(e);
				}
				if("G".equals(datos[5])) {
					Gerente g = new Gerente();
					g.setLegajo(Integer.parseInt(datos[2]));
					g.setNombre(datos[3]);
					g.setApellido(datos[4]);
					g.setTolerancia(false);
					g.setMinutosTolerancia(0);
					LocalDate fecha = LocalDate.parse(datos[0],formatter);
					Marcacion m = new Marcacion();
					m.setHoraMinutoMarcacion(Integer.parseInt(datos[1].replace(":", "")));
					m.setFechaMarcacion(fecha);
					m.setEmpleado(g);
					marcaciones.add(m);
				}
				if("D".equals(datos[5])) {
					Director d = new Director();
					d.setLegajo(Integer.parseInt(datos[2]));
					d.setNombre(datos[3]);
					d.setApellido(datos[4]);
					d.setTolerancia(true);
					d.setMinutosTolerancia(5);
					LocalDate fecha = LocalDate.parse(datos[0],formatter);
					Marcacion m = new Marcacion();
					m.setHoraMinutoMarcacion(Integer.parseInt(datos[1].replace(":", "")));
					m.setFechaMarcacion(fecha);
					m.setEmpleado(d);
					marcaciones.add(m);
				}
				//System.out.println(line);	
				line = bufReader.readLine();
			}
			
		} catch (Exception e) {
			System.out.println("Error:"+ e.getMessage());
		}
		return marcaciones;
		
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




	@Override
	public String toString() {
		return "Marcacion [fechaMarcacion=" + fechaMarcacion + ", horaMinutoMarcacion=" + horaMinutoMarcacion
				+ ", empleado=" + empleado + "]";
	}
	
	
	
	
	
}
