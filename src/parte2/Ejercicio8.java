package parte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		
			Scanner reader = new Scanner(System.in);
			
			double distanciaMetros;
			
			double distanciaCentimetros;
			
					
					System.out.print("Cuantos metros");
					
					distanciaMetros = reader.nextDouble();
				
					distanciaCentimetros = (int) distanciaMetros *100;
					
					System.out.print("La distancia seria: " + (int) distanciaCentimetros + "cm");
				
					
			reader.close();		
				
				
			
			
}
}
