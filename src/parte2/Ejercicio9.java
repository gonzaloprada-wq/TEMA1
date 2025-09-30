package parte2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//I created a scanner for read the numbers, I called him reader
		Scanner reader = new Scanner(System.in);
		//I create a double for the numbers biggers than 100
		double numeroMasDe100;
		//I created a int for "resultado final", I will give a value soon.
		int resultadoFinal;
		
				//I print a message that ask for a number
				System.out.print("Ingresa su numero (mayor de 100): ");
				//Now I reading the keyboard waiting for the asked number
				numeroMasDe100 = reader.nextDouble();
				//I calculated the result in meters withouth decimals numbers
				resultadoFinal = (int) numeroMasDe100/100;
				//Now I print the result
				System.out.print("Pertenece al grupo: " + resultadoFinal);
								
			//I close the scanner
			reader.close();
						
}
}
