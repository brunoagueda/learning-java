
public class Loja {
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto(1, "Computador", 2000.0);		
		
		Produto p2 = p1;
		
		System.out.println(" Exibindo P1 e P2 ");
		System.out.println("p1 = " +p1.exibirInfo());
		System.out.println("p2 = " +p2.exibirInfo());
		
		System.out.println("Alterando o preço só do produto p2");
		p2.setPreco(2500);
		System.out.println("p1 = " +p1.exibirInfo());
		System.out.println("p2 = " +p2.exibirInfo());
		
		
		String s1 = new String("Oi, quer tc?");
		String s2 = new String("Oi, quer tc?");
		
		if (s1.equals(s2)) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferentes");
		}
		
	
	}

}
