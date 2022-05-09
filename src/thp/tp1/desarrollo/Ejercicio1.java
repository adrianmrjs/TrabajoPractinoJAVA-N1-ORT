package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		//1. Realizá un programa que permita que el usuario ingrese su nombre. El programa debe emitir
		//una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC]
		
		String nombre1;
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		nombre1 = inputScanner.nextLine();
		inputScanner.close();
		
		System.out.println("Hola " + nombre1 + " Bienvenido!!");
	}

}
