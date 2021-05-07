package Pagamentos;

import java.util.Scanner;

import InfoRH.Funcionario;

public class Reajuste {
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		int reajuste;
		Funcionario func1, func2, func3 ;
		
		func1 = new Funcionario(1234,  "Joao Iboia", "jiboia@isidrocorp.com.br", 1950);
		func2 = new Funcionario(5678, "Maria Olenga", "molenga@isidrocorp.com.br", 3500);
		func3 = new Funcionario(91011, "Jorge Aburu", "jaburu@isidrocorp.com.br", 6000);
		
		System.out.println("Digite o valor do reajuste:");
		reajuste = teclado.nextInt();
		
		func1.ajustarSalario(reajuste);
		func2.ajustarSalario(reajuste);
		func3.ajustarSalario(reajuste);
		
		func1.calcularValorImposto();
		func2.calcularValorImposto();
		func3.calcularValorImposto();
		
		System.out.println(func1.getInfo());
		System.out.println(func2.getInfo());
		System.out.println(func3.getInfo());
		
		teclado.close();
	}
}