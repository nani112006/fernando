package Ejercicio_49;

import java.util.Scanner;

public class Ejercicio_49 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int[] dni = new int[4];
		
		
		for (int i = 0; i < dni.length; i++) {
			
			System.out.println("Ingresa una lista de DNI: ");
			dni[i]= datos.nextInt(); 
		}
		
		for (int i = 0; i < (dni.length - i - 1); i++) {
			
            for (int j = 0; j < (dni.length -i - 1); j++) {
            	
                if (dni[j] < dni[j+1]) {
                	
                    
                    int temp = dni[j];
                    
                    dni[j] = dni[j+1];
                    
                    dni[j+1] = temp;
                }
            }
        }
		
		
		
		System.out.println("\nlista ascendente");
		for (int n : dni) {
			System.out.println(n + " ");
		}
		
		for (int i = 0; i < (dni.length - 1); i++) {
			 
			for (int j = 0; j < (dni.length - i - 1) ; j++) {

				if (dni[j] > dni[j + 1]) {
					
					int temporal = dni[j];
					
					dni[j] = dni[j + 1];
					
					dni[j + 1] = temporal;
				}
			}
		}
		
		
		System.out.println("\nlista descendente");
		for (int num : dni) {
			System.out.println(num);
			
		}
		
				
		
		
			
		datos.close();
	}

}
