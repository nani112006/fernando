package Ejercicio_19;

import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int num;
		
		 System.out.println("Elija una opcion: ");
		 System.out.println("1. café cortado");
		 System.out.println("2. café Latte " );
		 System.out.println("3. café Solo " );
		 System.out.println("4. café Lagrima " );
		 System.out.println("5. Salir del programa.");
		 
		 num = datos.nextInt();
		 
		 switch (num) {
		 
		 case 1: System.out.println("usted a elegido Café Cortado. ");
			break;
		 case 2: System.out.println("usted a elegido Café Latte. ");
			break;
		 case 3: System.out.println("usted a elegido Café Solo. ");
			break;
		 case 4: System.out.println("usted a elegido Café Lagrima. ");
			break;
		 case 5: System.out.println("usted a elegido Salir del programa. ");
			break;

		default: System.out.println("esa opcion no se encuentra en el sistema");
			break;
		}

	}

}
