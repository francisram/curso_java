package py.edu.ucsa.lab07.clases;

public class ConversorTemp {
	public static double convertirFarenheitCelsius(double gradosF) {
		return (gradosF - 32)/1.8000;
	}
	public static double convertirCelsiusFarenheit(double gradosC) {
		return gradosC * 9/5 +32;
		
	}
	
	public static void main(String[] args) {
		System.out.println(convertirCelsiusFarenheit(38));
		System.out.println(convertirFarenheitCelsius(90));
		
	}

}
