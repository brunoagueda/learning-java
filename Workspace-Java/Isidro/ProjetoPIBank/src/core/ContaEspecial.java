package core;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(String cpfTitular, String nomeTitular, int numeroConta, double limite) {
		super(cpfTitular, nomeTitular, numeroConta);
		this.limite = limite;
	}

	@Override
	public boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		else {
			return false;
		}		
	}
	
	public String exibirInfo() {
		return super.exibirInfo() + "  R$ "+String.format("%.2f",this.limite);
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
