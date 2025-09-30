package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// I create the scanner, is called reader.
		Scanner reader = new Scanner(System.in);
		//then i create a double called segundos
		double segundos;
		//Here i ask how many seconds are
		System.out.print("¿Cuantos segundos son?: ");
		//Now i read the keyboard for the seconds
		segundos = reader.nextDouble();
		//now i resolved the seconds
		System.out.println("Segundos: "+segundos);
		//now i resolved the hours
		System.out.println("Horas: "+segundos * 0.00027);
		//and the minutes
		System.out.println("Minutos: "+segundos*0.016);
	//i close the scanner
	reader.close();
	
	}

}
