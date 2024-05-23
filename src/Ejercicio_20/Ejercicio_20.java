package Ejercicio_20;

public class Ejercicio_20 {

	public static void main(String[] args) throws InterruptedException {
		
		int alerta = 0;
		
		while ( alerta < 100 ) {
			
			alerta++;
			System.out.println("cantidad de seguidores: " + alerta ); 
			Thread.sleep(200);
		}
		
		if ( alerta == 100 ) {
			System.out.println("Hemos llegado a los 100 viwers." );
		}
		
	}

}
