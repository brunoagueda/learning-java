package core;

/* Aqui na defin��o da classe Estudante temos o uso do operador EXTENDS
 * que significa que a defini��o do tipo Estudante AMPLIA  a defini��o de Pessoa
 * 
 * o que isso quer dizer? 
 * Que Estutante tem TUDO O QUE TEM EM PESSOA, mais suas informa��es particulares
 * Estuante � uma especializa��o de Pessoa
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
