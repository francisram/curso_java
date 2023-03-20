package py.edu.ucsa.tte.clases;

import py.edu.ucsa.tte.interfaces.Validable;

public class Director extends Empleado implements Validable {
	private int cantidadLLegadasTardias = 0;
	private String departamento;
	private int cantSubordinados;

	public int getCantidadLLegadasTardias() {
		return cantidadLLegadasTardias;
	}

	public void setCantidadLLegadasTardias(int cantidadLLegadasTardias) {
		this.cantidadLLegadasTardias = cantidadLLegadasTardias;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getCantSubordinados() {
		return cantSubordinados;
	}

	public void setCantSubordinados(int cantSubordinados) {
		this.cantSubordinados = cantSubordinados;
	}

	@Override
	public boolean validar(int horaMinuto) {
		if (this.isTolerancia()) {
			if (horaMinuto <= Marcacion.hora_entrada + this.getMinutosTolerancia()) {
				return false;
			} else {
				return true;
			}
		} else {
			return true;
		}

	}

	@Override
	public String toString() {
		return "Director [cantidadLLegadasTardias=" + cantidadLLegadasTardias + ", departamento=" + departamento
				+ ", cantSubordinados=" + cantSubordinados + ", toString()=" + super.toString() + "]";
	}
	
	

}
