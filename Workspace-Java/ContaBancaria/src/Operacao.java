import java.util.Scanner;

public class Operacao {
	
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		Conta c1;
		int aux;
		double valor;

		
		c1 = new Conta();
		
		c1.setNumConta(12345);
		c1.setDigVerif(6);
		c1.setTitular("Bruno Agueda");
		c1.setCpf("123.456.789-10");
		
								
		do {
			
			System.out.printf("\n##########################################\n");
			System.out.printf("# Digite a op??o desejada ou 0 para sair:#\n");
			System.out.println("# 1 - Deposito				 #");
			System.out.println("# 2 - Saque				 #");
			System.out.println("# 3 - Consulta				 #");
			System.out.printf("##########################################\n");
			
			aux = teclado.nextInt();
			
			switch (aux) {
				case 1:
					System.out.println("Qual valor deseja depositar?");
					valor = teclado.nextDouble();
					c1.depositar(valor);
					System.out.println("Valor depositado com sucesso");
					
					break;
					
				case 2:
					System.out.println("Qual valor deseja sacar?");
					valor = teclado.nextDouble();
					c1.sacar(valor);			
					
					break;
					
				case 3:
					c1.getInfo();
					
					break;
				
				case 0:
					System.out.println("Tenha um bom dia e ate a proxima!");
					break;
					
				default:
					System.out.println("Opcao invalida");
					break;
			}
				
		}
		while(aux != 0);
		
		teclado.close();
	}
	
}