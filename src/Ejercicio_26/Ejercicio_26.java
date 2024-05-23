package Ejercicio_26;

import java.util.Scanner;

public class Ejercicio_26 {
public static void main(String[] args) {
	Scanner datos =  new Scanner (System.in);
	
	int contra;
	int intentos = 0;
	
	System.out.println("Ingresa una contraseña: ");
	contra = datos.nextInt();
	
	while (contra != 2006 ) {
		intentos++;
		System.out.println("La contraseña es incorecta. usted intento: " + intentos + ", intentalo de nuevo");
		contra = datos.nextInt();
		if ( intentos == 2 ) {
		System.out.println("usted agoto el limite de intentos. sea a bloqueado su usuario");
		break;
		}
	}
	if ( contra == 2006 ) {
		System.out.println("contraseña correcta");
	}
	}
}
