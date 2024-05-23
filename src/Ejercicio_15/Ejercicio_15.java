package Ejercicio_15;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		double divis, multi, suma;
		int costo;
		
		System.out.println("digite su precio de compra: ");
		costo = datos.nextInt();
		
		if ( costo >= 15000 ) {
			
			divis = 10 / 100 ;
			multi = costo * 0.1 ;
			suma = costo - multi  ;
			
			System.out.println("Se le desconto un 10% por su compra ");
			System.out.println("Su precio total es de: " + suma );
		}
		
		else if ( costo <= 15000 ) {
			System.out.println("Su precio total es de: "+ costo);
		}
		
		
	}

}
