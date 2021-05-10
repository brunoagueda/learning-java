package Simulado;

import java.util.ArrayList;
import java.util.Scanner;

import Questoes.QuestaoComDica;
import Questoes.QuestaoMultiplaEscolha;
import Questoes.QuestaoSimples;

public class AplicaProva {
	public static void main(String[] args) {
		
		ArrayList<QuestaoSimples> questoes;
		double acertos = 0;
		String respostaAluno;
		Scanner teclado = new Scanner(System.in);
		
		
		questoes = new ArrayList<QuestaoSimples>();
		
		questoes.add(new QuestaoSimples("Qual a cor do cavalo branco de Napelao?", "Preto"));
		questoes.add(new QuestaoComDica("Quantos olhos tem um caolho?", "1", "Mais que 0 e menos que 2"));
		questoes.add(new QuestaoMultiplaEscolha("Com quantos paus se faz uma canoa?", "Um", "Um", "Dois", "Meia duzia", "Tantos que perdi a conta"));
//		questoes.add(new QuestaoSimples("Qual a cor do cavalo branco de Napelao?", "Preto"));
//		questoes.add(new QuestaoSimples("Qual a cor do cavalo branco de Napelao?", "Preto"));
		
		for(int i = 0 ; i < questoes.size() ; i++) {
			
			questoes.get(i).aplicarQuestao();
			
			respostaAluno = teclado.next();
			
			if(questoes.get(i).corrigirQuestao(respostaAluno)) {
				acertos++;
			}
			
		}
		
		System.out.println("Nota final:" + acertos * 10 / questoes.size());
		
		teclado.close();
	}
}
