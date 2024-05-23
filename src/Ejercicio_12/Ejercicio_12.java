package Ejercicio_12;

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Ingrese una nota de su calificacion: ");
		num1 = datos.nextInt();
		
		if ( num1 < 1 || num1 > 10 ) {
			System.out.println("El valor q ingreso es incorrecto ");
		}
		
		else if (num1 >= 1 && num1 <= 3 ) {
			System.out.println("Su calificacion es: Insuficiente ");
		}
		
		else if (num1 > 3 && num1 < 6 ) {
			System.out.println("Su calificacion es: No Logrado ");
		}

		else if (num1 >= 6 && num1 <= 7 ) {
			System.out.println("Su calificacion es: Suficiente ");
		}
		
		else if (num1 >=8 && num1 <=9 ) {
			System.out.println("Su calificacion es: Notable ");
		}
		
		else if (num1 == 10) {
			System.out.println("Su calificacion es: Sobresaliente ");
		}

	}

}
