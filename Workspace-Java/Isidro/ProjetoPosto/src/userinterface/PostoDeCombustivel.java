package userinterface;

import core.BombaDeCombustivel;

public class PostoDeCombustivel {
	public static void main(String[] args) {
		
		// tipo            nomedavariavel
		// int             a;
		BombaDeCombustivel bomba;
		bomba = new BombaDeCombustivel("Gasolina Podium Extra Super", 5.79);
		
//		bomba.setNomeCombustivel("Gasolina Podium Extra Super");
//		bomba.setPrecoLitro(5.79);
		
		bomba.abastecerPorLitros(45);
		System.out.println(bomba.imprimirRecibo());
		
		bomba.abastecerPorValor(50.0);
		System.out.println(bomba.imprimirRecibo());
		
	}

}
