package Ejercicio_8;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		double base, exponente = 2 ;
		
		
		System.out.println("Ingresa un mumero: ");
		base = datos.nextDouble();
		
		
		double potencia = Math.pow(base,exponente);
		
		int potencia1 = (int) potencia;		
		double numeroAleatorio1 = Math.random()*1;
		
		double resultado = potencia1 + numeroAleatorio1;
		
		double resultado1 = resultado * 7;
		
		double raiz_cuadrada = Math.sqrt (resultado1);
		
		System.out.println("El resultado es: " + raiz_cuadrada);
		
		
	}

}
