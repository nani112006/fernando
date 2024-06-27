package repaso_2;

import java.util.Scanner;

public class repaso_2 {
	public static void main(String[] args) {
		String[] apellidos = {"Rodriguez", "Zamora", "Moreno"};
        int[] edades = {25, 32, 40};
        int[] dni = {47171527, 49246612, 41332945};
        String[] marcas = {"BMW", "Peugeot", "Renault"};
        String[] modelos = {"Z3", "208", "Sandero"};
        int[] a�os = {2021, 2018, 2022};
        String[] patentes = {"AD178JK", "AD200RS", "AD202VW"};
		
		System.out.println("Autos con a�o superior a 2020 y conductor mayor de 25 a�os:");
        for (int i = 0; i < apellidos.length; i++) {
            if (a�os[i] > 2020 && edades[i] > 25) {
                System.out.println("El auto " + marcas[i] + " " + modelos[i] + " del a�o " + a�os[i] + ", patente " + patentes[i] + ", pertenece a " + apellidos[i] + ", que tiene " + edades[i] + " a�os, y su DNI es " + dni[i]);
            }
        }
        
        Scanner scanner = new Scanner(System.in);//3590614186
        
        System.out.println("�Desea modificar alg�n elemento? (si/no)");
        String respuesta = scanner.nextLine();
        
        if (respuesta.equalsIgnoreCase("si")) {
           
            System.out.println("Seleccione el n�mero de patente del auto a modificar:");
            for (int i = 0; i < patentes.length; i++) {
                System.out.println((i + 1) + ". " + patentes[i]);
            }
            
            int patenteSeleccionada = scanner.nextInt() - 1;
            scanner.nextLine();
    
            System.out.println("�Qu� desea cambiar?");
            System.out.println("1. Apellido");
            System.out.println("2. Edad");
            System.out.println("3. DNI");
            System.out.println("4. Marca");
            System.out.println("5. Modelo");
            System.out.println("6. A�o");
            System.out.println("7. Patente");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
           
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nuevo apellido:");
                    apellidos[patenteSeleccionada] = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Ingrese la nueva edad:");
                    edades[patenteSeleccionada] = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo DNI:");
                    dni[patenteSeleccionada] = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Ingrese la nueva marca:");
                    marcas[patenteSeleccionada] = scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Ingrese el nuevo modelo:");
                    modelos[patenteSeleccionada] = scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Ingrese el nuevo a�o:");
                    a�os[patenteSeleccionada] = scanner.nextInt();
                    break;
                case 7:
                    System.out.println("Ingrese la nueva patente:");
                    patentes[patenteSeleccionada] = scanner.nextLine();
                    break;
                default:
                    System.out.println("Opci�n no v�lida.");
                    break;
            }
        }
        System.out.println("Datos actualizados:");
        for (int i = 0; i < apellidos.length; i++) {
            System.out.println("El auto " + marcas[i] + " " + modelos[i] + " del a�o " + a�os[i] + ", patente " + patentes[i] + ", pertenece a " + apellidos[i] + ", que tiene " + edades[i] + " a�os, y su DNI es " + dni[i]);
        }
        scanner.close();
	}
}
