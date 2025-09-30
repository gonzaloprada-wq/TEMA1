package parte2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//I create the scanners for read the keyboard
		Scanner reader = new Scanner(System.in);
		//I double for the m
		Double metros;
		//An other for mm
		Double milimetros;
		//Finally cm
		Double centimetros;
		//A double to calculate "metros" to "centimeters"
		final double CALCULO_METROS;
		//Anothe one for the milimeters
		final double CALCULO_MILIME;
		
			//Now i print a message for the meters
			System.out.println("Ingrese sus metros: ");
			//Now the keyaboard is reading the meters
			metros = reader.nextDouble();
			//Another print for CM
			System.out.println("Ingrese sus centimetros: ");
			//reading the CM
			centimetros = reader.nextDouble();
			//finally the mm
			System.out.println("Ingrese sus milimetros: ");
			// Another scanner for mm
			milimetros = reader.nextDouble();
			
			//I calculate the meters
			CALCULO_METROS = metros * 100;
			// And the milimeters
			CALCULO_MILIME = milimetros * 0.1;
			//the final print calculating all
			System.out.println("Distancias: "+ (CALCULO_METROS + CALCULO_MILIME+ centimetros));
		//scanner closed
		reader.close();			

	}

}
