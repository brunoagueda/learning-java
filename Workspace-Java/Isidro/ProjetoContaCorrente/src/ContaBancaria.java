
public class ContaBancaria {
	private int    numConta;
	private int    digitoVerificador;
	private String nomeTitular;
	private String cpf;
	private double saldo;
	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public boolean sacar(double valorSaque) {
		
		if (valorSaque > saldo) {
			return false;
		}
		else {
			saldo = saldo - valorSaque;
			return true;
		}
	}
	
	public String exibirInfo() {
		String info = "Conta Bancaria: "+numConta+"-"+digitoVerificador + "\n" +
		              "Titular       : "+nomeTitular+" ("+cpf+")" + "\n" +
		              String.format("Saldo R$ %.2f\n", saldo);
		return info;
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getDigitoVerificador() {
		return digitoVerificador;
	}
	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
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
	public double getSaldo() {
		return saldo;
	}
	
	

}
