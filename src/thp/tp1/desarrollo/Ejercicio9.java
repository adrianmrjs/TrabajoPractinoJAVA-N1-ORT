package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio9 {
	
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
		final int TOTAL_ANGULO_TRIANGULO = 180;
		double angulo1 = 0;
		double angulo2 = 0;
		double sumaDeLosAngulos = 0;
		double restoDelAngulo = 0;
		
		System.out.println("Ingresa el primer anuglo:");
		angulo1 = Double.parseDouble(inputScanner.nextLine());
		System.out.println("Ingresa el segundo angulo:");
		angulo2 = Double.parseDouble(inputScanner.nextLine());
		
		sumaDeLosAngulos = angulo1 + angulo2;
		restoDelAngulo = TOTAL_ANGULO_TRIANGULO - sumaDeLosAngulos;
		
		System.out.println("El resto del angulo es: " + restoDelAngulo);
		inputScanner.close();
	}

}
