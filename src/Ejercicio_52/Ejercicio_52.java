package Ejercicio_52;

import java.util.Scanner;

public class Ejercicio_52 {
	
	static float plata;
	
	static Scanner escan = new Scanner (System.in);
	
	public static float costo () {
		
		System.out.println("ingrese el monto a cobrar");
		plata = escan.nextFloat();
		
		if ( plata >= 15000) {
			System.out.println("se le aplico una promo del 10% ");
		}
		else {
			int cash = (int)plata;
			System.out.println("su total a cobrar es: " + cash);
		}
		
		return plata;
	}
	public static float promo(float cosa) {
		
		float descuento = plata * 0.10f;
		
		float total = plata - descuento;
		System.out.println("monto a cobrar es de: " + total);
		
		return total;
	}
	
	
	public static void main(String[] args) {
		promo(costo());
		
	}

}
