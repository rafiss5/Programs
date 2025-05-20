package aplication;

import java.util.Scanner;

import entidade.Retangulo;

public class Aplication {

	public static void main(String[] args) {
			
			Retangulo retangulo = new Retangulo();
			
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Digite a altura e largura de um retangulo: ");
				retangulo.altura = sc.nextDouble();
				retangulo.largura = sc.nextDouble();
				
				System.out.print(retangulo.toString());

	}

}
