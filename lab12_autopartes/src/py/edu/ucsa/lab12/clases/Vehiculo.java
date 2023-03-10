package py.edu.ucsa.lab12.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private String duenho;
	private List<Parte> partes;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDuenho() {
		return duenho;
	}
	public void setDuenho(String duenho) {
		this.duenho = duenho;
	}
	public List<Parte> getPartes() {
		
		if(Objects.isNull(partes)) {
			partes = new ArrayList<>();
		}
		return partes;
		
	}
	
	public void acelerar() {
		System.out.println("el vehiculo esta acelerando");
	}
	
	public void mostrarPartes() {
		System.out.println("Partes del automovil");
		for (Parte parte : partes) {
			parte.mostrarDatos();
		}
	}
	

}
