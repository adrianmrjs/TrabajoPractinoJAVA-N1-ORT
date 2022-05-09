package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio6 {
	
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
		final int sueldoFijo = 44000;
		final double porcentajeDelVendedor = 0.16;
		int ventasDelMes = 0;
		double sueldoDelVendedor = 0 ;
		
		System.out.println("Ingresa el monto total de las ventas realizadas del mes:");
		ventasDelMes = Integer.parseInt(inputScanner.nextLine());
		
		sueldoDelVendedor = (ventasDelMes * porcentajeDelVendedor) + sueldoFijo;
		
		System.out.println("El sueldo del vendor es: " + sueldoDelVendedor);
	}

}
