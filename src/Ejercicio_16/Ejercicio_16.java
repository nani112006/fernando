package Ejercicio_16;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		int minu,hora, segundos;
	
		System.out.println("ingrese una hora: ");
		hora = datos.nextInt();
		
		System.out.println("ingrese los minutos: ");
		minu = datos.nextInt();
		
		System.out.println("ingrese los segundos");
		segundos = datos.nextInt();
		
		
		
		
		if (hora >= 1 && hora <= 24 && minu >= 0 && minu <= 60 && segundos >= 0 && segundos <= 60 ) {
			System.out.println("su horario es valida");
		}
		
		else {
			System.out.println("su horario no es valido");
		}
		
		
	}
}
	
