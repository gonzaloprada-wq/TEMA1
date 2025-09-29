package parte1;

import java.util.Locale;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//We create a scanner
		Scanner reader = new Scanner(System.in);
		
		//Now I create the variables
		//The first number
		double primerNumero;
		//The second number
		double segundoNumero;
		
		reader.useLocale(Locale.US);
		
		//Here Im asking for the first number
		System.out.print("Introduce un numero: ");
		primerNumero = reader.nextDouble();

		//Here Im asking for the second number
		System.out.print("Introduce otro numero: ");
		segundoNumero = reader.nextDouble();
		
		//Here Im resolving the math problem "RESTA"
		System.out.println( "SUMA = " + primerNumero + "+" + segundoNumero + "=" + (primerNumero+segundoNumero));
		
		//Here Im resolving the math problem "SUMA"
		System.out.println("RESTA = " + primerNumero + "-" + segundoNumero + "=" + (primerNumero-segundoNumero));
		
		//Here Im resolving the math problem "MULTIPLICACIÓN"
		System.out.println("MULTIPLICACIÓN = " + primerNumero + "X" + segundoNumero + "=" + (primerNumero*segundoNumero));
		
		//Here Im resolving the math problem "DIVISION"
		System.out.println("DIVISIÓN = " + primerNumero + "/" + segundoNumero + "=" + (primerNumero/segundoNumero));
		
		reader.close();
		
		
		
	}
}
