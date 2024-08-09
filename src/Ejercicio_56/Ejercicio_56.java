package Ejercicio_56;

import java.util.Scanner;

public class Ejercicio_56 {
	static Scanner datos = new Scanner (System.in);
	static String no, nom;
	static String ap, ape;
	
	public static void ingresarDatos() {
		System.out.println("Ingrese su nombre:");
		no = datos.nextLine();
		System.out.println("Ingrese su apellido:");
		ap = datos.nextLine();

	}
	public static void letra() {
		String nom = no.toLowerCase();
		String ape = ap.toUpperCase();
		
		System.out.println("\nSu nombre en minuscula es: "+nom);
		
		System.out.println("Su apellido en maguscula es: "+ape);
		
		
	}
	
	public static void main(String[] args) {
		ingresarDatos();
		letra();
	
}
}
