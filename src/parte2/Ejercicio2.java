package parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//I create a scanner to read the number to insert
		Scanner reader = new Scanner(System.in);
		//I create an Int to read the next number
		int numero1;
		//The next int is creater for calculate the rest
		int aSumar;
		//I created a constant for change the number easly
		final int multiplo = 7;
		
			//I create a print the read the number
			System.out.print("Ingrese su numero: ");
			//Now, the scanner is reading the keyboard
			numero1 = reader.nextInt();
			//Now i calculate the rest 
			aSumar = numero1%multiplo;
			//Now I calculate, If is correct (0) nothing happend, but if is isn´t correct.
			System.out.print("RESULTADO "+ (aSumar == 0 ? numero1 + " ya es multiplo " + multiplo : multiplo-aSumar));
		//Scanner closed
		reader.close();
}
}
