package Ejercicio_9;

import java.util.Scanner;

public class Ejercicio_9 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		String nombre, apellido;
		int num;
		
		System.out.println("Ingrese su nombre: ");
		nombre= datos.next();
		System.out.println("Ingrese su apellido: ");
		apellido = datos.next();
		
		int numeroAleatorio;
		
		numeroAleatorio = (int)(Math.random()*99);
		
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Tu numero del bingo es: "+numeroAleatorio);
	}

}
