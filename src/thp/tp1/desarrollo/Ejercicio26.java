package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio26 {
	
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n, cantidad, i;
		do {
			System.out.println("Ingrese un número natural:");
			n = Integer.parseInt(input.nextLine());
		} while (n < 1);

		cantidad = 0;
		i = 3;

		do {
			if (i % 5 != 0) {
				System.out.println(i);
				cantidad++;
			}
			i+=3;

		} while (cantidad < n);

		input.close();}

}
