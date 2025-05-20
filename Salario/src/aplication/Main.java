package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionário;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Funcionário funcionario = new Funcionário();
		
		System.out.println("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.println("Salario bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.println("Taxa: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println(funcionario.toString());
		
		System.out.println("Qual a porcentagem de aumento salarial?: ");
		double percentual = sc.nextDouble();
		funcionario.aumentarSalario(percentual);
		
		System.out.println("Dados atualizados: "+ funcionario.toString());
		
			
		sc.close();
	}

}
