package aplication;

import java.util.Locale;
import java.util.Scanner;

import calculator.ConversorDeMoeda;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" What is the dollar price? ");
		double precoDolar = sc.nextDouble();
		
		System.out.println(" How many dollars will be bought? ");
		double reais = sc.nextDouble();
		
		double resultado = ConversorDeMoeda.conversao(reais, precoDolar);
		System.out.printf(" Amount to be paid in reais = %.2f%n" , resultado);
		
		sc.close();

	}

}
