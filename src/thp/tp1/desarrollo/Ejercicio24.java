package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio24 {
	
	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int num1 = 0;
		int num2 = 0;
		int auxiliar = 0;
		
		System.out.println("Inresa el primer numero:");
		num1 = Integer.parseInt(inputScanner.nextLine());
	
		System.out.println("Ingrese el segundo valor (este de bese ser mayor o igual) a " + num1);
		num2 = Integer.parseInt(inputScanner.nextLine());
		
		while (num1 > num2) {
			System.out.println("Ah ingresado un numero no valido intente de nuevo");
			System.out.println("Ingrese un numero mayor o igual a " + num1);
			num2 = Integer.parseInt(inputScanner.nextLine());
		}
		
		System.out.println("Rango numero de " + num1 + " a " + num2);
		for (auxiliar = num1; auxiliar <= num2; auxiliar++) {
			System.out.println(auxiliar);
		}
		
		System.out.println("Rango numero entre " + num1 + " a " + num2);
		for (auxiliar = num1 + 1; auxiliar < num2; auxiliar++) {
			System.out.println(auxiliar);
		}
		
		inputScanner.close();
	}

}
