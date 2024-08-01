package Ejercicio_45_new;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_45_new {
	  public static void main(String args[]) {
	  
			ArrayList<String> paises = new ArrayList<>();
			paises.add("Argentina");
			paises.add("Chile");
			paises.add("Uruguay");
			paises.add("Paraguay");
			paises.add("Bolivia");
			paises.add("Brasil");
			paises.add("Peru");
			paises.add("Ecuador");
			paises.add("Colombia");
			paises.add("Venezuela");
			paises.add("Surinam");
			
		Scanner datos = new Scanner (System.in);
		 
		 for (int i= 0; i<=3; i++){
		 System.out.println("Ingrese el nombre de un pais: ");
		 String pais = datos.nextLine();
		 
		 if (paises.contains(pais)){
		      System.out.println(pais+" es de Sudamerica");
		 break;
		 }
		 else {
		      System.out.println(pais+" no es de Sudamerica");
		 }
		 }
		  System.out.println("\nPaises ordenados alfebericamente:");
		 for(String orde : paises){
		  System.out.println(orde);
		 }
				
	  }
	}