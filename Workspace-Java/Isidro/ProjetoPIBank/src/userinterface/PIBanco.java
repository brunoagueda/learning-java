package userinterface;

import core.Conta;
import core.ContaEspecial;

public class PIBanco {
	public static void main(String[] args) {

		Conta c1, c2;
		
		c1 = new Conta("Professor Isidro", "987.654.321-00", 100021);
		c2 = new ContaEspecial("Jose das Neves", "123.456.789-00", 100031, 85.00);
		
		System.out.println(" Trabalhando com a conta comum ....");
		System.out.println(c1.exibirInfo());
		c1.creditar(100);
		System.out.println(c1.exibirInfo());
		if (c1.debitar(120)) {
			System.out.println("Debito efetivado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c1.exibirInfo());
		
		System.out.println(" ------------------------------------------------------ ");
		System.out.println(" Trabalhando com a conta especial ....");
		
		System.out.println(c2.exibirInfo());
		c2.creditar(100);
		System.out.println(c2.exibirInfo());
		if (c2.debitar(120)) {
			System.out.println("Debito efetivado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c2.exibirInfo());
	}

}
