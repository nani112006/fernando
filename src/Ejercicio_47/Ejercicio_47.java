package Ejercicio_47;

public class Ejercicio_47 {
	public class EmparejarNumerosYCaracteres {

	        // Definir arrays de n�meros y caracteres
	        int[] numeros = {1, 2, 3, 4, 5};
	        char[] caracteres = {"A","B","C","D","E"};
	        
	        // Asegurarse de que los arrays tengan la misma longitud
	        if (numeros.length == caracteres.length) {
	            System.out.println("Los arrays no tienen la misma longitud.");
	            return;
	        }
	        
	        // Emparejar n�meros con caracteres
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("N�mero: " + numeros[i] + ", Caracter: " + caracteres[i]);
	        }
	    
	}


}
