package cartoes;

public class CartaoCashBack extends CartaoPrePago {
	private int tipo; // 0 - GOLD , 1 - SILVER , 2 - BRONZE

	public CartaoCashBack(String numeroCartao, String nomeTitular, int mesVal, int anoVal, int tipo) {
		super(numeroCartao, nomeTitular, mesVal, anoVal);
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			if (tipo == 0) {
				super.saldo += valor * 0.08;
			}
			else if (tipo == 1) {
				super.saldo += valor * 0.05;
			}
			else {
				super.saldo += valor * 0.02;
			}
			return true;
		}
		return false;
	}

	public String toString() {
		String tipoStr;
		if (tipo == 0) {
			tipoStr = "GOLD   ";
		}
		else if (tipo == 1) {
			tipoStr = "SILVER ";
		}
		else {
			tipoStr = "BRONZE ";
		}
		return "Cartao Cash Back: "+tipoStr+super.numeroCartao+" - "+super.nomeTitular + " Val: "+
		        super.mesVal+"/"+super.anoVal+String.format(" R$ %.2f", super.saldo);
	}
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}
