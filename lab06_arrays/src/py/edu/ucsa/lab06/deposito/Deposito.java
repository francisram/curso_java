package py.edu.ucsa.lab06.deposito;

import java.util.ArrayList;
import java.util.Arrays;

public class Deposito {
	private String nombre  ;
	private String direccion  ;
	private Persona duenho ;
	private Cemento[] cementos;
	private int contadorCemento = 0;
	private Ladrillo[] ladrillos;
	private int contadorLadrillo = 0;
	private Teja[] tejas;
	private int contadorTejas = 0;
	public Deposito(String nombre, String direccion, Persona duenho,int tamanhoCemento,int tamanhoLadrillo,int tamanhoTejas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.duenho = duenho;
		this.cementos = new Cemento[tamanhoCemento];
		this.ladrillos = new Ladrillo[tamanhoLadrillo];
		this.tejas = new Teja[tamanhoTejas];
	}
	
	public void agregar(Cemento c) {
		if(contadorCemento <= cementos.length) {
			cementos[contadorCemento++] = c;
		}
	}
	public void agregar(Ladrillo l) {
		if(contadorLadrillo <= ladrillos.length) {
			ladrillos[contadorLadrillo++] = l;
		}
	}
	
	public void agregar(Teja t) {
		if(contadorTejas <= tejas.length) {
			tejas[contadorTejas++] = t;
		}
		
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
	public Persona getDuenho() {
		return duenho;
	}
	public void setDuenho(Persona duenho) {
		this.duenho = duenho;
	}
	
	/**
	 * Método que permite quitar un cemento del array
	 * de cementos , devuelve null en caso de que ya no exista ningun elemento
	 * @return el cemento en la ultima posicion o null si ya no exite cementos en el array
	 */
	public Cemento sacarCemento() {
		if(contadorCemento >= 0 ) {
			contadorCemento--;
			Cemento aux = cementos[contadorCemento];
			cementos[contadorCemento]=null;
			return aux;
		}else {
			return null;
			}
	}
	
	/**
	 * Método que permite quitar un ladrillo del array
	 * de ladrillos , devuelve null en caso de que ya no exista ningun elemento
	 * @return el ladrillo en la ultima posicion o null si ya no exite ladrillos en el array
	 */
	public Ladrillo sacarLadrillo() {
		if(contadorLadrillo <= 0) {
			contadorLadrillo--;
			Ladrillo aux  = ladrillos[contadorLadrillo];
			ladrillos[contadorLadrillo]= null;
			return aux;
		}else {
			return null;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Teja sacarTeja() {
		if(contadorTejas >=0) {
			contadorTejas--;
			Teja auc = tejas[contadorTejas];
			tejas[contadorTejas] = null;
			return null;
		}else {
			return null;
		}
	}
	
	/**
	 * Método que permite que permite la cantidad de cementos especificada
	 * @param cantidad  la catidad que se desea
	 * si la cantidad pasada como argumento es menor a cero devuelve null, en caso de que la cantidad es menor a sea superior
	 * a la existente en el array solo devolvera toda la cantidad existente o devolvera la cantidad
	 * @return  un array de cementos en base a la cantidad , si la cantidad solicitada supera a la existente se devuelva toda existente
	 * si la cantidad es menor o igual a 0 devuelve null
	 */
	public Cemento[] sacarCementos(int cantidad) {
		if(cantidad<=0) {
			return null;
		}
		if(cantidad > contadorCemento) {
			cantidad = contadorCemento;
		}
		Cemento[] aux =  new Cemento[cantidad];
		int contadoAux = 0;
		while (contadoAux < cantidad) {
			aux[contadoAux++] = cementos[--contadorCemento];
			cementos[contadorCemento] = null;
			
		}
		return aux;

	}
	
	/**
	 * 
	 * @param cantidad
	 * @return
	 */
	public Ladrillo[] sacarLadrillos(int cantidad) {
		if(cantidad<=0) {
			return null;
		}
		if(cantidad > contadorLadrillo) {
			cantidad = contadorLadrillo;
		}
		Ladrillo[] aux =  new Ladrillo[cantidad];
		int contadoAux = 0;
		while (contadoAux < cantidad) {
			aux[contadoAux++] = ladrillos[--contadorLadrillo];
			ladrillos[contadorLadrillo] = null;
			
		}
		return aux;

	}
	
	public Teja[] sacarTejas(int cantidad) {
		if(cantidad<=0) {
			return null;
		}
		if(cantidad > contadorTejas) {
			cantidad = contadorTejas;
		}
		Teja[] aux =  new Teja[cantidad];
		int contadoAux = 0;
		while (contadoAux < cantidad) {
			aux[contadoAux++] = tejas[--contadorTejas];
			tejas[contadorTejas] = null;
			
		}
		return aux;

	}
	
	public void listarStockCementos() {
		System.out.println("datos de cementos");
		Arrays.asList(cementos).forEach((x)->{System.out.println(x.toString());});
	}
	public int getCantidadCementos() {return this.contadorCemento;}
	
	public void listarStockladrillos() {
		System.out.println("datos de ladrillos");
		Arrays.asList(ladrillos).forEach((x)->{System.out.println(x.toString());});
	}
	public int getCantidadLadrillos() {return this.contadorLadrillo;}
	
	public void listarStocktejas() {
		System.out.println("datos de tejas");
		Arrays.asList(tejas).forEach((x)->{System.out.println(x.toString());});
	}
	public int getCantidadtejas() {return this.contadorLadrillo;}
	
}
