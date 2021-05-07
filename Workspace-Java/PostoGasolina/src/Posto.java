import java.util.Scanner;


public class Posto {
	
	
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		int aux1, aux2;
		double valorGasolina = 5.00;
		double valorEtanol = 3.50;
		double leitura;
		
		BombaCombustivel b1;
		
		b1 = new BombaCombustivel();
		
		do {
			System.out.println("Bem vindo! Selecione o combustivel desejado: 1 - Gasolina 2 - Etanol 0 - Para sair");
			aux1 = teclado.nextInt();
			
			if(aux1 == 1) {
				b1.setTipoCombustivel("Gasolina");
				b1.setPrecoLitro(valorGasolina);
				
			}
			else if(aux1 == 2){
				b1.setTipoCombustivel("Etanol");
				b1.setPrecoLitro(valorEtanol);
				
			}
			else if(aux1 == 0) {
				System.out.println("Tenha um bom dia e ate a proxima!");
			}
			else {
				System.out.println("Opcao invalida");
			}
			
			if(aux1 == 1 || aux1 ==2) {
				System.out.println("Como deseja abastecer? \n 1 - Abastecer um valor em $ \n 2 - Abastcer um valor em litros");
				aux2 = teclado.nextInt();
				
				if(aux2 == 1) { //opcao para abastecer em $
					System.out.println("Digite o valor em $ que deseja abastecer:");
					leitura = teclado.nextDouble();
					b1.setTotalPagar(leitura);
					
				}
				else if(aux2 == 2) { // opcao para abastecer em litros
					System.out.println("Digite quantos litros voce quer abastecer:");
					leitura = teclado.nextDouble();
					b1.setQtdeLitros(leitura);
					
				}
				System.out.println(b1.getRecibo());
			}
			
		} while (aux1 != 0);
		
		teclado.close();
	}
}