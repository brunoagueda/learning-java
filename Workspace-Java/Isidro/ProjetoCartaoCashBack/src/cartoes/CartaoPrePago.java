package cartoes;

public class CartaoPrePago {
	protected String numeroCartao;
	protected String nomeTitular;
	protected int    mesVal;
	protected int    anoVal;
	protected double saldo;
	
	public CartaoPrePago(String numeroCartao, String nomeTitular, int mesVal, int anoVal) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.mesVal = mesVal;
		this.anoVal = anoVal;
	}
	
	public void adicionarCredito(double valor) {
		this.saldo += valor;
	}
	
	public boolean comprar(double valor) {
		if (this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Cartao Pre Pago: "+numeroCartao+ "-" +nomeTitular + " Val:"+mesVal+"/"+anoVal+ String.format(" R$ %.2f", saldo);
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

	public int getMesVal() {
		return mesVal;
	}

	public void setMesVal(int mesVal) {
		this.mesVal = mesVal;
	}

	public int getAnoVal() {
		return anoVal;
	}

	public void setAnoVal(int anoVal) {
		this.anoVal = anoVal;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
