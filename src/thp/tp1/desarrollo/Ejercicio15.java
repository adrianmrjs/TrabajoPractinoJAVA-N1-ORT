package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio15 {
	
	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		final int EDAD_MAX = 6;
		final double ALTURA_MAX = 1.50;
		String nombre;
		int edad = 0;
		double altura = 0;
			
		System.out.println("Ingresa tu nombre:");
		nombre = inputScanner.nextLine();
		
		System.out.println("Ingresa tu edad:");
		edad = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingresa tu altura");
		altura = Double.parseDouble(inputScanner.nextLine());
		
		if (edad > EDAD_MAX || altura > ALTURA_MAX) {
			System.out.println(nombre + " si puede ingresar a la montaña rusa");
		} else {
			System.out.println(nombre + " no puede ingresar a la montaña rusa");
		}
	}

}
