package Ejercicio_47;

public class Ejercicio_47 {
	public class EmparejarNumerosConCaracteres {
	    
	        
	        int[] numeros = {1, 2, 3, 4, 5};
	        char[] caracteres = {'A', 'B', 'C', 'D', 'E'};
	        
	        if (numeros.length != caracteres.length) {
	            System.out.println("Los arrays deben tener el mismo tama�o.");
	            return;
	        }
	        
	       
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("N�mero: " + numeros[i] + " - Car�cter: " + caracteres[i]);
	        }
	    }
	


}
