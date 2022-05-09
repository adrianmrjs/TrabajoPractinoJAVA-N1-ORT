package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio3 {

	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
//		3. Realizá un programa que permita ingresar un número entero. Debe mostrarse el número
//		ingresado:
//		a. Multiplicado por 5.
//		b. Dividido por 2.
		
		int numero1,numeroMultiplicado,numeroDividido;
		
		System.out.println("Ingresa el numero:");
		numero1 = Integer.parseInt(inputScanner.nextLine());
		inputScanner.close();
		
		numeroMultiplicado = numero1 * 5;
		numeroDividido = numero1 / 2;
		
		System.out.println("el numero multiplicado por 5 es: " + numeroMultiplicado);
		System.out.println("El numero dividido por 2 es: " + numeroDividido );
		inputScanner.close();
	}

}
