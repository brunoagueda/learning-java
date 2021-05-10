package core;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int 	 numConta;
	protected double  saldo;
	
	
	
	public Conta(String nomeTitular, String cpf, int numConta) {
		super();
		this.nomeTitular 	= nomeTitular;
		this.cpf 			= cpf;
		this.numConta 		= numConta;
	}

	public String exibirInfo() {
		return "Titular: " + nomeTitular + "\n" +
				"CPF: " + cpf + "\n" +
				"Conta: " + numConta + "\n" +
				"Saldo: R$" + String.format("%.2f", saldo) + "\n";
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if(saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
}
