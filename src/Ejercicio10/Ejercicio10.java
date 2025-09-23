	package Ejercicio10;

	import java.util.Scanner;

	import java.util.Locale;

	public class Ejercicio10 {
		public static void main(String[] args) {
		
			Scanner reader = new Scanner(System.in);
			
			int numero;
			
			System.out.println("Porfavor, agrege su numero: ");
			
			numero = reader.nextInt();
			
			if(numero % 2 == 0) {System.out.println("El número " + numero + " es PAR");
			
			} else {System.out.println("El número " + numero + " es IMPAR");}
			
		reader.close();
	}

}
