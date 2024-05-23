package Ejercicio_42;

import java.util.Scanner;

public class Ejercicio_42 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int numeroAleatorio = 0;
		int[] n1 = new int [4];
		
		numeroAleatorio = (int) (Math.random()*50);
		
		for(int i=1; i<=3; i++) {
			System.out.println("Ingresa un numero: ");
			n1 [i] =datos.nextInt();
			
			if ( numeroAleatorio == n1 [i]) {
				System.out.println("Ganaste sos un Puto Crack.");
				break;
			}
			if ( i >= 3 ) {
				System.err.println("Perdiste Fracadsado :v ");
				break;
			}
			
		}
		
	}

}
