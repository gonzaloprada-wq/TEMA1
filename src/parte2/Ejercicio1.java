package parte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//I create the Scanner for th
		Scanner reader = new Scanner(System.in);
		
		//I create a double called number
		double numero;
		
		//I create an int called redondeo for the counts
		int redondeo;
		
		//I print a message for insert a number
		System.out.print("Ingrese numero con decimales: ");
		
		//I read the number in the keyboard
		numero = reader.nextDouble();
		
		//I did the count
		redondeo = (int) (numero+0.5);
		
		//I print the final message
		System.out.print("Numero redondeado " + redondeo);
		
	//I close the scanner	
	reader.close();
	}

}
