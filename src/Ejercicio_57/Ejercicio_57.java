package Ejercicio_57;

import java.util.Scanner;

public class Ejercicio_57 {
	static Scanner datos = new Scanner (System.in);
	
	public static void email() {
		System.out.println("Ingrese su email:");
		String email = datos.next();
		
		int a = email.indexOf("@");
		int punto = email.indexOf(".");
		
		if (a ) {
			
		}
	}
	public static void contraseña() {
		System.out.println("Ingrese su contraseña:");
		String con = datos.next();
	}
	
	
	public static void main(String[] args) {
	email();
	contraseña();
}
}