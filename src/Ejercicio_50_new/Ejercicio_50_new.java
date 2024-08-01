package Ejercicio_50_new;
import java.util.Scanner;

public class Ejercicio_50_new {
	static Scanner datos = new Scanner (System.in);
	static String nombre;
	
	public static void ingresarNombre1() {
		System.out.println("Ingrese su nombre:");
		nombre = datos.nextLine();
	}
	
	public static void mostrarDatos() {
		System.out.println(nombre);
	}
	
	
	public static void main(String[] args) {
		ingresarNombre1();
		ingresarNombre1();
		ingresarNombre1();
		
		System.out.println("");
		 mostrarDatos();
		 mostrarDatos();
		 mostrarDatos();
		
	}

}
