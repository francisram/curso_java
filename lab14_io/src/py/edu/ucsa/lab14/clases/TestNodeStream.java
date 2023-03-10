package py.edu.ucsa.lab14.clases;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestNodeStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader input = new FileReader(args[0]);
			FileWriter output = new FileWriter(args[1]);
			char buffer[] = new char[128];
			int charsRead;
			charsRead = input.read(buffer);
			
			while (charsRead != -1) {
				output.write(buffer, 0, charsRead);
				charsRead = input.read(buffer);
			}
			input.close();
			output.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
