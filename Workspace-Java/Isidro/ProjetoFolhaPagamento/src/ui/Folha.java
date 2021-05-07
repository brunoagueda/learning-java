package ui;

import core.Funcionario;

public class Folha {
	public static void main(String[] args) {
		
		Funcionario f1, f2, f3;
		
		f1 = new Funcionario(1001, "Professor Isidro", "isidro@isidro.com", 2800.00);
		f2 = new Funcionario(1002, "Coordenador Jose", "jose@jose.com    ", 3200.00);
		f3 = new Funcionario(1003, "Diretora Ana    ", "ana@ana.com      ", 4200.00);
		
		System.out.println(f1.exibirInfo() + " R$ "+f1.calcularImposto());
		System.out.println(f2.exibirInfo() + " R$ "+f2.calcularImposto());
		System.out.println(f3.exibirInfo() + " R$ "+f3.calcularImposto());
		
		System.out.println("---> Reajuste de 10% a todos");
		
		f1.reajustarSalario(10);
		f2.reajustarSalario(10);
		f3.reajustarSalario(10);
		
		System.out.println(f1.exibirInfo() + " R$ "+f1.calcularImposto());
		System.out.println(f2.exibirInfo() + " R$ "+f2.calcularImposto());
		System.out.println(f3.exibirInfo() + " R$ "+f3.calcularImposto());
	}

}
