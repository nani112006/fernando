package Ejercicio_21;

public class Ejercicio_21 {

public static void main(String[] args) throws InterruptedException {
		
		int temp = 35;
		
		System.out.println("La temprratura inicial es de: "+ temp);
		temp++;
		
		while ( temp < 100 ) {
			
			temp = temp +2;
			System.out.println("La temperatura es de: " + temp ); 
			Thread.sleep(20);
			
			if ( temp == 85 ) {
			System.out.println("CUIDADO!, TEMPERATURA PELIGROSA." );
			Thread.sleep(1000);
			
		}
		
		
		if (temp == 100) {
			System.out.println("VALOR EXTREMO. APAGANDO PC.");
			
		}
		}
	}
}