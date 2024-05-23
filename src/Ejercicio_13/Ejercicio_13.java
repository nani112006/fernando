package Ejercicio_13;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		char talla;
		
		System.out.println("Ingrese su talla entre S, M, L: ");
		talla = datos.next().charAt(0);
		
		if ( talla == 's' || talla == 'S' ) {
			
			System.out.println("Solo quedan 5 remeras");
			
		}
		else if ( talla == 'm' || talla == 'M' ) {
			System.out.println("Solo quedan 2 remeras");
		}
		else if ( talla == 'l' || talla == 'L') {
			System.out.println("No quedo mas remeras");
		}
	}

}
