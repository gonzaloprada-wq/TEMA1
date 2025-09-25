		package Tema1;

		import java.util.Scanner;
		import java.util.Locale;
				
				public class Ejercicio9 {
				public static void main(String[] args) {
				//Here i made the scanner	
				Scanner reader = new Scanner(System.in);
				//Here i made the variable "edad"
				int edad;
				
				
				//Here I am asking for the age
				System.out.println("Que edad tiene?");
				//Now I am waiting for an answer
				edad= reader.nextInt();
				//I made a boolean to detect the age
				 boolean esMayor = (18 <= edad);
				//Now I made the answer
				 System.out.println("¿Es mayor de edad?:" + esMayor);
				
				//I close the reader					
				reader.close();	
	}
}
