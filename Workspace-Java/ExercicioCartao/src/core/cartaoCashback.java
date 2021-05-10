package core;

public class cartaoCashback extends cartao{
	
	private int tipo;
	double percentual;
	private String tipoCartao;
	
	public cartaoCashback(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade);
		this.tipo = tipo;
		switch (tipo) {
		case 0:
			tipoCartao = "Gold";
			percentual = 8;
			break;
			
		case 1:
			tipoCartao = "Silver";
			percentual = 5;
			break;
			
		case 2:
			tipoCartao = "Bronze";
			percentual = 2;
			break;
			
		default:
			break;
		}
	}
	
	@Override
	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo += valor * (percentual / 100 - 1) ;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		return 	"Titular do cartao: " + nomeTitular + "\n" + 
				"Numero Cartao: " + numeroCartao + "\n" +
				"Validade: " + mesValidade + "/" + anoValidade + "\n" +
				"Tipo cartao: " + tipoCartao + "\n" + 
				"Saldo cartao: R$" + String.format("%.2f\n", saldo);
	}
	
}
