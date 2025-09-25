package Tema1;

import java.util.Scanner;

import java.util.Locale;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner readerPeras = new Scanner(System.in);
		
		Scanner readerManzanas = new Scanner(System.in);
		
		readerManzanas.useLocale(Locale.US);
		
		readerPeras.useLocale(Locale.US);
		
		Double peras;
			
		Double manzanas;
		
		final Double PRECIO_PERAS;
		
		final Double PRECIO_MANZANAS;
		
		PRECIO_PERAS = 1.95;
		
		PRECIO_MANZANAS = 2.35;
		
		
		
		
		
		
		
			System.out.print("¿Cuantos kilos de peras has vendido?: "); 
			
			peras = readerPeras.nextDouble();
			
			System.out.print("\n ¿Cuantos kilos de manzanas has vendido?: ");
			
			manzanas = readerManzanas.nextDouble();
			
			System.out.println("Peras = " + (peras * PRECIO_PERAS)+ " e" );
			
			System.out.println("Manzanas = " + (manzanas * PRECIO_MANZANAS)+ " e" );
			
		
		readerPeras.close();
		
		
	

	}

}
