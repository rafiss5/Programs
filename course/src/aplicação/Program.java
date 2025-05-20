package aplicação;

import java.util.Locale;
import java.util.Scanner;

import util.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.println("Insira o número da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insira o titular da conta: ");
		String titular = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Deseja fazer um depósito inicial(s/n)? ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.println("Insira o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			account = new Account(numero,titular,depositoInicial);
		}
		else {
			account = new Account(numero, titular);
		}
		System.out.println();
		System.out.println("Dados da conta: "+ account);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
