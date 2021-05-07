
public class Conta {
	
	private int numConta;
	private int digVerif;
	private String titular;
	private String cpf;
	private double saldo;
	
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getDigVerif() {
		return digVerif;
	}
	
	public void setDigVerif(int digVerif) {
		this.digVerif = digVerif;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getInfo() {
		String msg = "Numero da conta: " + numConta + " Dig.: " + digVerif + "\n" + "Nome do titular: " + titular + "\n" + "CPF do titular: " + cpf + String.format("Saldo em conta: R$ %.2f\n" , saldo);  
		return msg;
	}
	
	public double depositar(double valor) {
		saldo = saldo + valor;
		return saldo; 
	}
	
	public double sacar(double valor) {
		if(valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("Valor sacado com sucesso!");
		}
		else {
			System.out.println("Saldo insuficiente para a operacao, saque nao realizado");
		}
		
		return saldo;
	}
	
}
