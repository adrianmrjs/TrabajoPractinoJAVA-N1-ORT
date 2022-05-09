package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio34 {

	static final Scanner input = new Scanner(System.in);
	static final int FIN_DE_DATOS = 0;
	
	public static void main(String[] args) {
		double estatura, acumulador, promedio;
		int cantidad;

		acumulador = 0;
		cantidad = 0;

		System.out.println("Ingrese la estatura en metros del jugador " + (cantidad + 1) + ":");
		estatura = Double.parseDouble(input.nextLine());

		while (estatura != FIN_DE_DATOS) {

			acumulador += estatura;
			cantidad++;

			System.out.println("Ingrese la estatura en metros del jugador " + (cantidad + 1) + ":");
			estatura = Double.parseDouble(input.nextLine());

		}

		if (cantidad > 0) {
			promedio = (double) acumulador / cantidad;
			System.out.println("La estatura promedio del equipo es : " + promedio);
		} else {
			System.out.println("No se ingresaron estaturas de jugadores");
		}

		input.close();

	}

}
