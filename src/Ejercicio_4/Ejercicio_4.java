package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		
		int a�os, meses, semanas, dias, suma, a�os1, meses1, semanas1;
		
		System.out.println( "ingrese a�os: ");
		
		a�os = datos.nextInt();
		
		System.out.println("ingrese meses: ");
		
		meses = datos.nextInt();
		
		System.out.println("ingrese semanas: ");
		
		semanas = datos.nextInt(); 
		
		a�os1 = a�os * 365;
		
		meses1 = meses * 30;
		
		semanas1 = semanas * 7;
		
		dias = a�os1 + meses1 + semanas1;
		
		System.out.println( "el tiemmpo total en dias es de: " + dias);
		
		
		

	}

}
