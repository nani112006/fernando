package Ejercicio_18;

import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		char talla;
		
		System.out.println("Ingrese su talla entre S, M, L: ");
		talla = datos.next().charAt(0);
		
		switch (talla) {
		case 'S': System.out.println("Solo quedan 5 remeras");
			break;
		case 's': System.out.println("Solo quedan 5 remeras");
			break;
		case 'M': System.out.println("Solo quedan 2 remeras");
			break;
		case 'm': System.out.println("Solo quedan 2 remeras");
			break;
		case 'L': System.out.println("No quedan mas remeras");
			break;
		case 'l': System.out.println("No quedan mas remeras");
			break;
		default:System.out.println("No tenemos esa talla");
			break;
		}
	}

}