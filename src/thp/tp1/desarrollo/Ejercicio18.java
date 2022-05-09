package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio18 {
	
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 0;
		int numMayor, numMenor;
		boolean esDivisible;
		
		System.out.println("Ingresa el primer numero:");
		numero1 = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingresa el segundo numero:");
		numero2 = Integer.parseInt(inputScanner.nextLine());
		
		if (numero1 > numero2) {
			numMayor = numero1;
			numMenor = numero2;
		} else {
			numMenor = numero1;
			numMayor = numero2;
		}
		
		esDivisible = numMayor % numMenor == 0 ;
		
		if (esDivisible) {
			System.out.println("El  numero " + numMayor + " si es divisible " + numMenor);
		}
		else {
			System.out.println("El numero " + numMayor + " no es divisible por " + numMenor);
		}
	}

}
