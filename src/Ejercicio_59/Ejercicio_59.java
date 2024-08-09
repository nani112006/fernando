package Ejercicio_59;

import java.util.Scanner;

public class Ejercicio_59 {
	public static void main(String[] args) {
		Scanner d = new Scanner (System.in);
		
		
		
try {
        	
	System.out.println("Ingrese su edad:");
	int edad = d.nextInt();
    		
    		if (edad < 0) {
                throw new ArithmeticException();
              
            }
    		
            
            if (edad < 0) {
                throw new ArithmeticException();
        
            }
            
            if (edad == 0) {
            	throw new  ArithmeticException();
            }
     
        }catch (ArithmeticException e) { 
            System.out.println("Error: la edad ingresada en negativa o es 0.");
        } 
        
}
}