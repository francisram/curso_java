package py.edu.ucsa.lab12.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Parte {
	private String nombre;
	private String material;
	private List<Componente> componentes;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public List<Componente> getComponentes() {
		
		if(Objects.isNull(componentes)) {
			componentes = new ArrayList<>();
		}
		return componentes;
		
	}

	public void mostrarDatos() {
		System.out.println("Parte:"  +nombre);
		System.out.println("Material:"  + material);
		for (Componente componente : componentes) {
			System.out.println(componente.getNombre());
		}
	}

}
