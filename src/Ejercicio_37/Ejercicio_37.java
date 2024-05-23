package Ejercicio_37;

public class Ejercicio_37 {

	public static void main(String[] args)throws InterruptedException {
		
		char letra;
		
		for ( letra = 1; letra <= 25; letra++ ) {
			
			
		if (letra == 1) {
			System.out.println("A");
		}
		if (letra == 5) {
			System.out.println("E");
		}
		if (letra == 9) {
			System.out.println("I");
		}
		if (letra == 16) {
			System.out.println("O");
		}
		if (letra == 22) {
			System.out.println("U");
		}
		Thread.sleep(2000);
		}
	}

}
