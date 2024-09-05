package GestionTareas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GestionTareas {
	
	static Queue<String> colas = new LinkedList();
	static Scanner datos = new Scanner (System.in);	
	static String descrip;
	
	public static void tareas () {
		
		
		
		int opcion;
		do {
            System.out.println("Men� de Navegaci�n:");
            System.out.println("1. A�adir una tarea nueva.");
            System.out.println("2. Ejecutar la tarea siguiente.");
            System.out.println("3. Mostrar tareas en espera.");
            System.out.println("4. Salir.");
      
            
            
			opcion = datos.nextInt();
            System.out.println();
            datos.nextLine();

            switch (opcion) {
                case 1:
                	A�adir();
                    break;
                case 2:
                	Ejecutar();
                    break;
                case 3:
                	Mostrar();
                    break;
                case 4:
                	System.out.println("salir del gestion de tareas");
                    break;
                default:
                    System.out.println("Esta opci�n es corecta, elige una opci�n del 1 al 4.");
                    System.out.println();
            }
	}
		while (opcion != 4);
	}
	
	
	public static String A�adir () {
		System.out.println("Porfavor, ingrese la descripcion de la tarea");
		descrip = datos.nextLine();
		System.out.println();
		
		colas.offer(descrip);
		return descrip;
	}
	
	public static void Ejecutar () {
		if (!colas.isEmpty()) {
			System.out.println(descrip);
			colas.poll();
		}
		
		else {
			System.out.println("No hay tareas q ejecutar.");
			System.out.println();
		}
		
		
	}
	
	public static void Mostrar () {
		if (!colas.isEmpty()) {
            System.out.println("Historial de navegaci�n:");
            for (String lacosa : colas) {
                System.out.println(lacosa);
                System.out.println();
            }
        } else {
            System.out.println("El historial est� vac�o.");
            System.out.println();
        }

	}
	public static void main(String[] args) {
		
		tareas();
	}

}
