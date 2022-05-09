package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio33 {

	static final Scanner input = new Scanner(System.in);
	static final int FIN_DE_DATOS = 0;
	
	public static void main(String[] args) {
		
		int numero, maximo, minimo;

		System.out.println("Ingrese un numero:");
		numero = Integer.parseInt(input.nextLine());

		maximo = minimo = numero;

		while (numero != FIN_DE_DATOS) {

			if (numero > maximo) {
				maximo = numero;
			} else if (numero < minimo) {
				minimo = numero;
			}

			System.out.println("Ingrese un numero:");
			numero = Integer.parseInt(input.nextLine());
		}

		System.out.println("El numero maximo es : " + maximo + " y el minimo es : " + minimo);

		input.close();
	}

}
