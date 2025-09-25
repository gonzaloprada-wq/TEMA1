	package Tema1;

	import java.util.Scanner;

	import java.util.Locale;

	public class Ejercicio10 {
		public static void main(String[] args) {
		//Here i made the scanner
		Scanner reader = new Scanner(System.in);
		//Here i made the variable number
		int numero;
		//Here i made the boolean
		boolean par;
			
			
				//Now Im waiting for the number
				System.out.print("Porfavor, agrege su numero: ");
				//Now asking for the number
				numero = reader.nextInt();
				//Here i made If and else
				par = (numero%2 == 0);
				//Here i say if is true or not.
				System.out.println("¿Es par?: "+ par);
				
			//Here i close the scanner
			reader.close();
	}

}
