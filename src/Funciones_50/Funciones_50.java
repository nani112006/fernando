package Funciones_50;

import java.util.Scanner;

public class Funciones_50 {
	 static Scanner entrada = new Scanner(System.in);
	
	static String Apellido, nombre, tra;
	static int filtrarEdad,edad = 20;
	static float altura = 1.8f;
	static public void ingresarNombre() {
		/*�Lleva par�metros y argumentos esta funci�n?�Por qu�? Definir par�metros y argumentos.*/
		/*No lleva parametros ni tampoco argumentos. porque no se encuentran los parametros. parametros : valor que se espera de la funcion. argumentos: */
		
		System.out.println("Ingrese un nombre: ");
		nombre = entrada.next();
		
		/*�Cu�l es la variable local, y cu�l la global? Mencion� dos diferencias entre variables locales y globales.*/
		/*una diferencia entre estos es q la variable global ocupa mayor espacio mientras q la local es algo parecido a la ram*/
		
		System.out.println("Ingrese un apellido: ");
		Apellido = entrada.next();
		
		/*otra diferencia es q la variable local pertenece a cada funcion mientras q la global*/ 
		
	}
	static public float almacenarAltura(float alt) {
		alt= altura;
		return alt;
		
/*Coment� el proceso, es decir: variable global -> argumento -> par�metro -> funci�n -> retorno -> mostrar resultado en un syso.
Ahora, en el argumento de la funci�n principal, en vez de colocar �altura�, coloc� 1.75f. �Qu� ocurri�? 
*/
	}
	static public int filtrarEdad(int edad) {
		edad = filtrarEdad;
		if ( edad >= 18) {
			System.out.println(edad);
		}
		
		else {
			System.err.println("es menor");
			return-1;
		}
		return edad;
		/*�Puede colocarse la palabra reservada �return� �nicamente en el if?*/
/*Seg�n la respuesta anterior, explic� por qu� crees que te ped� que retorne -1 en caso de que la persona sea menor de edad.*/
		
	}
	// FUNCION ANALIZARSITRABAJA
    public static boolean analizarSiTrabaja (String respuesta) {
       
        if (respuesta.equalsIgnoreCase("si")) {
            return true;
        } else {
            return false;
        }
      
    }
   
    // FUNCION CANTIDADANIMALES
    public static void cantidadAnimales(int gatos, int perros) {
        System.out.println("La cantidad de perros es: "+ perros);
        System.out.println("La cantidad de gatos es: "+ gatos);
    }
	
	public static void main(String[] args) {
		
		
		ingresarNombre();
		
		System.out.println("Ingrese un nombre: ");
		nombre = entrada.next();
		
		almacenarAltura(altura);
		System.err.println(almacenarAltura(altura));
		
		System.out.println("Ingrese una edad: ");
		edad = entrada.nextInt();
		filtrarEdad(25);
		
		
		System.out.println("Usted esta trabajando (SI/NO):");
		
	}
}
