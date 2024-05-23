package Ejercicio_24;

import java.util.Scanner;

public class Ejercicio_24 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int n1,n2, suma, salir;
		boolean seguir = true;
		
		while ( seguir )  {
			
			System.out.println("ingrese su 1er num.: ");
		n1 = datos.nextInt();
		
		System.out.println("ingrese su 2do num.: ");
		n2 = datos.nextInt();
		
		suma = n1 + n2;
		
		System.out.println("el resultado de la suma es: " + suma);
		
		System.out.println("Si usted desea salir del programa, presione 0 ");
		salir = datos.nextInt();
		
		if ( salir == 0 ) {
			seguir = false;	
		}
		}
	}
}
