import java.util.Scanner;

public class Biblioteca {
	public static void main(String args[]) {
		
		Livro l1, l2, l3, l4;
		int aux;
		
		Scanner teclado = new Scanner(System.in);
		
		
		l1 = new Livro();
		l2 = new Livro();
		l3 = new Livro();
		l4 = new Livro();
		
		l1.titulo 		= "As aventuras de Pi";
		l1.autor 		= "Clarice Lispector";
		l1.ano 			= 2017;
		l1.categoria 	= "Aventura"; 
		l1.estante 		= 1;
		l1.prateleira 	= 2; 
		l1.emprestado 	= false;
		
		l2.titulo 		= "Computa??o quantica";
		l2.autor 		= "Albert Einstein";
		l2.ano 			= 2000;
		l2.categoria 	= "Ficcao Cientifica"; 
		l2.estante 		= 3;
		l2.prateleira 	= 4; 
		l2.emprestado 	= true;
		
		l3.titulo 		= "JAVA for dummies - turma 18a";
		l3.autor 		= "Francisco Isidro";
		l3.ano 			= 2021;
		l3.categoria 	= "Culinaria"; 
		l3.estante 		= 1;
		l3.prateleira 	= 5; 
		l3.emprestado 	= true;
		
		l4.titulo 		= "O retorno dos que n?o foram";
		l4.autor 		= "Drauzio Varella";
		l4.ano 			= 2015;
		l4.categoria 	= "Auto ajuda"; 
		l4.estante 		= 2;
		l4.prateleira 	= 3; 
		l4.emprestado 	= false;
		
		System.out.println("Digite o codigo do livro que deseja consultar:");
		System.out.println("1 - " + l1.titulo);
		System.out.println("2 - " + l2.titulo);
		System.out.println("3 - " + l3.titulo);
		System.out.println("4 - " + l4.titulo);
		System.out.println("Digite -1 para alugar um livro ou -2 para devolver");
		System.out.println("Digite 0 para sair");
		
		
		
		do {
			aux = teclado.nextInt();
			
			switch (aux) {
				case 1:
					l1.retornaLivro();
					System.out.println("Consulte outro livro ou digite 0 para sair");
					break;
				
				case 2:
					l2.retornaLivro();
					System.out.println("Consulte outro livro ou digite 0 para sair");
					break;
					
				case 3:
					l3.retornaLivro();
					System.out.println("Consulte outro livro ou digite 0 para sair");
					break;
					
				case 4:
					l4.retornaLivro();
					System.out.println("Consulte outro livro ou digite 0 para sair");
					break;
				
				case 0:
					System.out.println("Ate mais! Continue lendo!");
					break;
				
				case -1:
					System.out.println("Qual livro deseja alugar?");
					
					break;
				
				case -2:
					System.out.println("Qual livro deseja devolver?");
					
					break;
					
				default:
					System.out.println("Livro nao encontrado");
					break;
				}
								
			}
			while(aux != 0);
				
			teclado.close();
	}
}
