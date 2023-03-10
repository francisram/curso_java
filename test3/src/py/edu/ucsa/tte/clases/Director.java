package py.edu.ucsa.tte.clases;

public class Director extends Empleado{
 private int cantidadLLegadasTardias;
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
 
 
}
