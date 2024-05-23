package Ejercicio_14;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int num;
		
		System.out.println("ingrese un numero: ");
		num = datos.nextInt();
		
		if ( num != 0 ) {
			
			System.out.println("la operacion se puede realizar.");
			
		}
		else if ( num < 1 || num > -1 ) {
			System.out.println("la operacion no es posible");
			
		}
		

	}

}
