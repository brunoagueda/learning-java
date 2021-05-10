package core;

public class ContaEspecial extends Conta{
	
	private double limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numConta, double limite) {
		super(nomeTitular, cpf, numConta);
		this.limite = limite;
	}
	
	@Override
	public String exibirInfo() {
		return super.exibirInfo() + "Limite: R$" + String.format("%.2f \n", limite);
	}
	
	@Override
	public boolean debitar(double valor) {
		if(super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
