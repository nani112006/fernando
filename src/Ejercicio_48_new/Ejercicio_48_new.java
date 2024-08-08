package Ejercicio_48_new;

public class Ejercicio_48_new {

	public static void main(String[] args) {
		int[] arreglo = new int{5};
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(num + " ");
			syso
		}
		for (int num : arreglo) {
			System.out.print(num + " ");
		}
		for (int i = 0; i < (arreglo.length - 1); i++) {

			for (int j = 0; j < (arreglo.length - i - 1); j++) {

				if (arreglo[j] > arreglo[j + 1]) {

					int temporal = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = temporal;
				}
			}
		}

		System.out.println("\nArreglo ordenado:");
		for (int num : arreglo) {
			System.out.print(num + " ");

	}
	}
}
