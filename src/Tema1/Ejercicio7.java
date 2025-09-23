package Tema1;

import java.util.Locale;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		String nombre;
		
		String calle;
	
		String telefono;
		
		
		System.out.print("Introduce un nombre:");
		
		nombre = reader.nextLine();
		
		System.out.print("Introduce tu dirección:");
		
		calle = reader.nextLine();
		
		System.out.print("Introduce tu Telefono:");
		
		telefono = reader.nextLine();
		
		System.out.println("Nombre: "+ nombre);
		System.out.println("Dirección: "+ calle);
		System.out.println("Teléfono: "+ telefono);
		
	
		reader.close();

	}

}
