package parte1;

import java.util.Scanner;

import java.util.Locale;

public class Ejercicio14 {
	
	public static void main(String[] args) {
		//We create scanner called reader
		Scanner reader = new Scanner(System.in);
		//now i created the variable INT "notasPrimeras"
		int notasPrimeras ;
		//the i created "notasSegundas"
		int notasSegundas ;
		//and finally "notasTerceras"
		int notasTerceras;
		
			//Then I print "notas primer trimestre"
			System.out.print("Notas primer trimestre: ");
			//Then I starting to scan
			notasPrimeras = reader.nextInt();	
			
			//I continue with the second ones
			System.out.print("Notas segundo trimestre: ");
			//Im scanning the second ones
			notasSegundas = reader.nextInt();	
			
			//Now Im print the lasts ones
			System.out.print("Notas tercer trimestre: ");
			//And again, I scanning
			notasTerceras = reader.nextInt();		
					
			//I change "notasFinales"					
			final double notasFinales = (double)((notasPrimeras + notasSegundas + notasTerceras)/3.0);
			//I print the final notes
			System.out.println("La media final es: " + notasFinales);
			//I closed the scanner
			reader.close();
																
}
}
