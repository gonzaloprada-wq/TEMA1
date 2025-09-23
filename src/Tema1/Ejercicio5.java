	package Tema1;

	import java.util.Scanner;
	
	import java.util.Locale;

	public class Ejercicio5 {

		public static void main(String[] args) {
			//We create a new Scanner called "reader"
			Scanner reader = new Scanner(System.in);
			
			//We turn "reader" to a Local lenguage
			reader.useLocale(Locale.US);
			
			//We create a new variable called "radio"
			double radio;
						
				//We create a line asking for a number
				System.out.print("Longitud del radio de la circunferencia en cm: ");
				
				//Now we waith for the answer
				radio = reader.nextDouble();
				
				//Now we calculate with Math.PI
				System.out.println("La longitud es de "+(2*Math.PI*radio)+" cm.");
				System.out.print("El area mide "+(Math.PI*(radio*radio))+" cm2");
		
			reader.close();
	}
		

}
