package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio38 {
	
	static final Scanner input = new Scanner(System.in);
	static final String USUARIO = "admin";
	static final String CONTRASEÑA = "123456";

	public static void main(String[] args) {
		int intentos;
		String usuario, contraseña;

		intentos = 0;

		do {
			System.out.println("Ingrese usuario:");
			usuario = input.nextLine();

			System.out.println("Ingrese contraseÃ±a:");
			contraseña = input.nextLine();

			intentos++;

		} while (intentos < 3 && (!usuario.equals(USUARIO) || !contraseña.equals(CONTRASEÑA)));

		if (usuario.equals(USUARIO) && contraseña.equals(CONTRASEÑA)) {
			System.out.println("Acceso concedido");
		} else {
			System.out.println("Se ha bloqueado la cuenta");
		}
		
	input.close();

	}

}
