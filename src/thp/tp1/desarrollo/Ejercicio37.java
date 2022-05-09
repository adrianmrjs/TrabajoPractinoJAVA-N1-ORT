package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio37 {

	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double sueldo, acumulador;
		int i;

		acumulador = 0;
		i = 1;

		System.out.println("Ingrese el sueldo del mes " + i);
		sueldo = Double.parseDouble(input.nextLine());

		while (sueldo >= 0 && i < 12) {

			acumulador += sueldo;

			i++;
			System.out.println("Ingrese el sueldo del mes " + i);
			sueldo = Double.parseDouble(input.nextLine());

		}

		System.out.println("El monto percibido por el empleado hasta el momento es $" + acumulador);
		input.close();
	}

}
