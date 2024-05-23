package Ejercicio_39;

import java.util.Scanner;

public class Ejercicio_39 {

	public static void main (String args []) {
		Scanner datos = new Scanner (System.in);
		
		String[] nombre = new String[12];
		int[] edad = new int[12];
			
		for ( int i = 1; i <= 11 ; i++ ) {
			
			System.out.println("\nIngrese su nombre: ");
			nombre[i] = datos.next();
			
			System.out.println("\nIngrese su edad: ");
			edad[i] = datos.nextInt();
			
		}
		
		System.out.println("\n");
		

		for (int l = 1; l <=11; l++  ) {
			System.out.println("\nnombre y edad del jugador:" + l);
			System.out.println(nombre[l]);
			System.out.println(edad[l]);
		}
	}
}

