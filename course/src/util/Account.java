package util;

public class Account {
	private int numero;
	private String titular;
	private double saldo;
	
	public Account(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}
	public Account(int numero, String titular, double depositoInicial) {
		super();
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}
	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void deposito(double quantia) {
		saldo += quantia;
	}
	public void sacar(double quantia) {
		saldo -= quantia + 5.0;
	}
	public String toString() {
		return "\nConta: " + numero
				+"\nTitular: "+ titular
				+ "\nSaldo: "+String.format("%.2f", saldo);
	}
	
	

}
