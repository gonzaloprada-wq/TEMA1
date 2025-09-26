package Tema1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		// Constante para almecenar el valor del IVA
		final int IVA = 21;
		// Precio a leer de consola
		double precio;
		// Variable donde almacenar el precio total con el IVA incluido
		double precioConIVA;

		// Pedimos el precio
		System.out.println("Introduzca el precio: ");
		precio = reader.nextDouble();

		//Asi funciona el precio del IVA
		precioConIVA = precio + precio * IVA / 100;
		
		//Resultado del IVA
		System.out.println("Tu precion con IVA es: " + precioConIVA);
		
		//Cerramos el reader.
		reader.close();
	}

}
