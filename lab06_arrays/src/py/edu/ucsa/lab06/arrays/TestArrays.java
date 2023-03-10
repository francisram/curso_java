package py.edu.ucsa.lab06.arrays;

import java.util.Iterator;

public class TestArrays {
	
	public static void main(String[] args) {
		String nombres[] = new String[5];
		nombres[0]= "marcos";
		nombres[1]= "andrea";
		nombres[2]= "sandra";
		nombres[3]= "francis";
		nombres[4]= "athena";
	  for (int i = 0; i < nombres.length; i++) {
		  System.out.println(i + "-" + nombres[i]);
		
	}
	  System.out.println(nombres[0] == nombres[3]);
	}

}
