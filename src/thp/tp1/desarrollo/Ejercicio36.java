package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio36 {
	static final int VALOR_CORTE = 20;
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		int acumulado;
		int cantidad;
		int promedio;

		cantidad = 0;
		acumulado = 0;

		do {
			System.out.println("Ingrese un numero");
			numero = Integer.parseInt(input.nextLine());

			acumulado += numero;
			cantidad++;
			promedio = acumulado / cantidad;
		} while (promedio < VALOR_CORTE);

		System.out.println("Se leyeron " + cantidad + " numeros.");
		
		input.close();
	}

}
