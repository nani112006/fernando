package Ejercicio_51_new;

import java.util.Scanner;

public class Ejercicio_51_new {
	
	static boolean elcoso;
	
	static Scanner datos = new Scanner (System.in);
	
	public static boolean ingresarNum() {
	
		System.out.println("Ingrese un numero cualquiera: ");
		int num = datos.nextInt();
		
		if ( num > 0  ) {
			elcoso = true;
		}
		
		else{
			elcoso = false; 
		}
		
		return elcoso;
	}
	
	public static void lacosa () {
		
		
		if ( ingresarNum() == true ) {
			System.out.println(elcoso);
		}
		
		else {
			System.out.println(elcoso);
		}
		
		
	}

	public static void main(String[] args) {
		lacosa();
		
		
	}

}
