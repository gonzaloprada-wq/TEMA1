	package parte2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
	
	Scanner reader = new Scanner(System.in);
	
	double a;
	
	double b;
	
	double x;
	
	double c;
	
	
		System.out.print("Ingrese A: ");
		a = reader.nextDouble();
		
		System.out.print("Ingrese B: ");
		b = reader.nextDouble();
		
		System.out.print("Ingrese X: ");
		x = reader.nextDouble();
		
		System.out.print("Ingrese C: ");
		c = reader.nextDouble();
	
		System.out.print("Resultado: y="+a+"*"+x+"²"+"+"+b+"*"+x+"+"+c);
	
	
}
}
