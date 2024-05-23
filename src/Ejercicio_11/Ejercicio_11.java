package Ejercicio_11;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Ingrese un numero: ");
		num1 = datos.nextInt();
		
		if ( num1>0 ) {
			System.out.println("El numero es positivo");
		}
		else if (num1<0) {
			System.out.println("El numero es negativo");
		}
		
		else if (num1==0) {
			System.out.println("El numero es cero");
		}
	
	}

}
