package py.edu.ucsa.lab09.clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Clase Cerveza con sus tributos
 * @author frlopez
 *
 */
public class Cerveza {
	

	private int id;
	private String marca = null;
	private LocalDate fechaFabricacion = LocalDate.now();
	private LocalDate  fechaVencimiento =  LocalDate.now(); 
	private MateriaPrima materiaPrima  = MateriaPrima.C;
	private int contenidoEstablecida = 0;
	private int contenidoReal = 0;
	
	/**
	 * Constructor por defecto
	 */
		public Cerveza() {
			super();
			// TODO Auto-generated constructor stub
		}
	/**
	 * Constructor de Cerveza con parametros 
	 * @param marca "nombre de la cerveza"
	 * @param materiaPrima "ingrediente principal de la cerveza"
	 * @param contenidoReal "contenido real de la cervez en ml"
	 */
		public Cerveza(String marca,MateriaPrima materiaPrima, int contenidoReal) {
			super();
			this.marca = marca;
			//this.materia_prima = comprobarMateriaPrima(materia_prima);
			this.materiaPrima = materiaPrima;
			this.contenidoReal = contenidoReal;
			this.id = generarID();
		}

		public Cerveza(String marca, LocalDate fechaFabricacion, LocalDate fechaVencimiento, MateriaPrima materiaPrima,
				int contenidoEstablecida, int contenidoReal) {
			super();
			this.marca = marca;
			this.fechaFabricacion = fechaFabricacion;
			this.fechaVencimiento = fechaVencimiento;
			//this.materiaPrima = comprobarMateriaPrima(materia_prima);
			this.materiaPrima = materiaPrima;
			this.contenidoEstablecida = contenidoEstablecida;
			this.contenidoReal = contenidoReal;
			this.id = generarID();
		}
	
	public int getId() {
		return id;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = MateriaPrima.
	}

	public int getContenidoEstablecida() {
		return contenidoEstablecida;
	}

	public void setContenidoEstablecida(int contenidoEstablecida) {
		this.contenidoEstablecida = contenidoEstablecida;
	}

	public int getContenidoReal() {
		return contenidoReal;
	}

	public void setContenidoReal(int contenidoReal) {
		this.contenidoReal = contenidoReal;
	}

	
	public int calcularCantidad(int contenidoReal) {
		int r = 0;
		if (this.contenidoReal == contenidoReal) {
			r =  0;
		} 
		if (this.contenidoReal > contenidoReal) {
			r = 1;
		} 
		if (this.contenidoReal < contenidoReal) {
			r = -1;
		} 
		return r;
	}
	
	public boolean estaVencido(String fechaVencimiento) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
		//System.out.println(fecha_vencimiento);
		  //convert String to LocalDate
		LocalDate localDate = LocalDate.parse(fechaVencimiento, formatter);
		if(localDate.isBefore(this.fechaVencimiento)) {
			return false;
			}else {
				return true;
			}
	}
	
	private int generarID() {
		int n = 0;
		int m = 99999999;
		return (int) (Math.floor(Math.random()*(n-m+1)+m));
	}
	
	@Override
	public String toString() {
		return "Cerveza [id=" + id + ", marca=" + marca + ", fechaFabricacion=" + fechaFabricacion
				+ ", fechaVencimiento=" + fechaVencimiento + ", materiaPrima=" + materiaPrima.getDescripcionMateriaPrima()
				+ ", contenidoEstablecida=" + contenidoEstablecida + ", contenidoReal=" + contenidoReal + "]";
	}

	

/*
	public String comprobarMateriaPrima(String mp) {
		if(materiaPrima == mp) {
			return MateriaPrima.getMateriaPrima(mp);
		}else {
			return MateriaPrima.C.getMateriaPrima();
		}
	}
	*/
	

}
