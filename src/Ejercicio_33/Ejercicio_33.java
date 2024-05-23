package Ejercicio_33;

import java.util.Scanner;

public class Ejercicio_33 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner datos = new Scanner (System.in);
		
		int jugadores;
		String nombre;
		int edad;
		
		System.out.println("estamos armando un equipo y vasmo a pedirle algunos datos.");
		
		for ( jugadores = 1 ; jugadores <= 11   ; jugadores++ ) {
		
			System.out.println("\ningrese su nombre: ");
			nombre = datos.next();
			
			System.out.println("ingrese su edad: ");
			edad = datos.nextInt();
			
			System.out.println("\nusted es el jugador nro: " + jugadores );
			Thread.sleep(2000);
		}
		
		
		
	}
	
	
	
}
