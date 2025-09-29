package parte1;

import java.util.Scanner;

import java.util.Locale; 

public class Ejercicio13 {

	public static void main(String[] args) {
		
		
		//I create the boolean "lluvia"
		boolean lluvia;
		
		// I create the boolean "tareas"
		boolean tareas;
		
		// I create the boolean "biblioteca"
		boolean biblioteca;
		
		boolean salir;
		// I create the scanner "reader"
		Scanner reader = new Scanner(System.in);
		
		
		
		
		
			// Im asking for a "true" or "false"
			System.out.print("¿Esta lloviendo?: (true/false) ");
			
			//Now Im waiting for the answer
			lluvia = reader.nextBoolean();
			
			// Im asking for a "true" or "false"
			System.out.print("\n¿Has hecho la tarea?: (true/false) ");
			
			//Now Im waiting for the answer
			tareas = reader.nextBoolean();
			
			// Im asking for a "true" or "false"
			System.out.print("\n¿Vas a la biblioteca?: (true/false) ");
			
			//Now Im waiting for the answer
			biblioteca = reader.nextBoolean();
			
			salir = ((!lluvia && tareas) && biblioteca);
			// Now i calculate the result
			System.out.print("\n¿Puede salir a la calle?: " + salir);		
		
		//I close the scanner
		reader.close();		
}
}
