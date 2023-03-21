package py.edu.ucsa.test4.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import py.edu.ucsa.test4.interfaces.Calculable;

public abstract class Cliente implements Calculable{
	private int suministro;
	private List<Lectura> lecturas;
	private double montoConsumo;
	public static final int PRECIO_KWH = 458;
	
	
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(suministro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return suministro == other.suministro;
	}
	@Override
	public String toString() {
		return "Cliente [suministro=" + suministro + ", lecturas=" + lecturas + ", montoConsumo=" + montoConsumo + "]";
	}
	public int getSuministro() {
		return suministro;
	}
	public void setSuministro(int suministro) {
		this.suministro = suministro;
	}
	public List<Lectura> getLecturas() {
		if(Objects.isNull(lecturas)) {
			lecturas = new ArrayList<>();
		}
		return lecturas;
	}
	public void setLecturas(List<Lectura> lecturas) {
		this.lecturas = lecturas;
	}
	public double getMontoConsumo() {
		return montoConsumo;
	}
	public void setMontoConsumo(double montoConsumo) {
		this.montoConsumo = montoConsumo;
	}
	public static int getPrecioKwh() {
		return PRECIO_KWH;
	}
	
	

}
