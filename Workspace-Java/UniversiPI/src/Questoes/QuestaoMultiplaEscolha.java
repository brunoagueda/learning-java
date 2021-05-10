package Questoes;

public class QuestaoMultiplaEscolha extends QuestaoSimples{
	private String alt1;
	private String alt2;
	private String alt3;
	private String alt4;
	
	
	public QuestaoMultiplaEscolha(String enunciado, String respota, String alt1, String alt2, String alt3,
			String alt4) {
		super(enunciado, respota);
		this.alt1 = alt1;
		this.alt2 = alt2;
		this.alt3 = alt3;
		this.alt4 = alt4;
	}
	
	@Override
	public void aplicarQuestao(){
		System.out.println(enunciado);
		System.out.println("Alternativas: ");
		System.out.println("a) " + alt1);
		System.out.println("b) " + alt2);
		System.out.println("c) " + alt3);
		System.out.println("d) " + alt4);
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
