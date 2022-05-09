package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio28 {
	
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int cantidad, valor, mayor, posicion;

		mayor = Integer.MIN_VALUE;
		posicion = 1;

		do {
			System.out.println("Ingrese un número entero positivo:");
			cantidad = Integer.parseInt(input.nextLine());
		} while (cantidad < 1);

		for (int i = 0; i < cantidad; i++) {

			System.out.println("Ingrese un valor cualquiera:");
			valor = Integer.parseInt(input.nextLine());
			
			if (valor > mayor) {
				mayor = valor;
				posicion = i + 1;
			}
		}

		System.out.println("El mayor número fue " + mayor + " y apareció en la posición " + posicion);

		input.close();
	}

}
