package aplicação;

import java.util.Scanner;

import entidade.Produto;

public class Aplication { // Principal Class

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Insira os dados do produto: ");
		
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.println("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Dados do produto: "+ produto.toString());
		
		System.out.println();
		System.out.println("Diga o número de produtos para serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println("Atualização dos dados do produto: "+ produto.toString());
		
		System.out.println("Diga o número de produtos para serem removidos do estoque: ");
		int quantidaderemov = sc.nextInt();
		produto.removerProduto(quantidaderemov);
		
		System.out.println("Atualização dos dados do produto: "+ produto.toString());
		
		sc.close();
		

	}

}
