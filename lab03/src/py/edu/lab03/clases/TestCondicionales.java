package py.edu.lab03.clases;

public class TestCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes  = 12;
		if (mes < 12) {System.out.println("todavia no estamos cerca de navidad");}
		else if(mes == 12){
			System.out.println("estamos cerca de navidad o año nuevo");
			}else {System.out.println("mes invalido");}

			




 switch(mes) {
 case 1:
 case 3:
 case 5:
 case 7:
 case 8:
 case 10:
 case 12:
	 System.out.println("el mes tiene 31 dias ");
 case 2:
	 System.out.println("el mes tiene 28 o 29 dias ");
 case 4:
 case 6:
 case 9:
 case 11:
	 System.out.println("el mes tiene 30 dias");
 default: 
	 System.out.println("mes invalido");
	 break;
	 
 }
 
 String nota = "h";
 int resultado = 0;
 switch(nota) {
 	case "a" -> resultado = 5;
 	case "b" -> resultado = 4;
 	case "c" -> resultado = 3;
 	case "d" -> resultado = 2;
 	
 }
 
 resultado = switch(nota) {
 case "a" -> 5;
	case "b" ->  4;
	case "c" ->  3;
	case "d" -> 2;
	case "e" -> {
		System.out.println("te aplazaste amigo");
		yield 1;
	}
	case "f" -> {
		System.out.println("hiciste trampita");
		yield 0;
	}
	default ->{
		System.out.println("nota inesperada"+ nota);
		yield -1 ;
	}
 };
 System.out.println(resultado);
 
 }
}
	
