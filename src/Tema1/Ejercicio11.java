package Tema1;
//I put a scanner
import java.util.Scanner;
//I put a locale option
import java.util.Locale;

public class Ejercicio11 {

	public static void main(String[] args) {

		//I put a scanner called reader.
		Scanner reader = new Scanner(System.in);
		//I put a scanner to the locale.US
		reader.useLocale(Locale.US);
		//I made a double called "pesetas"
		double pesetas;
		
		//I m asking for a number
		System.out.print("Ingrese el numero de pesetas que quieres transformar: ");
		
		//Now Im waiting for it
		pesetas = reader.nextDouble();
		
		//I calculated the euros form
		System.out.println("Euros: "+ (pesetas*0.006)+" e");
		
		//I made a message with the form
		System.out.println(pesetas + " x 0.006 = " + (pesetas*0.006));
		
		//I close the scanner
		reader.close();		
	}

}
















