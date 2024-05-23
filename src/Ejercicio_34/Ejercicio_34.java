package Ejercicio_34;

import java.util.Scanner;

public class Ejercicio_34 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner datos = new Scanner (System.in);
		
		int meses;
		int plata;
		
		System.out.println("ingrese por cada mes cuanta plata se ingreso");
		
		for ( meses = 1 ; meses <= 12   ; meses++ ) {
		
			System.out.println("\nen el mes: " + meses + ":" );
			plata = datos.nextInt();
			
			if ( plata > 100000 ) {
				System.out.println("\nen el mes: " + meses + " se ingreso: " + plata );
				Thread.sleep(2000);
			}
			
			if ( plata < 100000 ) {
				System.out.println("\nen el mes: " + meses + " se ingreso menos de 100000 " );
				Thread.sleep(2000);
			}
			
		}
		
		
		
	}
	
	
	
}
