package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio5 {

	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero1, numero2, numeroAux;
		
		System.out.println("Ingrese el primer numero:");
		numero1 = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingrese el segundo numero:");
		numero2 = Integer.parseInt(inputScanner.nextLine());
		
		numeroAux = numero1;
		numero1 = numero2;
		numero2 = numeroAux;
		
		System.out.println("El numero1: " + numero1);
		System.out.println("El numero2: " + numero2);
		
		inputScanner.close();
	}

}
