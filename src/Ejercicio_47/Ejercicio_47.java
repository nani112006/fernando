package Ejercicio_47;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_47 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		int[] notas = new int [3];
		String ap;
		int l=0;
		
		int length = notas.length;
		
		for (int i = 0; i < length; i++) {
			l++;
			System.out.println("ingrese las nota N°: " + l + " del alumno");
			notas[i] = datos.nextInt();
		}
		
		System.out.println("porfavor ingrese el apellido del fracasado");
			ap = datos.next();
		
		System.out.println("\nalumno: " + ap);
		System.out.println("notas del fracasado: ");
		for (int i : notas) {
			System.out.println(i);
		} 
			
		Arrays.sort (notas);
		
		System.out.println("\nnotas en orden del fracasado: ");
		
		for (int nt : notas) {
			System.out.println(nt);
		}
		
		
		
		
	}


}
