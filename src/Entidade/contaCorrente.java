package Entidade;

public class contaCorrente {
	private String nome;
	private int numCC;
	private double saldo;

	public contaCorrente(String nome,int numCC, double depositoInt) {
		this.nome = nome;
		this.numCC = numCC;
		deposito(depositoInt);
	}
	
	public contaCorrente(String nome,int numCC) {
		this.nome = nome;
		this.numCC = numCC;
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;		
	}
	
	public void saque(double valor) {
		this.saldo -=  valor + 5.00;		
	}
	

	public String getNome() {
		return nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public double getNumCC() {
		return numCC;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String ToString() {
		return " Conta :"
				+ numCC
				+ ", Titular da Conta :"
				+ nome
				+ ", saldo da Conta : "
				+ String.format("%.2f", saldo);
				
	}
	
}






















