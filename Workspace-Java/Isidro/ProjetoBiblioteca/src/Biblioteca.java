
public class Biblioteca {
	public static void main(String[] args) {
		Livro l1, l2, l3;
		
		l1 = new Livro();
		l2 = new Livro();
		l3 = new Livro();
		
		l1.exibirLivro();
		
		l1.setTitulo("Java para iniciantes");
		l1.setAutor("Prof. Isidro");
		l1.setAnoPublicacao(2021);;
		l1.setCategoria("Terror");
		l1.setNumEstante(10);
		l1.setNumPrateleira(5);
		
		l2.setTitulo("Java para Avan�ados");
		l2.setAutor("Prof. Isidro");
		l2.setAnoPublicacao(2021);
		l2.setCategoria("Fic��o Cient�fica");
		l2.setNumEstante(5);
		l2.setNumPrateleira(9);
		
//		l1.exibirLivro();
//		l2.exibirLivro();
//		
//		l1.emprestar();
//		System.out.println("-----------> ap�s emprestimo do livro "+l1.getTitulo());
//		l1.exibirLivro();
//		l2.exibirLivro();
	}

}
