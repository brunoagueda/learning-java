package core;

public class cartao {
	
	protected String numeroCartao;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	
	
	public cartao(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
	}
	
	public void adicionarCredito(double valor) {
		this.saldo += valor;
	}
	
	public boolean comprar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return 	"Titular do cartao: " + nomeTitular + "\n" + 
				"Numero Cartao: " + numeroCartao + "\n" +
				"Validade: " + mesValidade + "/" + anoValidade + "\n" +
				"Saldo cartao: R$" + String.format("%.2f\n", saldo);
	}
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
}
