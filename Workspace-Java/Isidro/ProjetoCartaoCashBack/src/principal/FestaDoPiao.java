package principal;

import java.util.ArrayList;

import cartoes.CartaoCashBack;
import cartoes.CartaoPrePago;

public class FestaDoPiao {
	public static void main(String[] args) {
		
		/* agora vou trabalhar com ARrayList ao invés de vetor de tamanho fixo */
		
		ArrayList<CartaoPrePago> cartoes;  // só tenho a referência, preciso instanciar o objeto
		cartoes = new ArrayList<CartaoPrePago>();
		
		
		cartoes.add(new CartaoPrePago("111 222 333 444","Cliente PP1", 10, 2025) );
		cartoes.add(new CartaoCashBack("222 333 444 555", "Cliente CB2", 10, 2025, 0));
		cartoes.add(new CartaoCashBack("333 444 555 777", "Cliente CB3", 10, 2025, 1));
		cartoes.add(new CartaoCashBack("555 777 888 999", "Cliente CB4", 10, 2025, 2));
		cartoes.add(new CartaoCashBack("777 888 999 000", "Cliente CB5", 10, 2025, 2));
				
		for (int pos=0; pos < cartoes.size(); pos++) {
			System.out.println(cartoes.get(pos));
			cartoes.get(pos).adicionarCredito(1000);
		}
		
		for (int pos=0; pos < cartoes.size(); pos++) {
			System.out.println(cartoes.get(pos));
			cartoes.get(pos).comprar(200);
		}
		
		for (int pos=0; pos < cartoes.size(); pos++) {
			System.out.println(cartoes.get(pos));
		}
		
		
		
		/*
		CartaoPrePago cartoes[];
		
		cartoes = new CartaoPrePago[7]; // auqi eu não tenho o objeto, isso é o equivalente a ter 5 variáveis
		
		cartoes[0] = new CartaoPrePago("111 222 333 444","Cliente PP1", 10, 2025);
		cartoes[1] = new CartaoCashBack("222 333 444 555", "Cliente CB2", 10, 2025, 0);
		cartoes[2] = new CartaoCashBack("333 444 555 777", "Cliente CB3", 10, 2025, 1);
		cartoes[3] = new CartaoCashBack("555 777 888 999", "Cliente CB4", 10, 2025, 2);
		cartoes[4] = new CartaoCashBack("777 888 999 000", "Cliente CB5", 10, 2025, 2);
		
		
		for (int pos=0; pos < 7; pos++) {
			System.out.println(cartoes[pos]);
			cartoes[pos].adicionarCredito(1000);
		}
		
		for (int pos=0; pos < 7; pos++) {
			System.out.println(cartoes[pos]);
			cartoes[pos].comprar(200);
		}
		
		for (int pos=0; pos < 7; pos++) {
			System.out.println(cartoes[pos]);
		}
		 * 
		 * 
		 */
		
	}
}
