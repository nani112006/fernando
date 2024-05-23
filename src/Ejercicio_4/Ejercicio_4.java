package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		
		int años, meses, semanas, dias, suma, años1, meses1, semanas1;
		
		System.out.println( "ingrese años: ");
		
		años = datos.nextInt();
		
		System.out.println("ingrese meses: ");
		
		meses = datos.nextInt();
		
		System.out.println("ingrese semanas: ");
		
		semanas = datos.nextInt(); 
		
		años1 = años * 365;
		
		meses1 = meses * 30;
		
		semanas1 = semanas * 7;
		
		dias = años1 + meses1 + semanas1;
		
		System.out.println( "el tiemmpo total en dias es de: " + dias);
		
		
		

	}

}
