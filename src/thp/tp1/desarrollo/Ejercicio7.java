package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio7 {
	
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
		final int alturaCercaCompletamente = 3;
		double ancho = 0;
		double largo = 0;
		double valorMetroCuadrado = 0;
		double metroCuadrado = 0;
		double valorDelTerreno = 0;
		double cantMetrosAlambreParaCercarlo = 0;
		
		System.out.println("Ingresa el ancho del terreno:");
		ancho = Double.parseDouble(inputScanner.nextLine());
		System.out.println("Ingresa lo longitud del terreno:");
		largo = Double.parseDouble(inputScanner.nextLine());
		System.out.println("Ingresa el valor del metro cuadrado:");
		valorMetroCuadrado = Double.parseDouble(inputScanner.nextLine());
		
		metroCuadrado = ancho * largo;
		valorDelTerreno = valorMetroCuadrado * metroCuadrado;
		cantMetrosAlambreParaCercarlo = metroCuadrado * alturaCercaCompletamente;
		
		System.out.println("El valor del terreno es: " + valorDelTerreno + ".");
		System.out.println("Para cercarlo completamente a tres alturas distintas se necesita: " + cantMetrosAlambreParaCercarlo + " metros.");
		inputScanner.close();
	}

}
