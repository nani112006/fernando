package Ejercicio_44_new;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_44_new {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		List<String> nom = new ArrayList<>();
		
		System.out.println("Ingrese los nombres de los equipo(si desea terminar escriba 'fin') ");
		String nom1 = datos.nextLine();
			
			while (!nom1.contains("fin")) {
				
				nom.add(nom1);
				nom1 = datos.next();
	        }
			
			HashSet<String> set = new HashSet<>(nom);
			
			nom.clear();
			
			nom.addAll(set);
			
			Collections.sort(nom);			
			
			System.out.println("\nLos equipos ingresados fueron: ");
			
			for (String nomequi : nom) {
				System.out.println(nomequi);
				}
			System.out.println("\nCantidad de elementos: " + nom.size());
	}
}
