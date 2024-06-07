package Ejercicio_48;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_48 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		String[] ap = new String[4];
		
		
		for (int i = 0; i < ap.length; i++) {
			System.out.println("Ingrese un apellido. ");
			ap[i] = datos.next();
			
		}
		Arrays.sort(ap);
		
		System.out.println("El primer apellido alfabeticamente es: "+ap[0]);
		
		datos.close();
		
	}

}
