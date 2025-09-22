package Tema1;

import java.util.Scanner; 

public class Ejercicio2 {
	public static void main(String[] args) {
		//We create a new scanner.
		Scanner reader = new Scanner(System.in);
		
		//We create a number variable called "edad"
		int edad;
		
		//Te console es waiting for a number
		System.out.print("Introduce la edad que tendras o tienes este año:");
		edad = reader.nextInt();
		
		//We calculate for the age.
		System.out.print("El año que viene tendras " + (edad+1) + " años");
		
		//Closing scanner
		reader.close();
	}
}
