package py.edu.ucsa.lab14.clases;

import java.io.File;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		File file=new File("C:/clase_java/");

		String files[]=file.list();

		// for(int i=0;i<files.length;i++){

		// System.out.println(files[i]);

		// }

		Arrays.asList(files).forEach(f -> System.out.println(f));
		System.out.println(file.getParent());
		System.out.println(file.getParentFile());
		System.out.println(file.setReadOnly());
	}

}
