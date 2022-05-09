package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio27 {
	
	static Scanner input = new Scanner(System.in);
	static final int CANTIDAD_EDADES = 5;

	public static void main(String[] args) {
		int edad, acumEdad, imparesMayores;
		double promedio;

		acumEdad = 0;
		imparesMayores = 0;

		for (int i = 0; i < CANTIDAD_EDADES; i++) {
			do {
				System.out.println("Ingrese la edad " + (i + 1) + ":");
				edad = Integer.parseInt(input.nextLine());
			} while (edad < 1);

			acumEdad += edad;
			
			if (edad > 18 && edad % 2 != 0) {
				imparesMayores++;
			}
		}

		promedio = (double) acumEdad / CANTIDAD_EDADES;

		System.out.println("El promedio de edades es : " + promedio);
		System.out.println("La cantidad de edades impares mayores a 18 fueron : " + imparesMayores);

		input.close();

	}

}
