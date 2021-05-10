package Questoes;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;
	
	public QuestaoSimples(String enunciado, String respota) {
		super();
		this.enunciado = enunciado;
		this.resposta = respota;
	}
	
	public void aplicarQuestao(){
		System.out.println(enunciado);
	}
	
	public boolean corrigirQuestao(String respostaAluno) {
		if(respostaAluno.equals(this.resposta)) {
			return true;
		}
		else {
			return false;
		}
	}
		
	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getRespota() {
		return resposta;
	}

	public void setRespota(String respota) {
		this.resposta = respota;
	}
	
	
}
