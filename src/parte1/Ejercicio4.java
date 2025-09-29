package parte1;

import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {

	public static void main(String[] args) {
		//make a scanner
		Scanner reader = new Scanner(System.in);
		reader.useLocale(Locale.US);
		
		//We create a number variable called "notaPrimerCurso"
		double notaPrimerCurso;
		
		//We create a number variable called "notaSegundoCurso"
		double notaSegundoCurso;
		
			//we ask the first double
			System.out.print("Cual es la nota del primer curso:");
			notaPrimerCurso = reader.nextDouble();
		
			//we ask the second double
			System.out.print("Cual es la nota del primer curso:");
			notaSegundoCurso = reader.nextDouble();
		
			//we ask the calculate
			System.out.print("Tu nota media es "+ ((notaPrimerCurso + notaSegundoCurso)/2 ));
		
		//Closing scanner
			reader.close();
	}

}
