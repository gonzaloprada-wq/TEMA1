package parte1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//We create a new scanner.
		Scanner reader = new Scanner(System.in);
		
		//We make a number variable with the name "numero"
		double numero;
		
		//We print the message
		System.out.print("Introduce numero:"); 
		
		//Here the console is waiting for a number
		numero = reader.nextDouble();
		
		//Closing scanner
		reader.close();
		
	}	
}
