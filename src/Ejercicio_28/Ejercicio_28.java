package Ejercicio_28;

import java.util.Scanner;

public class Ejercicio_28 {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner (System.in);
		
		int bateria = 100;
		boolean seguir = true ;
		String pres;
		
		System.out.println("presione NO para empezar");
		
		pres = datos.next();
		
		if ( pres.equals("NO")) {
			
		System.out.println("bateria: 100");
		
		while (seguir) {
			bateria--;
			System.out.println("bateria: " + bateria + "%");
			Thread.sleep(20);
			if ( bateria == 20) {
				System.err.println("bateria baja :v");
				Thread.sleep(1000);
			}
			if ( bateria == 0 ) {
				System.err.println("se le acabo la bateria mini edgar");
				seguir = false;
			}
			
		}
		
		}
		
		System.out.println("ERROR");

	}

}
