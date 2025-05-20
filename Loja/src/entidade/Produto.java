package entidade;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque() {
		return preco * quantidade;
	}
	
	public  void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome
				+ "; R$ "
				+ String.format("%.2f",preco)
				+", "
				+ quantidade 		
				+" unidas, Total: R$ " 
				+String.format("%.2f",totalValorEmEstoque());
			 
		
		
		
	}
	

}
