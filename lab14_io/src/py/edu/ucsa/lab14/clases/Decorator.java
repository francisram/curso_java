package py.edu.ucsa.lab14.clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileReader reader;
		try ( FileReader reader = new FileReader("c:/clase_java/2.txt");
			FileWriter writer = new FileWriter("c:/clase_java/4.txt",true);
			BufferedReader bufReader=new BufferedReader(reader);
			BufferedWriter bf = new BufferedWriter(writer);){

			String line = null;
				/*
			line = bufReader.readLine();

			while(line != null){

			System.out.println(line);

			line = bufReader.readLine();

			}
			*/
			while((line = bufReader.readLine()) != null) {

			System.out.println(line);
			bf.write(line, 0, line.length());

			bf.newLine();
			}

			//bufReader.close();
			}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No se encontró el archivo");

			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de INPUT/OUTPUT "

			+ e.getMessage());
		}

	
	}
	

}
