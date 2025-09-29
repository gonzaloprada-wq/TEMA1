package parte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		double numero;
		
		int redondeo;
		
		System.out.print("Ingrese numero con decimales: ");
		
		numero = reader.nextDouble();
		
		redondeo = (int) (numero+0.5);

		System.out.print("Numero redondeado " + redondeo);
		

	}

}
