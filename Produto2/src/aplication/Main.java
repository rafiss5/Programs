package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		System.out.print("Price: ");
		double valor = sc.nextDouble();
		
		System.out.println();
		Produto produto = new Produto(nome, valor);
		System.out.println("Product data: " + produto);
		System.out.println();
		
			
		System.out.print("Enter the number of products to be added in stock: ");
		int quantidade = sc.nextInt();
		produto.addProducts(quantidade);
		System.out.println();
		System.out.println("Updated data: " + produto);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantidade = sc.nextInt();
		produto.removeProducts(quantidade);
		System.out.println();
		System.out.println("Updated data: " + produto);
		sc.close();

	}

}
