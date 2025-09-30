package parte2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//I created a scanner called reader for read the keyboard later
		Scanner reader = new Scanner(System.in);
		//I created an Int for calculate the year
		int añoASiglo;
		//I create double called calculo
		double calculo;
		
		//I print a message for calculate
		System.out.print("Año a calcular: ");
		// I read the keybaord for the number 
		añoASiglo = reader.nextInt();
		// I calculate the centurie with the calculate
		calculo = añoASiglo/100+1;
		//I print a message for the answer
		System.out.print("Siglo actual "+ (int)calculo);
		
	// I close the scanner
	reader.close();
						
}
}
