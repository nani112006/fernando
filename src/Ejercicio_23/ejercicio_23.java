package Ejercicio_23;

import java.util.Scanner;

public class ejercicio_23 {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner (System.in);
		
		int num, intentos = 0;
		int numeroAleatorio;
		boolean seguir = true;
		
		numeroAleatorio = (int) (Math.random()*99);
		System.out.println("Ingrese un numero entre 0 y 99");
		num = datos.nextInt();
		
		
		
		while ( seguir ){
			intentos++;
			
			if ( num != numeroAleatorio) {
			System.out.println("Su Numero es incorrecto, intenta de nuevo: ");
			num = datos.nextInt();
			}
			
			if (num == numeroAleatorio){
			System.out.println("Felizidades ganaste ");
			System.out.println("Su cantidad de intentos son: " + intentos);
			seguir = false;
			
		}
			
			
		if ( intentos == 4 ) {
			System.out.println("se acabaron los intentos");
			
			seguir = false;
		}
			
		
		}
		
		
		
		
		
		
		

	}

}
