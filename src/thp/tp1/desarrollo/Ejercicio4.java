package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio4 {
		
	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		final int DIAS_DE_LA_SEMANA = 7;
		int valorMonetatioPorHora = 0;
		int cantHorasTrabajadasPorDia = 0;
		int valorSalarioSemanal = 0;
		int salarioDeLosSabados = 0;
		int salarioDelDia = 0;
		int mitadDeLasHoras = 0;
		
		System.out.println("Ingresa el el valor monetario por hora:");
		valorMonetatioPorHora = Integer.parseInt(inputScanner.nextLine());
		
		System.out.println("Ingrese la cantidad de horas trabajadas por dia:");
		cantHorasTrabajadasPorDia = Integer.parseInt(inputScanner.nextLine());
		
		
		
		mitadDeLasHoras = cantHorasTrabajadasPorDia / 2;
		salarioDeLosSabados = valorMonetatioPorHora * mitadDeLasHoras;
		salarioDelDia = valorMonetatioPorHora * cantHorasTrabajadasPorDia;
		valorSalarioSemanal = (salarioDelDia * DIAS_DE_LA_SEMANA) + salarioDeLosSabados;
		
		System.out.println("El salario de la semana es: " + valorSalarioSemanal);
		inputScanner.close();
		
				
	}

}
