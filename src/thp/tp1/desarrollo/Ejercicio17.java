package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio17 {
	
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
		final int EDAD_MIN = 1;
		final int EDAD_MAX = 120;
		final int EDAD_MAX_JUB_M = 60 ;
		final int EDAD_MAX_JUB_H = 65;
		String nombre;
		int edad = 0;
		char genero;
		
		System.out.println("Ingresa tu nombre:");
		nombre = inputScanner.nextLine();	
		
		System.out.println("Ingresa la edad:");
		edad = Integer.parseInt(inputScanner.nextLine());
		
		
		if (edad > EDAD_MIN && edad < EDAD_MAX) {
			System.out.println("Ingrese su genero (H/M):");
			genero = inputScanner.next().charAt(0);
			genero = Character.toUpperCase(genero);
			switch (genero) {
			case 'H':
				if (edad > EDAD_MAX_JUB_H ) {
					System.out.println(nombre + " esta en la edad de jubilarse" );
				} else {
					System.out.println(nombre + " no esta en edad de jubilarse");
				}
				break;
				
			case 'M':
				if (edad > EDAD_MAX_JUB_M) {
					System.out.println(nombre + " esta en edad de jubilarse");
				} else {
					System.out.println(nombre + " no esta en edad de jubilarse");
				}
				
				break;
			default:
				System.out.println(genero + " no es un genero valido.");
				break;
			}
		} else {
			System.out.println("Su edad no es valida");
		}
		inputScanner.close();
	}

}
