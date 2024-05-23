package Ejercicio_27;

import java.util.Scanner;

public class Ejercicio_27 {
public static void main(String[] args) {
	Scanner datos = new Scanner (System.in);
	
	int contra, contra1;
	int intentos = 0;
	boolean seguir = true;
	
	System.out.println("Ingresa una contraseña: ");
	contra = datos.nextInt();
	
	while ( seguir ) {
		
		if ( contra == 2006 ) {
		System.out.println("contraseña correcta");
		seguir = false;
		break;
		}
		
		intentos++;
		System.out.println("La contraseña es incorecta. usted intento: " + intentos + ", intentalo de nuevo");
		contra = datos.nextInt();
	    
		if ( intentos == 2 ) {
		System.out.println("usted agoto el limite de intentos. sea a bloqueado su usuario");
		seguir = false;
		}
	}
	
	}
	
	
}