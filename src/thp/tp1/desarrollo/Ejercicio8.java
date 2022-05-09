package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio8 {
	
	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 0;
		int sumaRealizada = 0;
		int restaRealizada = 0;
		int multiplicacionRealizada = 0;
		double divisionRealizada = 0;

		System.out.println("Ingresa el primer numero:");
		numero1 = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingresa el segundo numero:");
		numero2 = Integer.parseInt(inputScanner.nextLine());
		
		sumaRealizada = numero1 + numero2;
		restaRealizada = numero1 - numero2;
		multiplicacionRealizada = numero1 * numero2;
		divisionRealizada = (double)numero1 / numero2;
		
		System.out.println("La suma es: " + sumaRealizada);
		System.out.println("La resta es: " + restaRealizada);
		System.out.println("La multiplicación es: " + multiplicacionRealizada);
		System.out.println("La división es: " + divisionRealizada);
		inputScanner.close();
		
	}

}
