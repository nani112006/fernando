package Ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		float n1;
		int n2;
		
		System.out.println("ingrese un numero: ");
		
		n1 = datos.nextFloat();
		
		double raiz_cuadrada = Math.sqrt(n1);
		
		int raiz_cuadrada1 = (int) raiz_cuadrada;
		
		System.out.println( "El valor de la raiz es: " + raiz_cuadrada);
		System.out.println( "El valor de la raiz en entero: " + raiz_cuadrada1);

	}

}
