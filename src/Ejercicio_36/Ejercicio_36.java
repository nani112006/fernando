package Ejercicio_36;

import java.util.Scanner;

public class Ejercicio_36 {

	public static void main(String[] args)throws InterruptedException {
		Scanner datos = new Scanner (System.in);
		
		int suma = 0, ingremin = 999, ingremax = -999;
		int hora1, hora2 = 0, hora3 = 0;
		
		for ( int hora = 1 ; hora <= 9   ; hora++ ) {
			
			System.out.println("\ncuantos ingresos hubo en la hora: "+ hora + "?");
			hora1 = datos.nextInt();
			
			suma = (int)hora1 + suma;

			if( hora1 < ingremin){
				ingremin = hora1;
				hora3 = hora;
				
			}
			

			if( hora1 > ingremax){
				ingremax = hora1;
				hora2 = hora;
			}
	
		}
	
		System.out.println("\nIngreso mas alta en la hora: " + hora2 + " y la cantidad fue de: " + ingremax );
		System.out.println("\nIngreso mas baja en la hora: " + hora3 + " y la cantidad fue de: " + ingremin );
		System.out.println("\nIngreso total: " + suma );
	}

}
