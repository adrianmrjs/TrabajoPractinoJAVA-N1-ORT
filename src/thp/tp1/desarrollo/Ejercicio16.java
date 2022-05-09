package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio16 {
	
	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantInscriptos = 0;
		int cantAsientosDisponibles = 0;
		int cantAsientosRestantes = 0;		
		
		System.out.println("Ingresa la cantidad de inscriptos:");
		cantInscriptos = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingresa la cantidad de asientos disponibles:");
		cantAsientosDisponibles = Integer.parseInt(inputScanner.nextLine());
		
		 cantAsientosRestantes =  cantAsientosDisponibles - cantInscriptos;
		 
		 if (cantAsientosRestantes > 0) {
			System.out.println("Si alcanzan los asientos. Hay un total de " + cantAsientosRestantes + " asientos");
		} else if (cantAsientosRestantes == 0) {
			System.out.println("Hubo la mismca cantidad de asientos disponibles y participantes");
		} else {
			cantAsientosRestantes = cantAsientosRestantes*-1;
			System.out.println("No alcanzaron los asientos. faltan " + cantAsientosRestantes + " asientos");
		}
		
		
		
	}

}
