package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio20 {
	
	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		String operacion = "";
		final String SUMA = "+";
		final String RESTA = "-";
		final String MULTIPLICACION = "*";
		final String DIVISION = "/";
		
		System.out.println("Ingresa el primer numero:");
		numero1 = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingresa el segundo numero:");
		numero2 = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingresa la operacion a realizar (+,-,*,/)");
		operacion =inputScanner.nextLine();
		
		switch (operacion) {
		case SUMA:
			resultado = numero1 + numero2;
			System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado );
			break;
			
		case RESTA:
			resultado = numero1 - numero2;
			System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resultado );
			break;
			
		case MULTIPLICACION:
			resultado = numero1 * numero2;
			System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es: " + resultado );
			break;
			
		case DIVISION:
			resultado = numero1 / numero2;
			System.out.println("La division de " + numero1 + " y " + numero2 + " es: " + resultado );
			break;

		default:
			System.out.println("No es valida la operacion");
			break;
		}
		
		inputScanner.close();
		
	}

}
