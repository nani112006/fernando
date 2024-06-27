package Ejercicio_44_new;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_44_new {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		String[] equipos = new String[3];
		
		List<String> nom = new ArrayList<>();
		
		System.out.println("Ingrese los nombres de los equipo: ");
		
		for (int i = 0; i < equipos.length; i++) {
			equipos[i] = datos.nextLine();
			for (String frase : equipos) {
	            if (frase.contains("fin")) {
	                System.out.println("Se encontró la palabra 'fin' en la frase: " + frase);
	                // Aquí puedes añadir el código que se debe ejecutar si se encuentra la palabra "fin"
	                break; // Detiene el bucle
	            }
	        }
		}
		
		
	}
}
