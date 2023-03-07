package py.edu.ucsa.test.clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		FileReader reader;
		try {
			reader = new FileReader("c:/java/io-test.txt");
			BufferedReader bufReader=new BufferedReader(reader);

			String line = null;

			line = bufReader.readLine();

			while(line != null){

			System.out.println(line);

			line = bufReader.readLine();

			}

			//while((line = bufReader.readLine()) != null)

			//System.out.println(line);

			bufReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
	}
}
