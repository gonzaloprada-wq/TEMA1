	package parte2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
	//We create reader scanner no read the keyboad
	Scanner reader = new Scanner(System.in);
	//I create a double for "a"
	double a;
	//Now i created for b
	double b;
	//then for X
	double x;
	//and finally c
	double c;
	
		//y create a print to read a
		System.out.print("Ingrese A: ");
		//Now i am reading the keyboard for a
		a = reader.nextDouble();
		//I create a print for b
		System.out.print("Ingrese B: ");
		//Now Im reading
		b = reader.nextDouble();
		//Print for x
		System.out.print("Ingrese X: ");
		//reading the keayboard
		x = reader.nextDouble();
		//print for c
		System.out.print("Ingrese C: ");
		//reading the keyboard
		c = reader.nextDouble();
		// Now finallly I print the answer
		System.out.print("Resultado: y="+a+"*"+x+"²"+"+"+b+"*"+x+"+"+c);
		
}
}
