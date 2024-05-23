package Ejercicio_29;

import java.util.Scanner;

public class Ejercicio_29 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner datos = new Scanner (System.in);
		
		String pres;
		
		System.out.println("presione NO para empezar ");
		pres = datos.next();
		if ( pres.equals("NO")) {
		for ( int bateria = 100 ; bateria != 0 ; bateria-- ) {
			
			System.out.println("bateria: " + bateria + "%");
			Thread.sleep(20);
			
			if ( bateria == 20 ) {
				System.err.println("bateria  baja");
				Thread.sleep(1000);
			}
			
			if ( bateria == 1 ) {
				System.err.println("Bateria agotada");
				break;
			}
				// En comparacion con for no necesite mas codigos q utilizando while//
		}
	}		
	}

}
