package parte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//We create a new scanner.
		Scanner reader = new Scanner(System.in);
		//We create a number variable called "añoActual"
		int añoActual;
		//We create a number variable called "añoNacimiento"
		int añoNacimiento;
		
		
		//We ask for "añoNacimiento"
				System.out.print("¿En que año naciste?:");
				añoNacimiento = reader.nextInt();
		
		//We ask for "añoActual"
				System.out.print("Año actual:");
				añoActual = reader.nextInt();
		
		//We are going to calculate the age of the reader:
				System.out.print("Tienes " + ( añoActual - añoNacimiento ) + " años.");
		//Closing scanner
			reader.close();
}
}
