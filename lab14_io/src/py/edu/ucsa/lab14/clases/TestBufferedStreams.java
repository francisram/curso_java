package py.edu.ucsa.lab14.clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestBufferedStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader input = new FileReader(args[0]);
				BufferedReader bufInput = new BufferedReader(input);
				FileWriter output = new FileWriter(args[1]);) {
		
			BufferedWriter bufOutput = new BufferedWriter(output);

			String line;

			// read the first line

			line = bufInput.readLine();

			while (line != null) {

			// write the line out to the output file

			bufOutput.write(line, 0, line.length());

			bufOutput.newLine();

			// read the next line

			line = bufInput.readLine();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
