package Ejercicio_19;

import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int num;
		
		 System.out.println("Elija una opcion: ");
		 System.out.println("1. caf� cortado");
		 System.out.println("2. caf� Latte " );
		 System.out.println("3. caf� Solo " );
		 System.out.println("4. caf� Lagrima " );
		 System.out.println("5. Salir del programa.");
		 
		 num = datos.nextInt();
		 
		 switch (num) {
		 
		 case 1: System.out.println("usted a elegido Caf� Cortado. ");
			break;
		 case 2: System.out.println("usted a elegido Caf� Latte. ");
			break;
		 case 3: System.out.println("usted a elegido Caf� Solo. ");
			break;
		 case 4: System.out.println("usted a elegido Caf� Lagrima. ");
			break;
		 case 5: System.out.println("usted a elegido Salir del programa. ");
			break;

		default: System.out.println("esa opcion no se encuentra en el sistema");
			break;
		}

	}

}
