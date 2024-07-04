package Evaluacion_jose;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evaluacion_jose {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		List<String> nom = new ArrayList<>(); 
		List<String> ape = new ArrayList<>(); 
		List<Integer> nume = new ArrayList<>(); 
		List<Integer> n = new ArrayList<>(); 
		
		System.out.println("Ingrese la cantidad de empleados a registrar: ");
		int numero = datos.nextInt();
		
		for (int i = 0; i <= numero; i++) {
			System.out.println("Ingrese nombre: ");
			nom.add(datos.next());
			System.out.println("Ingrese apellido: ");
			ape.add(datos.next());
			System.out.println("Ingrese numero de legajo de 5 cifras: ");
			nume.add(datos.nextInt());
		}
			for (int o = 0; o < numero - 1; o++) {
				for (int j = 0; j < numero - o - 1; j++) {
					if (nume.get(j) > nume.get(j + 1)) {
						
						int tempDNI = nume.get(j);
						nume.set(j, nume.get(j + 1));
						nume.set(j + 1, tempDNI);

						String tempApellido = ape.get(j);
						ape.set(j, ape.get(j + 1));
						ape.set(j + 1, tempApellido);
						
						String temnombre = ape.get(j);
						ape.set(j, ape.get(j + 1));
						ape.set(j + 1, temnombre);
					}
				}
			}

			System.out.println("--------------------------------------");
			System.out.println("Lista de numeros de legajo ordenada:");
			for (int t = 0; t < nume.size(); t++) {
				System.out.println("numeros de legajo " + (t + 1) + " nombre: " + nom.get(t) + " apellido: " + ape.get(t) ); 
			}
			boolean buscarOtro = true;
				System.out.println("\nIngrese un numero de legajo a buscar: ");
				int nume_buscado = datos.nextInt();

				boolean encontrado = false;
				for (int e = 0; e < nume.size(); e++) {
					if (nume_buscado == nume.get(e)) {
						System.out.println("El numero de legajo " + nume_buscado + " nombre: " + nom.get(e) + " apellido: " + ape.get(e));
						break;}
					else {
						System.err.println("No existe este numeros de legajo");
						System.err.println("Programa Finalizado");
					break;
					}
					
				}
			
	}
	}