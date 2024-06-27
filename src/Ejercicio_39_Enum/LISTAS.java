package Ejercicio_39_Enum;

import java.util.Scanner;

public class LISTAS {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Mes mes;
		
		System.out.println("elija un mes del año: ");
		String mes1 = scanner.next();
		
		mes = Mes.valueOf(mes1);
		
		
		switch(mes) {
		case ENERO: System.out.println("este mes tiene 31 dias");break;
		case FEBRERO:System.out.println("este mes tiene 28 dias");break;
		case MARZO:System.out.println("este mes tiene 31 dias");break;
		case ABRIL:System.out.println("este mes tiene 30 dias");break;
		case MAYO:System.out.println("este mes tiene 31 dias");break;
		case JUNIO:System.out.println("este mes tiene 30 dias");break;
		case JULIO:System.out.println("este mes tiene 31 dias");break;
		case AGOSTO:System.out.println("este mes tiene 31 dias");break;
		case SEPTIEMBRE:System.out.println("este mes tiene 30 dias");break;
		case OCTUBRE:System.out.println("este mes tiene 31 dias");break;
		case NOVIEMBRE:System.out.println("este mes tiene 30 dias");break;
		case DICIEMBRE:System.out.println("este mes tiene 31 dias");break;
		}
		
	}

}
