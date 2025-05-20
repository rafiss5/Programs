package entidade;

public class Funcionário {
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
		
	}
	public void aumentarSalario(double percentual) {
		salarioBruto += salarioBruto * percentual/100;
		
	}public String toString() {
		return "Funcionário: "+nome+", R$" + String.format("%.2f", salarioLiquido());
	}
	
}

