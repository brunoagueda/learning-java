package UserInterface;

import core.cartao;
import core.cartaoCashback;

public class operacao {
	public static void main(String[] args) {
		
		cartao c1, c2;
		
		c1 = new cartao("123456", "Joao Alberto", 2027, 02);
		c2 = new cartaoCashback("789123", "Maria Isabela", 2030, 3, 0);
		
		c1.adicionarCredito(1000);
		
		System.out.println(c1); // usando o toString declarado na classe, basta mandar imprimir a variavel para chamar o metodo
		
		
		if(c1.comprar(100) == true) {
			System.out.println("Compra efetuada\n");
		}
		else {
			System.out.println("Saldo insuficiente\n");
		}
		
		System.out.println(c1);
		
		c2.adicionarCredito(1000);
		
		System.out.println(c2);
		
		
		if(c2.comprar(100) == true) {
			System.out.println("Compra efetuada\n");
		}
		else {
			System.out.println("Saldo insuficiente\n");
		}
		
		System.out.println(c2);
		
		
	}
}
