	package Tema1;

	import java.util.Scanner;

	import java.util.Locale;

	public class Ejercicio10 {
		public static void main(String[] args) {
		//Here i made the scanner
			Scanner reader = new Scanner(System.in);
		//Here i made the variable number
			int numero;
			
			
			
		//Now Im waiting for the number
			System.out.println("Porfavor, agrege su numero: ");
		//Now asking for the number
			numero = reader.nextInt();
		//Here i made If and else
			if(numero % 2 == 0) {System.out.println("El número " + numero + " es PAR");
			} else {System.out.println("El número " + numero + " es IMPAR");}
			//Here I close the Scanner
		reader.close();
	}

}
