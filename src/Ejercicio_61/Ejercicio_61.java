package Ejercicio_61;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_61 {
	
	
	static Scanner datos = new Scanner (System.in);
	public static void name() {
		
		ArrayList<String>Nom = new ArrayList<>();
		Nom.add("Enrique");
		Nom.add("Liliana");
		Nom.add("Lucas");
		Nom.add("Juan");
		Nom.add("Fiorella");
		Nom.add("Ariel");
		Nom.add("Daiana");

		
		ArrayList<Integer>Num  = new ArrayList<>();
		Num.add(1011);
		Num.add(2367);
		Num.add(8748);
		Num.add(9121);
		Num.add(817);
		Num.add(6423);
		Num.add(2034);		
		
		try {
			System.out.println("ingrese un numero de socio, para encontrar a un individuo" );
			int ingreso =  datos.nextInt();
	       
	        
	         if(ingreso == Num.get(ingreso) ) {
	        	 
	        	 System.out.println("hola");
	        	 
	         }
	        
	        
	   
	         
	         
		} catch (Exception e) {
			
		}
	}
	public static void main(String[] args) {
		name();
	}
	
}
