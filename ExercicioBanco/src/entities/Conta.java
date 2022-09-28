package entities;

public class Conta {

	private String nomeTitular;
	private int numeroConta;
	private double saldo;
	
	public Conta(String nomeTitular, int numeroConta, double saldoInicial) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		this.saldo = saldoInicial;
	}
	
	public Conta(String nomeTitular, int numeroConta) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito (double quantia) {
		this.saldo += quantia;
	}
	
	public void saque (double quantia) {
		this.saldo = this.saldo - quantia - 5;
	}
	
	public String toString() {
		return "nome titular: " + nomeTitular + ", conta: " + numeroConta + ", saldo: " + saldo;}
}
