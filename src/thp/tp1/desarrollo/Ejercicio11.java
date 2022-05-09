package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio11 {

	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		int num = 0;
		
		System.out.println("Ingresa un numero:");
		num = Integer.parseInt(inputScanner.nextLine());
		
		if (num % 2 == 0 ) {
			System.out.println( num + " es un numero par");
		} else {
			System.out.println( num + " es un numero impar");
		}
		
		inputScanner.close();
		
	}

}
