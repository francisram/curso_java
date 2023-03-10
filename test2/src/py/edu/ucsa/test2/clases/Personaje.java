package py.edu.ucsa.test2.clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import py.edu.ucsa.test2.interfaces.Escribible;

public class Personaje implements Escribible{
	public static final String DEFAULT_CHARSET = "UTF-8";
	
	private int id;
	private String fraccion;
	private String raza;
	
	

	@Override
	public String toString() {
		return "Personaje [id=" + id + ", fraccion=" + fraccion + ", raza=" + raza + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFraccion() {
		return fraccion;
	}



	public void setFraccion(String fraccion) {
		this.fraccion = fraccion;
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}



	@Override
	public void escribirAArchivo() {
		Path path = Paths.get("C:\\clase_java\\wow\\"+this.fraccion+"_"+this.raza+".txt");
		try {
			Files.deleteIfExists(path);
			Files.createFile(path);				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
