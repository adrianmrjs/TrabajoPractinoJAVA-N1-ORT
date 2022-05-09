package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio31 {
	
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char opcion;

		System.out.println("¿Deseas continuar? [S/N]");
		opcion = input.nextLine().charAt(0);

		while (opcion != 'S' && opcion != 's' && opcion != 'N' && opcion != 'n') {
			System.out.println("¿Deseas continuar? [S/N]");
			opcion = input.nextLine().charAt(0);

		}
		
		input.close();

	}


}
