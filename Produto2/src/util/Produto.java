package util;

public class Produto {
	
	private String nome;
	private double valor;
	private int quantidade;
	
	public Produto(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
			
	}
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	


	public double totalValueInStock() {
		return valor * quantidade;
	}

	public void addProducts(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProducts(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome 
				+", $ " + String.format("%.2f", valor) 
				+ ", " 
				+ quantidade + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
