package Ejercicio_17;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner (System.in);
		
		int n1;
		float n2;
		double n3;
		
		System.out.println("ingrese su 1er numero en entero: ");
		n1 = datos.nextInt();
		
		System.out.println("ingrese su 2do un numero en decimales: ");
		n2 = datos.nextFloat();
		
		System.out.println("ingrese cualquier numero: ");
		n3 = datos.nextDouble();
		
		if ( n1 > n2 && n1 > n3 && n2 < n1 && n2 > n3 && n3 < n2 && n3 < n1 ) {
			
			System.out.println("Su numero mas alto es: " + n1);
			System.out.println("Su 2do numero mas alto es: " + n2);
			System.out.println("Suu numero mas chico es: " + n3);
		}
		
		else if ( n1 > n2 && n1 > n3 && n2 < n1 && n3 > n2 && n2 < n3 && n3 < n1 ) {
			
			System.out.println("Su numero mas alto es: " + n1);
			System.out.println("Su 2do numero mas alto es: " + n3);
			System.out.println("Suu numero mas chico es: " + n2);
		}
		
		else if ( n1 < n2 && n1 > n3 && n2 > n1 && n2 > n3 && n3 < n2 && n3 < n1 ) {
			
			System.out.println("Su numero mas alto es: " + n2);
			System.out.println("Su 2do numero mas alto es: " + n1);
			System.out.println("Suu numero mas chico es: " + n3);
		}
		
		else if ( n1 < n2 && n1 < n3 && n2 > n1 && n2 > n3 && n3 < n2 && n3 > n1 ) {
			
			System.out.println("Su numero mas alto es: " + n2);
			System.out.println("Su 2do numero mas alto es: " + n3);
			System.out.println("Suu numero mas chico es: " + n1);
		}
		
		
		else if ( n1 > n2 && n1 < n3 && n2 < n1 && n2 < n3 && n3 > n2 && n3 > n1 ) {
			System.out.println("Su numero mas alto es: " + n3);
			System.out.println("Su 2do numero mas alto es: " + n1);
			System.out.println("Suu numero mas chico es: " + n2);
     	}
		
		else if ( n1 < n2 && n1 < n3 && n2 > n1 && n2 < n3 && n3 > n2 && n3 > n1 ) {
			
			System.out.println("Su numero mas alto es: " + n3);
			System.out.println("Su 2do numero mas alto es: " + n2);
			System.out.println("Suu numero mas chico es: " + n1);
		}
		
		
	}

}
