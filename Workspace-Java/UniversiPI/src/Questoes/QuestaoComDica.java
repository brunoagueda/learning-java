package Questoes;

public class QuestaoComDica extends QuestaoSimples{
	
	private String dica;

	public QuestaoComDica(String enunciado, String respota, String dica) {
		super(enunciado, respota);
		this.dica = dica;
	}
	
	@Override
	public void aplicarQuestao(){
		System.out.println(enunciado);
		System.out.println("Dica: " + dica);
	}
	
	@Override
	public boolean corrigirQuestao(String respostaAluno) {
		if(respostaAluno.equals(this.resposta)) {
			return true;
		}
		else {
			return false;
		}
	}
}
