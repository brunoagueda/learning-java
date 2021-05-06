/* esta classe vai apenas representar/definir meu novo tipo de dado
 * chamado Carro 
 * aqui eu vou reunir todas as variáveis que eu acho relevantes
 * para armazenar sobre um carro
 */
public class Carro {
	
	// variáveis que compoem um carro (atributos)
	String modelo;
	String marca;
	int    ano;
	String combustivel;
	String cor;
	double preco;
	
	void mostrarAnuncio() {
		System.out.println("Carro: "+ marca + " " + modelo);
		System.out.println("Ano:" + ano + " - Combustivel: " + combustivel);
		System.out.println("Cor: "+ cor);
		System.out.println("R$ "+preco);
		System.out.println("------------------------------");
	}
	
	double calcularIPVA(){
		double valorIPVA = preco * 0.04;
		return valorIPVA;
	}
	
	
	void exibirAnuncioComDesconto(double percentual) {
		double precoComDesconto;
		System.out.println("O patrao ficou absurdamente louco");
		System.out.println("Só pra quem ligar agora!!!");
		precoComDesconto = preco - preco * percentual/100;
		System.out.println(marca + " " + modelo + "de R$ "+preco+ " por R$ " +precoComDesconto);
	}
	
	
	

}
