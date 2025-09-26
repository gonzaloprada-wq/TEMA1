package Tema1;

import java.util.Scanner;

import java.util.Locale;

public class Ejercicio14 {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		double notasPrimeras ;
		
		double notasSegundas ;
		
		double notasTerceras;
		
		
			System.out.print("Notas primer trimestre: ");
			
			notasPrimeras = reader.nextDouble();						
	
			
			notasPrimeras = (int) notasPrimeras;
			
			
			System.out.print("Notas segundo trimestre: ");
			
			notasSegundas = reader.nextDouble();	
			
			notasSegundas = (int) notasSegundas;
			
			
			System.out.print("Notas tercer trimestre: ");
			
			notasTerceras = reader.nextDouble();		
			
			notasTerceras = (int) notasPrimeras;
			
			
			
			notasPrimeras = (double) notasPrimeras;
			
			notasSegundas = (double) notasSegundas;
			
			notasTerceras = (double) notasPrimeras;
			
			
			
			final double notasFinales = (notasPrimeras + notasSegundas + notasTerceras);
			
			System.out.println("La media final es: " + notasFinales);
			
			reader.close();
																
}
}
