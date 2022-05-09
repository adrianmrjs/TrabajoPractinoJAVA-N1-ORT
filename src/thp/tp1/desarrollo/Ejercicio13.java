
//13.Realizá un programa para ingresar tres números enteros e indique cuál de ellos es el mayor y
//su valor

package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio13 {
	
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		
		System.out.println("Ingresa el primer numero:");
		num1 = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingrese el segundo numero:");
		num2 = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingresa el tercer numero:");
		num3 = Integer.parseInt(inputScanner.nextLine());
		
		if (num1>num3) {
			if (num1>num3) {
				System.out.println("El numero mayor es el " + num1);
			} else {
				System.out.println("El numero mayor es el " + num3);
			}
		} else {
			if (num2>num3) {
				System.out.println("El numero mayor es el " + num2 );
			} else {
				System.out.println("El numero mayor es el " + num3);
			}
		}
		
		
	}

}
