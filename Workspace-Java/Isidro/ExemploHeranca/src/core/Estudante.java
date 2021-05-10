package core;

/* Aqui na definção da classe Estudante temos o uso do operador EXTENDS
 * que significa que a definição do tipo Estudante AMPLIA  a definição de Pessoa
 * 
 * o que isso quer dizer? 
 * Que Estutante tem TUDO O QUE TEM EM PESSOA, mais suas informações particulares
 * Estuante é uma especialização de Pessoa
 * 
 */
public class Estudante extends Pessoa {
	private int numeroMatricula;
	private String curso;

	public String exibirInfo() {
		return super.exibirInfo() + ";"+this.numeroMatricula+";"+this.curso;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
