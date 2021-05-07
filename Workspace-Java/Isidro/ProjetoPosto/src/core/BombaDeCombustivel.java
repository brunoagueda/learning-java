package core;

public class BombaDeCombustivel {
	private String nomeCombustivel;
	private double precoLitro;
	private double totalLitros;
	private double totalPagar;
	

	
	public BombaDeCombustivel(String nomeCombustivel, double precoLitro, double totalLitros, double totalPagar) {
		this.nomeCombustivel = nomeCombustivel;
		this.precoLitro = precoLitro;
		this.totalLitros = totalLitros;
		this.totalPagar = totalPagar;
	}
	
	public BombaDeCombustivel(String nomeCombustivel, double precoLitro, double totalLitros) {
		this.nomeCombustivel = nomeCombustivel;
		this.precoLitro = precoLitro;
		this.totalLitros = totalLitros;
	}

	public BombaDeCombustivel(String nomeCombustivel, double precoLitro) {
		this.nomeCombustivel = nomeCombustivel;
		this.precoLitro = precoLitro;
	}

	public void abastecerPorLitros(double litros) {
		totalLitros = litros;  // eu determino quantos litros
		totalPagar  = litros * precoLitro;
	}
	
	public void abastecerPorValor(double total) {
		totalPagar  = total;
		totalLitros = total / precoLitro;
	}
	
	public String imprimirRecibo() {
		String recibo;
		recibo = "******************************************************\n"+
		         "*  I S I D R O C O R P     G A S   &   E N E R G Y   *\n"+
				 "------------------------------------------------------\n"+
		         "  Combustivel      : "+nomeCombustivel + "\n"+
				 "  Preço Litro     R$ "+ String.format("%.3f\n", precoLitro)  +
				 "  Litros Abastecidos "+ String.format("%.3f\n", totalLitros) +
				 "  Total a Pagar   R$ "+ String.format("%.2f\n", totalPagar)  +
				 "======================================================";
		return recibo;
		
	}
	
	public String getNomeCombustivel() {
		return nomeCombustivel;
	}
	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getTotalLitros() {
		return totalLitros;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
}
