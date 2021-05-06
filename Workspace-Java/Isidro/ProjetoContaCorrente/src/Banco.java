import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		ContaBancaria conta = new ContaBancaria();
		conta.setNumConta(100254);
		conta.setDigitoVerificador(3);
		conta.setNomeTitular("Professor Isidro");
		conta.setCpf("987.654.321-00");
		
		do {
			System.out.println("Bem vindo ao IsiTAU! Seu banco na Internerdica!");
			System.out.println("Digite 1 - deposito / 2 - saque / 3 - info / 0 - sair");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 0:
				System.out.println("Obrigado pela confiança!");
				break;
			case 1:
				System.out.print("----> Digite o valor a depositar");
				valor = teclado.nextDouble();
				conta.depositar(valor);
				break;
			case 2:
				System.out.print("----> Digite o valor a sacar");
				valor = teclado.nextDouble();
				if (conta.sacar(valor)) {
					System.out.println("       SAQUE EFETUADO!");
				}
				else {
					System.out.println("       SALDO INSUFICIENTE");
				}
				break;
			case 3:
				System.out.println("----> Informações da Conta");
				System.out.println(conta.exibirInfo());
				break;
			default:
				System.out.println("Opcao invalida!");				
			}
		} while (opcao != 0);
		
		
		
		teclado.close();
		
	}

}
