package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio30 {
	
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char operacion;
		int numero1, numero2;

		do {
			System.out.println("Ingrese un caracter para la operacion (+, -, *, /, F es fin de ingreso):");
			operacion = input.nextLine().charAt(0);
		} while (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '*' && operacion != '/'
				&& operacion != 'F');

		while (operacion != 'F') {

			System.out.println("Ingrese el primer numero:");
			numero1 = Integer.parseInt(input.nextLine());

			System.out.println("Ingrese el segundo numero:");
			numero2 = Integer.parseInt(input.nextLine());

			switch (operacion) {
			case '+':
				System.out.println(numero1 + numero2);

				break;
			case '-':
				System.out.println(numero1 - numero2);

				break;
			case '*':
				System.out.println(numero1 * numero2);

				break;
			case '/':
				if (numero2 != 0) {
					System.out.println((double) numero1 / numero2);
				} else {
					System.out.println("No se puede dividir por 0!");
				}
				break;
			}
			do {
				System.out.println("Ingrese un caracter para la operacion (+, -â, *, /, F es fin de ingreso):");
				operacion = input.nextLine().charAt(0);
			} while (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '*' && operacion != '/'
					&& operacion != 'F');
		}
	}

}
