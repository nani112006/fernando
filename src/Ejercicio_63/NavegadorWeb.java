package Ejercicio_63;

import java.util.Scanner;
import java.util.Stack;

public class NavegadorWeb {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		Stack<Integer> historial = new Stack <Integer>();
		
		historial.push(1);
		
		
		Stack<Integer> adelante = new Stack <Integer>();
		int num;
		
		for (int i = 0; i < 5; i++) {			
		
			System.out.println("Elija una opcion: ");
			 System.out.println("1. Visitar una página nueva.");
			 System.out.println("2. Volver atrás. " );
			 System.out.println("3. Avanzar. " );
			 System.out.println("4. Mostrar historial." );
			 System.out.println("5. Salir.");
			 
			 num = datos.nextInt();
			 
			 switch (num) {
			 
			 case 1: System.out.println(". ");
				break;
			 case 2: System.out.println("Ingrese un URL . ");
				break;
			 case 3: System.out.println("usted a elegido Café Solo. ");
				break;
			 case 4: System.out.println("usted a elegido Café Lagrima. ");
				break;
			 case 5: System.out.println("usted a elegido Salir del programa. ");
				break;
			
			}
		}
	}
}