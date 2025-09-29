package parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//I create a scanner to read the number to insert
				Scanner reader = new Scanner(System.in);
				//I create an Int to read the next number
				int numero1;
				//The next int is creater for calculate the rest
				int aSumar;
				//I created a constant for change the number easly
				int numero2;
				
				
					//I create a print the read the number
					System.out.print("Ingrese su numero que quieres buscarle un multiplo: ");
					
					//Now, the scanner is reading the keyboard
					numero2 = reader.nextInt();
					
					System.out.print("Ingrese su multiplo: ");
					
					//Now, the scanner is reading the keyboard
					numero1 = reader.nextInt();
					
					//Now i calculate the rest 
					aSumar = numero1%numero2;
					
					//Now I calculate, If is correct (0) nothing happend, but if is isn´t correct i print the answer.
					System.out.print("RESULTADO: "+ (aSumar == 0 ? numero1 + " ya es multiplo " + numero2 : 
					"Necesitas sumarle " + (numero2-aSumar) +" a " + numero1 + " 2para que sea multiplo de " + numero2 ));
				
				
				//Scanner closed
				reader.close();
	
		
}
}
