package Ejercicio_39_Enum;

public enum Mes {
	ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
	}

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un mes (por ejemplo, ENERO, FEBRERO, etc.):");
        String entrada = scanner.next().toUpperCase();  // Leer la entrada y convertirla a mayúscula

        Mes mes;
        
        try {
            mes = Mes.valueOf(entrada);
            System.out.println("Has ingresado el mes: " + mes);
        } catch (IllegalArgumentException e) {
            System.out.println("Mes ingresado no es válido.");
        }

        scanner.close();
        
    }
    }