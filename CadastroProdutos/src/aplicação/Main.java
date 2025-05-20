package aplicação;

import java.util.Locale;
import java.util.Scanner;

import util.Produto;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do primeiro produto: ");
		String nome1 = sc.nextLine();
		sc.nextLine();
		
		System.out.print("Informe o valor do primeiro produto: ");
		double valor1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Quantidade do primeiro produto: ");
		int quantidade1 = sc.nextInt();
		sc.nextLine();
		
		
		System.out.print("Nome do segundo produto: ");
		String nome2 = sc.nextLine();
		sc.nextLine();
		
		System.out.print("Informe o valor do segundo produto: ");
		double valor2 = sc.nextDouble();
		sc.nextLine();
		
		
		System.out.print("Quantidade do segundo produto: ");
		int quantidade2 = sc.nextInt();
		sc.nextLine();
		
		
		Produto num1 , num2;
		 
		 num1 = new Produto(nome1,valor1,quantidade1);
		 num2 = new Produto(nome2,valor2,quantidade2);
		
		 System.out.println("\nProduto 1:");
	        System.out.println(num1.toString()); 

	        System.out.println("\nProduto 2:");
	        System.out.println(num2.toString()); 

	        
	        System.out.println("\nTotal em estoque:");
	        System.out.println(num1.nome + " - R$" + num1.valorTotalEmEstoque());
	        System.out.println(num2.nome + " - R$" + num2.valorTotalEmEstoque());
	        
	        System.out.println("\nDigite quantas unidades de " + num1.nome + " deseja remover: ");
	        int qntremov = sc.nextInt();
	        num1.removerEstoque(qntremov);
	        
	        System.out.println("\nDigite quantas unidades de " + num2.nome + " deseja remover: ");
	        qntremov = sc.nextInt();
	        num2.removerEstoque(qntremov);


	        System.out.println("\nEstoque atualizado:");
	        System.out.println(num1.nome + " - " + num1.quantidade + " unidades");
	        System.out.println(num2.nome + " - " + num2.quantidade + " unidades");
	        System.out.println("\nProdutos cadastrados: " + Produto.totalProdutosCadastrados());

	        sc.close();

	}

}
