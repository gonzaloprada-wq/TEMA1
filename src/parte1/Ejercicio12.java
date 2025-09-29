package parte1;

import java.util.Scanner;

import java.util.Locale;

public class Ejercicio12 {

	public static void main(String[] args) {
		//We create a scanner reader for "peras"
		Scanner readerPeras = new Scanner(System.in);
		
		//We create a scanner reader for "manzanas"
		Scanner readerManzanas = new Scanner(System.in);
		
		//We put the scanner into locale lenguage
		readerManzanas.useLocale(Locale.US);
		
		//Again We put the scanner into locale lenguage
		readerPeras.useLocale(Locale.US);
		
		//We made a variable for "peras"
		Double peras;
			
		//We made a variable for "manzanas"
		Double manzanas;
		
		//We made a constant for "peras"
		
		final Double PRECIO_PERAS;
		PRECIO_PERAS = 1.95;
		
		//We made a constant for "manzanas"
		final Double PRECIO_MANZANAS;
		PRECIO_MANZANAS = 2.35;

		
		
			//We ask for a number for calculate "peras"
			System.out.print("¿Cuantos kilos de peras has vendido?: "); 
			//We wait for a number for calculate "peras"
			peras = readerPeras.nextDouble();
			
			//We ask for a number for calculate "peras"
			System.out.print("\n ¿Cuantos kilos de manzanas has vendido?: ");
			//We wait for a number for calculate "manzanas"
			manzanas = readerManzanas.nextDouble();
			
			//We print the results for "peras" and "manzanas"
			System.out.println("Peras = " + (peras * PRECIO_PERAS)+ "e" );
			System.out.println("Manzanas = " + (manzanas * PRECIO_MANZANAS)+ "e" );
			
		//We close the scanner.
		readerPeras.close();
					}
					
					}
