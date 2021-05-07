
public class BombaCombustivel {
	
	private String tipoCombustivel;
	private double precoLitro;
	private double qtdeLitros;
	private double totalPagar;
	
		
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdeLitros() {
		return qtdeLitros;
	}
	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
		this.totalPagar = this.qtdeLitros * this.precoLitro;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
		this.qtdeLitros = this.totalPagar / this.precoLitro;
	}
	
	public String getRecibo() {
		String recibo = "Combustivel: " + this.tipoCombustivel + "\n" + 
						"Preco por litro: R$ " + String.format("%.3f", this.precoLitro) + "\n" + 
						"Total de litros: " + String.format("%.3f", this.qtdeLitros) + "\n" + 
						"Valor total: R$ " + String.format("%.2f\n", this.totalPagar);
		return recibo;
	}
	
	
}
