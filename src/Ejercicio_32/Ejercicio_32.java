package Ejercicio_32;

import java.util.Scanner;

public class Ejercicio_32 {

	public static void main(String[] args) throws InterruptedException {
	
		Scanner datos = new Scanner (System.in);
		
		int n1;
		int multi;
		
		System.out.println("ingrese un numero a multiplicar: ");
		n1 = datos.nextInt();
		
		for ( int n = 1 ; n <=20 ; n++ ) {
			
			multi = n1 * n;
			
			System.out.println("El numero multiplicado es: "+ multi);
			
			Thread.sleep(20);
		}
	}

}
