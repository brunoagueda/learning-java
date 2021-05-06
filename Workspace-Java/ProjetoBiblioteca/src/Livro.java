
public class Livro {
	
	String 	titulo;
	String 	autor;
	int 	ano;
	String 	categoria;
	int 	estante, prateleira;
	boolean	emprestado;
	
	void retornaLivro(){
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano do livro: " + ano);
		System.out.println("Categoria: " + categoria);
		System.out.println("Estante: " + estante + " - Prateleira: " + prateleira);
		if(emprestado == false) {
			System.out.println("Livro está disponivel");
		}
		else {
			System.out.println("Livro esta emprestado");
		}
		
		
	}
	
	void emprestar() {
		emprestado = true;
	}
	
	void devolver() {
		emprestado = false;
	}
	
}
