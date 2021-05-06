
public class Livro {
	private String  titulo;
	private String  autor;
	private int     anoPublicacao;
	private String  categoria;
	private int     numEstante;
	private int     numPrateleira;
	private boolean disponivel;
	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumEstante() {
		return numEstante;
	}

	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}

	public int getNumPrateleira() {
		return numPrateleira;
	}

	public void setNumPrateleira(int numPrateleira) {
		this.numPrateleira = numPrateleira;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	void exibirLivro() {
		System.out.println("Livro: "+titulo+" / "+autor + " ("+anoPublicacao+")");
		System.out.println("Categoria: "+categoria+ "  localizacao: "+numEstante+"-"+numPrateleira);
		if (disponivel == true) {
			System.out.println("Livro disponível no acervo");
		}
		else {
			System.out.println("*** INDISPONIVEL *** ");
		}
	}
	
	void emprestar() {
		disponivel = false;
	}
	
	void devolver() {
		disponivel = true;
	}

}
