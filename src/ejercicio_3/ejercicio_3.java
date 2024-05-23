package ejercicio_3;

import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		float suma , resta, multi, divis, n1, n2;
		
		
		System.out.println( "\nEscriba el 1er num.: " );
		
		n1 = datos.nextFloat();
			
		System.out.println( "\nEscriba el 2do num.: " );
		
		n2 = datos.nextFloat();	
		
		
		suma = n1 + n2;
		
		resta = n1 - n2;
		
		multi = n1 * n2;
		
		divis = n1 / n2;
		
		int sumaInt = (int) suma;
		int restaInt = (int) resta;
		int multiInt = (int) multi;
		int divisInt = (int) divis;
		
		System.out.println( "\nresultado de la suma: "+ suma);
		System.out.println( "\nresultado de la suma entera: "+ sumaInt);
		System.out.println( "\nresultado de la resta: "+ resta);
		System.out.println( "\nresultado de la resta entera: "+ restaInt);
		System.out.println( "\nresultado de la multi.: "+ multi);
		System.out.println( "\nresultado de la multi. entera: "+ multiInt);
		System.out.println( "\nresultado de la divis.: "+ divis);
		System.out.println( "\nresultado de la divis.entera: "+ divisInt);
	}

}
