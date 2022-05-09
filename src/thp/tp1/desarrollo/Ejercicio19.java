package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio19 {
	
	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero = 0;
		boolean esDeUnSoloDigito, esImpar, estaEnAmbosGrupos, noEstaEnNingunGrupo;
		
		System.out.println("Ingresa un numero:");
		numero = Integer.parseInt(inputScanner.nextLine());
		
		esDeUnSoloDigito = numero < 10;
		esImpar = numero % 2 == 1;
		estaEnAmbosGrupos = esDeUnSoloDigito && esImpar;
		noEstaEnNingunGrupo = esDeUnSoloDigito || esImpar;
		
		if (esDeUnSoloDigito) {
			System.out.println("El numero ingresado es solo un digito");
			if (esImpar) {
				System.out.println("El numero ingresado es impar");
			} if (estaEnAmbosGrupos) {
				System.out.println("El numero ingresado pertecence a ambos grupos");
			} if (noEstaEnNingunGrupo) {
				System.out.println("El numero ingresado solo pertenece a un grupo");
			} 
		} else {
			System.out.println("El numero ingresado posee dos digitos");
		}
		inputScanner.close();
		
	}

}
