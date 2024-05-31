package Ejercicio_46;

import java.util.Scanner;

public class Ejercicio_46 {
	public static void main(String[] args) {
			Scanner datos = new Scanner (System.in);
		
		int impares;
		int[] nom_club = {1011, 2367, 8748, 9121, 817, 6423, 2034};
		String [] nombres = {"Enrique", "Liliana"," Lucas", "Juan", "Fiorella", "Ariel"," Daiana"};
		int num, socios;
		nom_club.length = nombres.length;
		float divis = 0;
		
		if 
		System.out.println("");
		
		System.out.println("ingrese un numero de socio, para encontrar a un individuo" );
		num = datos.nextInt();
		
		for (int i = 0; i < nom_club.length; i++) {
			divis = nom_club[i] % 2;
			}
		
		if (divis == 0 ) {
				System.out.println("este numero es par y no se encuentra");
			}
		
			
	
		
	}
	
}