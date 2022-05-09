package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio32 {
	
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int nota;

		do {
			System.out.println("Ingrese una nota:");
			nota = Integer.parseInt(input.nextLine());
		} while (nota < 2 || nota == 3 || nota > 10);

		System.out.println("NOTA REGISTRADA CORRECTAMENTE");

		input.close();

	}

}
