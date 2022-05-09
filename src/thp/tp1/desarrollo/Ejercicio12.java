package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio12 {
	
	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Ingresa el primer numero:");
		num1 = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingresa el segundo numero:");
		num2 = Integer.parseInt(inputScanner.nextLine());
		
		if (num1 > num2) {
			System.out.println("El primer numero ingresado es el mayor. El numero " + num1);
		} else {
			System.out.println("El segundo numero ingresado es el mayor. El numero " + num2);
		}		
		inputScanner.close();
	}

}
