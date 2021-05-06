public class LojaDeCarros {
	public static void main(String[] args) {
		
		Carro c1, c2;
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca       = "Xevrolé";
		c1.modelo 	   = "Kórça";
		c1.ano         = 1994;
		c1.cor         = "Prata filé com detalhes em branco";
		c1.combustivel = "gasolina mas se tiver mto caro alcool nunca negou";
		c1.preco       = 6200.00;
		
		c2.marca       = "Pórxy";
		c2.modelo      = "Kaieny";
		c2.ano         = 2021;
		c2.cor         = "Prata";
		c2.combustivel = "híbrido";
		c2.preco       = 1590000.00;
	
			
		System.out.println("UaiBi Motors - o patrão ficou louco!! O maior saite de tomóvis de Oz-asco");
		
		c1.mostrarAnuncio();
		// indiretamente o que acontece? a mensagem exibe o valor q ficou armazenado na variável valorIPVA dento do método
		System.out.println("Se voce tem curiosidade, o ipva deste carro vale "+c1.calcularIPVA());
		c2.mostrarAnuncio();
		System.out.println("Nao se impressione, o ipva deste carro vale "+c2.calcularIPVA());
		
		c2.exibirAnuncioComDesconto(15);
		
	}
}
