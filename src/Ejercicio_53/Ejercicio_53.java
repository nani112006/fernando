package Ejercicio_53;

import java.util.Scanner;

public class Ejercicio_53 {
	static Scanner datos = new Scanner (System.in);
	
	public static int ingresarNotas() {
	int nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, nota5 = 0, notamin = 999, notamax = -999;
	int calif = 0;
	double divis;
	int suma;
	  
	  for ( int nota = 1 ; nota <= 5   ; nota++ ) {
			System.out.println("ingrese una calificacion:" );
				calif = datos.nextInt();
								
				System.out.println("calificaion es: " + calif);
				
				if ( nota == 1 ) {
				    nota1 = calif;
				}
				
				if ( nota == 2 ) {
					nota2 = calif;
				}
				
				if ( nota == 3 ) {
					nota3 = calif;
				}
				
				if ( nota == 4 ) {
					nota4 = calif;
				}
				
				if ( nota == 5 ) {
					nota5 = calif;
				}
				
				if( nota  < notamin){
					notamin = nota;
				}
			
				if( nota > notamax){
					notamax = nota;
				}
			}
			
			suma = nota1 + nota2 + nota3 + nota4 + nota5;
			divis = suma / 5 ;
			System.out.println("nota total: " + suma );
			System.out.println("nota promedio: " + divis );
			System.out.println("la nota mas baja fue: " + notamin );
			System.out.println("la nota mas alta fue: " + notamax );
	
return calif;
	}
	public static void main(String[] args) {
		ingresarNotas();
		
	}

}
