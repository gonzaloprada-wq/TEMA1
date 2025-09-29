		package parte1;

		import java.util.Locale;

import java.util.Scanner;

		public class Ejercicio7 {
				public static void main(String[] args) {
		
						Scanner reader = new Scanner(System.in);
		//String name
		String nombre;
		//String street
		String calle;
		//String telephone
		String telefono;
		
			//Waiting for the name
			System.out.println("Introduce un nombre:");
		
			nombre = reader.nextLine();
			//Waiting for the address
			System.out.println("Introduce tu dirección:");
		
			calle = reader.nextLine();
			//Waiting for the phone
			System.out.println("Introduce tu Telefono:");
		
			telefono = reader.nextLine();
			//Giving the name
			System.out.println("Nombre: "+ nombre);
			//Giving the street
			System.out.println("Dirección: "+ calle);
			//Giving the phone
			System.out.println("Teléfono: "+ telefono);
			
			//Closing the reader
			reader.close();

	}

}
