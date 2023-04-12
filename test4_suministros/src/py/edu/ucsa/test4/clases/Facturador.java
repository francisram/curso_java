package py.edu.ucsa.test4.clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import py.edu.ucsa.test4.interfaces.Calculable;

public class Facturador {
	public static final String DEFAULT_CHARSET = "UTF-8";
	public void procesarConsumos(List<Calculable> clientes) {

		List<Cliente> clients = new ArrayList<>();
		for (Calculable calc : clientes) {
			if (calc instanceof TarifaSocial) {
				calc.calcularConsumo();
				clients.add((Cliente) calc);
			}
			if (calc instanceof Residencial) {
				calc.calcularConsumo();
				clients.add((Cliente) calc);
			}
			if (calc instanceof Industrial) {
				calc.calcularConsumo();
				clients.add((Cliente) calc);
			}
			if (calc instanceof Comercio) {
				calc.calcularConsumo();
				clients.add((Cliente) calc);
			}
		}

		generarFacturas(clients);

	}

	public void generarFacturas(List<Cliente> clients) {

		
		  for (Cliente cliente : clients) {
			  System.out.println(cliente);
			  try  { 
			  for (Lectura l :  cliente.getLecturas()) { 
				  FileWriter output = new FileWriter("C:\\clase_java\\facturas\\" +l.getCategoria()+"_"+ cliente.getSuministro() + ".txt");
				  BufferedWriter bufOutput = new BufferedWriter(output);
				  bufOutput.write(cliente.toString()); 
				  bufOutput.close();
				  output.close();
				  } 
			  } catch (Exception  e) { 
				  e.printStackTrace(); 
				  } 
		  }
		 
		
	}
}
