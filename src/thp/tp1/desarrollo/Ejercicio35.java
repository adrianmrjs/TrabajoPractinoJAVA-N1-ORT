package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio35 {
 
	static final Scanner input = new Scanner(System.in);
	static final String FIN_DE_DATOS = "*";

	public static void main(String[] args) {
		String nombre, nombreJoven;
		int edad, minEdad;

		minEdad = Integer.MAX_VALUE;
		nombreJoven = "";

		System.out.println("Ingrese el nombre de la persona (* indica fin de ingreso):");
		nombre = input.nextLine();

		while (!nombre.equals(FIN_DE_DATOS)) {

			do {
				System.out.println("Ingrese la edad de la persona:");
				edad = Integer.parseInt(input.nextLine());
			} while (edad < 0);

			if (edad < minEdad) {
				minEdad = edad;
				nombreJoven = nombre;
			}

			System.out.println("Ingrese el nombre de la persona (* indica fin de ingreso):");
			nombre = input.nextLine();
		}

		if (minEdad != Integer.MAX_VALUE) {
			System.out.println("La persona más joven se llama: " + nombreJoven);
		}
		else {
			System.out.println("No se registraron datos de personas");
		}
		
		input.close();
	}

}
