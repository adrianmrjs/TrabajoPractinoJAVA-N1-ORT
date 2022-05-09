package thp.tp1.desarrollo;

import java.util.Scanner;

public class Ejercicio10 {
	
	static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String nombreSocio1;
		String nombreSocio2;
		String nombreSocio3;
		double importeSocio1 = 0;
		double importeSocio2 = 0;
		double importeSocio3 = 0;
		double importeTotal = 0;
		double porcenAportadoSocio1 = 0;
		double porcenAportadoSocio2 = 0;
		double porcenAportadoSocio3 = 0;
		
//		Ingreso de Datas de socio1
		System.out.println("Ingresa el nombre del primer socio:");
		nombreSocio1 = inputScanner.nextLine();	
		System.out.println("Ingresa el importe aportado de " + nombreSocio1);
		importeSocio1 = Double.parseDouble(inputScanner.nextLine());
		
//		Ingreso de Datas de socio2
		System.out.println("Ingresa el nombre del segundo socio:");
		nombreSocio2 = inputScanner.nextLine();	
		System.out.println("Ingresa el importe aportado de " + nombreSocio2);
		importeSocio2 = Double.parseDouble(inputScanner.nextLine());
		
//		Ingreso de Datas de socio3
		System.out.println("Ingresa el nombre del tercer socio:");
		nombreSocio3 = inputScanner.nextLine();	
		System.out.println("Ingresa el importe aportado de " + nombreSocio3);
		importeSocio3 = Double.parseDouble(inputScanner.nextLine());
		
//		Operaciones con los datos ingresados
		importeTotal = importeSocio1 + importeSocio2 + importeSocio3;
		porcenAportadoSocio1 = importeSocio1 * 100 / importeTotal;
		porcenAportadoSocio2 = importeSocio2 * 100 / importeTotal;
		porcenAportadoSocio3 = importeSocio3 * 100 / importeTotal;
		
		System.out.println(nombreSocio1 + " aporto el " + porcenAportadoSocio1 + "% del total de " + importeTotal);
		System.out.println(nombreSocio2 + " aporto el " + porcenAportadoSocio2 + "% del total de " + importeTotal);
		System.out.println(nombreSocio3 + " aporto el " + porcenAportadoSocio3 + "% del total de " + importeTotal);
	}

}
