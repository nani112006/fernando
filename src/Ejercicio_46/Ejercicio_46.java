package Ejercicio_46;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio_46 {
	public static void main(String[] args) {
			Scanner datos = new Scanner (System.in);
		
		int ingreso;
		
		HashMap< Integer,String> nMap = new HashMap<>();
		
        nMap.put(1011, "Enrique");
        nMap.put(2367, "Liliana");
        nMap.put(8748, "Lucas");
        nMap.put(9121, "Juan");
        nMap.put(817, "Fliorella");
        nMap.put(6423, "Ariel");
        nMap.put(2034, "Daiana");
        
        	System.out.println("Para encontrar a un individuo, ingresar número de socio:");
			ingreso = datos.nextInt();
			
			String na = nMap.get(ingreso);
			
			if ( ingreso % 2 == 1){
				System.out.println("codigo: " + ingreso);
				System.out.println("nombre: " + na  );
		}
	}
}