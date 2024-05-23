package Ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner (System.in);
		
		float nota;
		
		System.out.println("cuanto te sacaste de nota?");
		
		nota = datos.nextFloat();
		
		int numRedondeado = (int) Math.round(nota);
		
		System.out.println("El redondeado de la nota: " + numRedondeado);
		

	}

}
