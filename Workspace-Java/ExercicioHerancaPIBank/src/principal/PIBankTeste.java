package principal;

import core.Conta;
import core.ContaEspecial;

public class PIBankTeste {
	public static void main(String[] args) {
		
		Conta c1, c2;
		
		c1 = new Conta("Jose", "123.456.789-10", 12345);
		//ContaEspecial c2 = new ContaEspecial("Maria", "987.654.321-01", 6789, 500);
		c2 = new ContaEspecial("Maria", "987.654.321-01", 6789, 500);
		
		
		
//		c1.setNomeTitular("Jose");
//		c1.setCpf("123.456.789-10");
//		c1.setNumConta(12345);
		
		
		
		c1.creditar(100);
		
		System.out.println(c1.exibirInfo());
		
		if(c1.debitar(110) == true) {
			System.out.println("Saque efetuado\n");
		}
		else {
			System.out.println("Saque nao efetuado\n");
		}
		
		System.out.println(c1.exibirInfo());
		
		
		
		
//		c2.setNomeTitular("Maria");
//		c2.setCpf("987.654.321-01");
//		c2.setNumConta(6789);
//		c2.setLimite(500);
		
		c2.creditar(100);
		
		System.out.println(c2.exibirInfo());
		
		if(c2.debitar(110) == true) {
			System.out.println("Saque efetuado\n");
		}
		else {
			System.out.println("Saque nao efetuado\n");
		}
		
		System.out.println(c2.exibirInfo());
		
		
	}
}