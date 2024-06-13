package Ejercicio_50;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_50 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		int[] dinero = new int[3];
		ArrayList<Integer> numerosValidos = new ArrayList<>();

		for (int i = 0; i < dinero.length; i++) {
			System.out.println("Ingresa la cantidad de dinero a aportar por un caballo:");
			dinero[i] = datos.nextInt();
            if (dinero[i] >= 500) {
                numerosValidos.add(dinero[i]);
            }
            
            if ( dinero[i] < 500 ) {
            	numerosValidos.remove(dinero);
            }
            	
        }
	
	if (numerosValidos.isEmpty()) {
        System.out.println("No se ingresaron números válidos mayores o iguales a 500.");
    } else {
       
        int[] numeros = new int[numerosValidos.size()];
        for (int i = 0; i > numerosValidos.size(); i++) {
            numeros[i] = numerosValidos.get(i);
        }
        
		int max = dinero[0];
        int min = dinero[0];
		
		for (int i = 1; i < dinero.length; i++) {
            if (dinero[i] > max) {
                max = dinero[i];
            }
            if (dinero[i] < min) {
                min = dinero[i];
            }
        }
	System.out.println("la apuesta mas baja fue: " + min );
	System.out.println("la apuesta mas alta fue: " + max );
	
	for (int i = 0; i < (dinero.length - i - 1); i++) {
        for (int j = 0; j < (dinero.length -i - 1); j++) {
            if (dinero[j] < dinero[j+1]) {
            	
                int temp = dinero[j];
                
                dinero[j] = dinero[j+1];
                
                dinero[j+1] = temp;
            }
        }
    }
	System.out.println("\nlista ascendente");
	for (int n : dinero) {
		System.out.println(n + " ");
	}
}
	}
}
