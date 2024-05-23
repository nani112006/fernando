package Ejercicioo_38;

public class Ejercicioo_38 {

	public static void main(String[] args) {
		
		int nummin = 999, nummax = -999;
		int hora;
		int clien1, clien2, clien3, clien4, clien5;
		
		for (hora = 9; hora <=19 ; hora+=2) {
			
			int numAleatorio = (int)(Math.random()*100);
			
			System.out.println("\nIngresaron: " + numAleatorio + " clientes en la hora: "+hora);
			if ( hora == 11 ) {
				clien1 = numAleatorio;
			}
			
			if ( hora == 13 ) {
				clien2 = numAleatorio;
			}
			
			if ( hora ==  15) {
				clien3 = numAleatorio;
			}
			
			if ( hora == 17 ) {
				clien4 = numAleatorio;
			}
			
			if ( hora == 19 ) {
				clien5 = numAleatorio;
			}
			if( hora  < nummin){
				nummin = hora;
			}

			if( hora > nummax){
				nummax = hora;
			}

			
			}
				
		System.out.println("Maxima cantidad se clientes en la hora: "+ nummax);
		System.out.println("Minima cantidad se clientes en la hora: "+ nummin);
	}

}
