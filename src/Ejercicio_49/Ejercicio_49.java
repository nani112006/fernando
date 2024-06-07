package Ejercicio_49;

import java.util.Scanner;

public class Ejercicio_49 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int[] dni = new int[4];
		
		
		for (int i = 0; i < dni.length; i++) {
			
			System.out.println("Ingresa una lista de DNI: ");
			dni[i]= datos.nextInt(); 
		
		}
		datos.close();
	}

}
