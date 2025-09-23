		package Tema1;

		import java.util.Scanner;
		import java.util.Locale;

				public class Ejercicio9 {
				public static void main(String[] args) {
					
				Scanner reader = new Scanner(System.in);
				
				
				int edad;
				
				System.out.println("Que edad tiene?");
				edad= reader.nextInt();
				
				 boolean esMayor = (18 <= edad);
				 
				 System.out.println("¿Es mayor de edad?:" + esMayor);
				
				
													
				reader.close();	
	
					}

					}
