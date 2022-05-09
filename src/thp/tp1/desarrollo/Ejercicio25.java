package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio25 {
	
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
	
		int ancho = 0;
		int alto = 0;
		int i, j;
		
		System.out.println("Ingresa el ancho de la matriz:");
		ancho = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingresa el alto de la matriz:");
		alto = Integer.parseInt(inputScanner.nextLine());
		
//		for (int i = 0; i < ancho; i++) {
//			System.out.println("*");
//			
//		}
		
		for (i = 1; i <= alto; i++) {
			for(j = 1; j <= ancho; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

}
