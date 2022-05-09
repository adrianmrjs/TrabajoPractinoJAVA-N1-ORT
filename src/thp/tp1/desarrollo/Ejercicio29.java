package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio29 {
	
	static final Scanner input = new Scanner(System.in);
	static final int NOTA_MINIMA = 0;
	static final int NOTA_MAXIMA = 10;

	public static void main(String[] args) {

			int nota;

			do {
				System.out.println("Ingrese una nota (entre 0 al 10):");
				nota = Integer.parseInt(input.nextLine());
			} while (nota < NOTA_MINIMA || nota > NOTA_MAXIMA);

			System.out.println("Se registro la nota");

			input.close();
		
	}

}
