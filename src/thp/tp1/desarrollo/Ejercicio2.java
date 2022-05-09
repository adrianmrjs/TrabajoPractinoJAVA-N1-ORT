package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio2 {
	
	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
//		2. Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos
//		para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio. [EC]
		
		double nota1, nota2, nota3, promedio,sumaTotalNotas;
		int cantNotas;
		nota1 = 0;
		nota2 = 0;
		nota3 = 0;
		promedio = 0;
		cantNotas = 0;
		sumaTotalNotas = 0;
		
		System.out.println("Ingrese la primera nota");
		nota1 = Double.parseDouble(inputScanner.nextLine());	
		if (10 >= nota1 && nota1 >= 0 ) {
			cantNotas++;
		}
		System.out.println("Ingrese la segunda nota");
		nota2 = Double.parseDouble(inputScanner.nextLine());	
		if (10 >= nota2 && nota2 >= 0 ) {
			cantNotas++;
		}
		System.out.println("Ingrese la tercelra nota");
		nota3 = Double.parseDouble(inputScanner.nextLine());
		if (10 >= nota3 && nota3 >= 0 ) {
			cantNotas++;
		}
		inputScanner.close();
		
		sumaTotalNotas = nota1 + nota1 + nota3;
		promedio = sumaTotalNotas / cantNotas;
		
		System.out.println("el promedio de las " + cantNotas + " notas es: " + promedio);
		inputScanner.close();
		

	}

}
