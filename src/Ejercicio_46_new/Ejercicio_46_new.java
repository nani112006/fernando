package Ejercicio_46_new;

import java.util.Scanner;

public class Ejercicio_46_new {
	public static void main(String[] args) {
		
	Scanner datos = new Scanner (System.in);

	enum_46 pais;
	String paises;
	
	System.out.println("Ingrese el nombre de un pais: ");
	String dato = datos.nextLine().toUpperCase();
	
	pais = enum_46.valueOf(dato);
	
	switch(pais) {
	case Argentina: 
	case Chile: 
	case Brasil:
	case Peru: 
	case Ecuador: 
	case Uruguay: 
	case Paraguay: 
	case Venezuela:
	case Colombia:
	case Bolivia: 
	case Surinam:
	System.out.println("El pais "+pais.name().toLowerCase()+" es de sudamerica.");
	break;
	default: 	
	System.out.println("El pais "+pais.name().toLowerCase()+" no es de sudamerica.");
	break;
	}
	 System.out.println("\nPaises ordenados alfebericamente:");
	 for(String orde : pais){
	  System.out.println(orde);
	 }
	 
	}
}