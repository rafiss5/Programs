package aplication;

import java.util.Scanner;

import util.Product;

public class Store {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Product produto1 = new Product();

		System.out.println("Digite o nome do primeiro produto: ");
		produto1.setNome(sc.nextLine());
		sc.nextLine();

		System.out.println("Digite o valor do primeiro produto: ");
		produto1.setValor(sc.nextDouble());
		sc.nextLine();

		Product produto2 = new Product();

		System.out.println("Digite o nome do segundo produto: ");
		produto2.setNome(sc.nextLine());
		sc.nextLine();

		System.out.println("Digite o valor do segundo produto: ");
		produto2.setValor(sc.nextDouble());
		sc.nextLine();

		produto1.exibirDetalhes();
		System.out.println();
		produto2.exibirDetalhes();
		System.out.println();

		System.out.println("Adicione novos produtos ao estoque. ");
		System.out.println();

		System.out.println("Adicione produtos ao estoque do primeiro produto: ");
		produto1.adicionarProduto(sc.nextInt());
		sc.nextLine();

		System.out.println("Adicione produtos ao estoque do segundo produto: ");
		produto2.adicionarProduto(sc.nextInt());
		System.out.println();

		System.out.println("Atualização do estoque: ");

		produto1.exibirDetalhes();
		System.out.println();
		produto2.exibirDetalhes();
		System.out.println();

		System.out.println("Deseja remover algum produto do estoque?(s/n)");
		String resposta = sc.next();
		if (resposta.charAt(0) == 's') {

			System.out.println("Informe a quantidade do primeiro produto para ser removido");
			produto1.removerProduto(sc.nextInt());
			System.out.println();

			System.out.println("Informe a quantidade do segundo produto para ser removido");
			produto2.removerProduto(sc.nextInt());
			System.out.println();
			System.out.println("Atualização do estoque: ");

			produto1.exibirDetalhes();
			System.out.println();
			produto2.exibirDetalhes();
			System.out.println();
		} else {
			System.out.println("Atualização do estoque: ");

			produto1.exibirDetalhes();
			System.out.println();
			produto2.exibirDetalhes();
			System.out.println();
		}

		sc.close();
	}

}
