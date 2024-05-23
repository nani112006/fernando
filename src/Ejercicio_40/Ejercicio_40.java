package Ejercicio_40;

import java.util.Scanner;

public class Ejercicio_40 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int[] temp = new int[6];
		int suma = 0, divis;
		
		for ( int i = 1; i <=5 ; i++ ) {
			
			System.out.println("ingrese una temperatura");
			temp[i] = datos.nextInt();
			
			suma = (int)temp[i] + suma;
		}
		
		divis = suma / 5;
		System.out.println("\npromedio de la temp.: " + divis);
		
	}

}
