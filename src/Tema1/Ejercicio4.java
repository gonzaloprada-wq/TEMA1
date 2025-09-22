package Tema1;

import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {

	public static void main(String[] args) {
		//make a scanner
		Scanner reader = new Scanner(System.in);
		reader.useLocale(Locale.US);
		//We create a number variable called "notaPrimerCurso"
		double notaPrimerCurso;
		double notaSegundoCurso;
		
		System.out.print("Cual es la nota del primer curso:");
		notaPrimerCurso = reader.nextDouble();
		
		System.out.print("Cual es la nota del primer curso:");
		notaSegundoCurso = reader.nextDouble();
		
		System.out.print("Tu nota media es "+ ((notaPrimerCurso + notaSegundoCurso)/2 ));
		
		
		
		
	}

}
