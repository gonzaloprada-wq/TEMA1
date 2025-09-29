package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// I create the scanner, is called reader.
		Scanner reader = new Scanner(System.in);
		//then i create a double called segundos
		double segundos;
		
		System.out.print("¿Cuantos segundos son?: ");
		
		segundos = reader.nextDouble();
		
		System.out.println("Segundos: "+segundos);
		
		System.out.println("Horas: "+segundos * 0.00027);
		
		System.out.println("Minutos: "+segundos*0.016);
	
	reader.close();
	
	}

}
