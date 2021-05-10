package core;

public class Conta  {
	protected String cpfTitular;
	protected String nomeTitular;
	protected int    numeroConta;
	protected double saldo;

	public Conta(String cpfTitular, String nomeTitular, int numeroConta) {
		super();
		this.cpfTitular = cpfTitular;
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
	}
	
	public boolean debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public String exibirInfo() {
		return numeroConta + " - "+nomeTitular+" ("+cpfTitular+")  R$ " + String.format("%.2f", saldo);
	}
	public String getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
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
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
