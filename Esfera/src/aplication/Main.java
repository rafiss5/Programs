package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calcular;

public class Main {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calcular calc = new Calcular();
		
		System.out.print("Entre com o valor do raio: ");
		
		double raio = sc.nextDouble();
		
		double c = calc.circumferencia(raio);
		
		double v = calc.volume(raio);
		
		System.out.printf("Circumferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", calc.PI);
		
		

	}
	
}
