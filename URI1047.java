// https://www.urionlinejudge.com.br/judge/pt/problems/view/1047

import java.util.Scanner;

public class URI1047{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int hora_inicio, minuto_inicio, hora_fim, minuto_fim, hora_duracao, minuto_duracao, tempoI, tempoF, duracao;

        hora_inicio = teclado.nextInt();
        minuto_inicio = teclado.nextInt();
        hora_fim = teclado.nextInt();
        minuto_fim = teclado.nextInt();

        tempoI = hora_inicio * 60 + minuto_inicio;
        tempoF = hora_fim * 60 + minuto_fim;

        duracao = tempoF - tempoI;

        if(duracao <= 0){
            duracao = duracao + 24*60;
        }
        
        hora_duracao = duracao / 60;
        minuto_duracao = duracao % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hora_duracao, minuto_duracao);
    }
}