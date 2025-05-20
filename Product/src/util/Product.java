package util;

public class Product {
	
	private String nome;
	private double valor;
	private int quantidadeEmEstoque;
	
	public Product( ) {
		this.nome = nome;
		this.valor = valor;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.trim().isEmpty()) {
			this.nome = nome;
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor >= 0) {
			this.valor = valor;
		}
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		if (quantidadeEmEstoque >= 0) {
			this.quantidadeEmEstoque = quantidadeEmEstoque;
		}
	} 
	
	public void exibirDetalhes() {
		 System.out.println("Produto: "+nome+"\nPreço: R$ "+valor+" \nQuantidade em estoque: "+quantidadeEmEstoque);
	}
	
	public void adicionarProduto(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque += quantidadeEmEstoque;
		
	}
	
	public void removerProduto(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque -= quantidadeEmEstoque;
	}

}
