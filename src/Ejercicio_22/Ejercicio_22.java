package Ejercicio_22;

import java.util.Scanner;

public class Ejercicio_22 {

	public static void main(String[] args) throws InterruptedException{
		
		Scanner datos = new Scanner (System.in);
		
		int num, intentos = 1;
		int numeroAleatorio = 0;
		
		System.out.println("Ingrese un numero entre 0 y 99");
		num = datos.nextInt();
		
		while ( num != numeroAleatorio) {
			numeroAleatorio = (int) (Math.random()*99);
			System.out.println("Su Numero es incorrecto, inteta de nuvo: ");
			num = datos.nextInt();
			intentos++;
		}
		if (num == numeroAleatorio){
			System.out.println("Felizidades ganaste ");
			System.out.println("Su cantidad de intentos fue de: " + intentos);
		}
	}

}
