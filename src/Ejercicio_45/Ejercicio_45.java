package Ejercicio_45;

import java.util.Scanner;

public class Ejercicio_45 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		int[] nom_club = {1011, 2367, 8748, 9121, 817, 6423, 2034};
		String [] nombres = {"Enrique", "Liliana"," Lucas", "Juan", "Fiorella", "Ariel"," Daiana"};
		int num, socios;
		int Enrique = 1011;
		int Liliana = 2367;
		int Lucas = 8748;
		int Juan = 9121;
		int Fiorella = 817;
		int Ariel = 6423;
		int Daiana = 2034;
		
		for (int i = 0; i < nom_club.length; i++) {
			System.out.println(nom_club[i]);
			}
		System.out.println("ingrese un numero de socio, para encontrar a un individuo" );
		
		num = datos.nextInt();
		
		
		
		
		if ( num == Enrique ) {
			System.out.println("usted elijio el num:" + 1011 );
			System.out.println("nombre: Enrique");
		}
		
		if ( num == Liliana ) {
			System.out.println("usted elijio el num:" + 2367 );
			System.out.println("nombre: Liliana");
		}
	
		if ( num == Lucas ) {
			System.out.println("usted elijio el num:" + 8748 );
			System.out.println("nombre: Lucas");
		}
		
		
		if ( num == Juan ) {
			System.out.println("usted elijio el num:" + 9121 );
			System.out.println("nombre: Juan");
		}
		
		if ( num == Fiorella ) {
			System.out.println("usted elijio el num:" + 817 );
			System.out.println("nombre: Fiorella");
		}
		
		
		if ( num == Ariel ) {
			System.out.println("usted elijio el num:" + 6423 );
			System.out.println("nombre: Ariel");
		}
		
		if ( num == Daiana ) {
			System.out.println("usted elijio el num:" + 2034 );
			System.out.println("nombre: Daiana");
		}
		
		
	}

}
