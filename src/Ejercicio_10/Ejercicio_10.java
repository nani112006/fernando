package Ejercicio_10;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese un numero entre 0 y 99");
		num = datos.nextInt();
		
		int numeroAleatorio;
		
		numeroAleatorio = (int)(Math.random()*99);
		
		System.out.println("el numero al azar es:" + numeroAleatorio );
		
		if ( numeroAleatorio == num ) {
			
			System.out.println("Felicidades. ganaste el Bingo" );
		}
		
		else if ( numeroAleatorio != num ) {
			
			System.out.println("lamentablemente no gano el Bingo" );
			
		}
		
	}

}
