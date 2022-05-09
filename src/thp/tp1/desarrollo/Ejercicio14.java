package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio14 {
	
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
		final int EDAD_MIN = 7;
		final double ALTURA_MIN = 1.50;
		String nombre;
		int edad = 0;
		double altura = 0;
		
		
		System.out.println("Ingresa tu nombre:");
		nombre = inputScanner.nextLine();
		
		System.out.println("Ingresa tu edad:");
		edad = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingresa tu altura:");
		altura = Double.parseDouble(inputScanner.nextLine());
		
		if (edad >= EDAD_MIN && altura > ALTURA_MIN) {
			System.out.println(nombre + " si puede ingresar a la montaña rusa");
		} else {
			System.out.println(nombre + " no puede ingresar a la montaña rusa");
		}
		
	}

}
