package Ejercicio_25;

import java.util.Scanner;

public class Ejercicio_25 {

	public static void main(String[] args)throws InterruptedException{
		
		Scanner datos = new Scanner (System.in);
		
		String NO, SI = "SI" ;
		boolean seguir = true;
		
		
		while (seguir) {
			
			System.out.println("pap�, pap�.�puedo salir? ");
			NO = datos.next();
			
			
			if ( NO.equals(SI) ) {
				seguir = false;
			}
		}
	}
}
