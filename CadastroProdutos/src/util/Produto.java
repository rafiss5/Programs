package util;

public class Produto {
	
	public String nome;
	public double valor;
	public int quantidade;
	
	public static int totalProdutos = 0;
	
	public Produto(String nome, double valor,int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		totalProdutos++;
		
	}
	
	public  void adicionarEstoque(int quantidade) {
		this.quantidade += quantidade;
		
		
	}
	public void removerEstoque(int quantidade) {
		this.quantidade -= quantidade;
		
		
	}
	public double valorTotalEmEstoque() {
		return valor * quantidade;
	}
	
	public static int totalProdutosCadastrados() {
		return totalProdutos;
		
	}
	public String toString() {
	 return "Nome: " + this.nome 
		           + ", Preço: " + this.valor 
		           + ", Quantidade: " + this.quantidade;
				
				
				
				
	}
}
