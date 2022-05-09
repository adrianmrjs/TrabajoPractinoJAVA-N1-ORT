package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio23 {
	
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
		int numero = 0;
		final int CANTIDAD_MULTIPLOS = 10;
		
		System.out.println("Ingresa un numero");
		numero = Integer.parseInt(inputScanner.nextLine());
		
		for (int i = 1; i <= CANTIDAD_MULTIPLOS; i++) {
			System.out.println(i * numero);
		}
		
		inputScanner.close();

	}

}
