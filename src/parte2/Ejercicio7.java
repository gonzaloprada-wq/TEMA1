package parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//I create a constant for the junior tickets
		final double ENTRADA_INF = 15.50;
		//I create a constant for the adults ticket
		final double ENTRADA_ADUL = 20;
		//I create a constant for the discount
		final double DESCUENTO = 0.5;
		//Another for the total without discount
		double total;
		//I create a variable for amount of junior tickets
		int cantidadInf;
		//I create a variable for amount of adults tickets
		int cantidadAdu;
				
		//The a scanner to read the next keyboard commands
		Scanner reader = new Scanner(System.in);
		
				//I ask for the amount of junior tickets 
				System.out.print("Cantidad de entradas infantiles: ");
				//Now im going to read the keyboard
				cantidadInf = reader.nextInt();
				//I ask for the amount of adults tickets 
				System.out.print("Cantidad de entradas adultas: ");
				//Now im going to read the keyboard
				cantidadAdu = reader.nextInt();
				//I calculate the total withouth the discount
				total = (cantidadInf*ENTRADA_INF) + (cantidadAdu*ENTRADA_ADUL);
				// Now i print the result with or withouth the discount
				System.out.print("TOTAL A PAGAR " + (total >= 100 ? total -total*0.05 : total ));
	
				
		//i close the reader
		reader.close();			
}
}
