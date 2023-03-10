package py.edu.ucsa.lab09.principal;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import py.edu.ucsa.lab09.clases.Cerveza;
import py.edu.ucsa.lab09.clases.MateriaPrima;

public class Main {

public static void main (String[] args) {
	Cerveza c1 = new Cerveza();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
	String venc = "2024-02-05";
	LocalDate vencimiento = LocalDate.parse(venc, formatter);
	String fab = "2023-02-05";
	LocalDate fabricacion = LocalDate.parse(fab, formatter);
	String today = LocalDate.now().toString();
	c1.setMarca("miller");
	c1.setMateriaPrima(MateriaPrima.M);
	c1.setFechaVencimiento(vencimiento);
	c1.setFechaFabricacion(fabricacion);
	c1.setContenidoEstablecida(330);
	c1.setContenidoReal(300);
	
	
	Cerveza c2 = new Cerveza("bud 66",MateriaPrima.M,300);
	Cerveza c3 = new Cerveza("Pilsen", fabricacion, vencimiento, MateriaPrima.T, 330, 330);

	
	System.out.print(c1.getMarca()+"|");
	if(c1.calcularCantidad(c1.getContenidoReal()) == 0){System.out.print("cantidad justa"+"|");}
	if(c1.calcularCantidad(c1.getContenidoReal()) < 0){System.out.print("cantidad menor a la especificada"+"|");}
	if(c1.calcularCantidad(c1.getContenidoReal()) > 0){System.out.print("cantidad mayor a la especificada"+"|");}
	if(c1.estaVencido(today)){
		System.out.print("esta vencida"+"|");
	}else{
		System.out.print("sigue vigente"+"|");
	}
	System.out.print(c2.getMateriaPrima());

	System.out.println("");
	System.out.print(c2.getMarca()+"|");
	if(c2.calcularCantidad(c2.getContenidoReal()) == 0){System.out.print("cantidad justa"+"|");}
	if(c2.calcularCantidad(c2.getContenidoReal()) < 0){System.out.print("cantidad menor a la especificada"+"|");}
	if(c2.calcularCantidad(c2.getContenidoReal()) > 0){System.out.print("cantidad mayor a la especificada"+"|");}
	if(c2.estaVencido(today)){
		System.out.print("esta vencida"+"|");
	}else{
		System.out.print("sigue vigente"+"|");
	}
	System.out.print(c2.getMateriaPrima());
	System.out.println("");
	
	System.out.print(c3.getMarca()+"|");
	if(c3.calcularCantidad(c3.getContenidoReal()) == 0){System.out.print("cantidad justa"+"|");}
	if(c3.calcularCantidad(c3.getContenidoReal()) < 0){System.out.print("cantidad menor a la especificada"+"|");}
	if(c3.calcularCantidad(c3.getContenidoReal()) > 0){System.out.print("cantidad mayor a la especificada"+"|");}
	if(c3.estaVencido(today)){
		System.out.print("esta vencida"+"|");
	}else{
		System.out.print("sigue vigente"+"|");
	}
	System.out.print(c3.getMateriaPrima());

	System.out.println("");
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	
}
	
	
}
