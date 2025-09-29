package parte1;

import java.util.Locale;

import java.util.Scanner;

public class Ejercicio8 {

		public static void main(String[] args) {
		//I make the scanner	
		Scanner reader = new Scanner(System.in);
		//I make a string for the name
		String nombre;
		//I make an int for the age
		int edad;
		
		//I ask for the name
		System.out.print("A continuación por tu nombre: ");
	
		//Now the reader is waiting for the name
		nombre = reader.nextLine();
	
		//I ask for the age
		System.out.print("A continuación por tu edad: ");
		//Now the reader is waiting for the age
		edad = reader.nextInt();
	
		//Now we give the result.
		System.out.print("Hola "+ nombre + ", tienes "+ edad+ " años, ¡que mayor eres!");
	
	reader.close();
	
	}

}
