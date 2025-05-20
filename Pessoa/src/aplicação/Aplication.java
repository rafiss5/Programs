package aplicação;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite seu cpf: ");
		String cpf = sc.nextLine();
		
		Pessoa pessoa1 = new Pessoa(nome, idade, cpf);
		
		System.out.println("\nDados da pessoa 1 - ");
		pessoa1.exibirDados();
		sc.close();

	}

}
