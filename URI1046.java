// https://www.urionlinejudge.com.br/judge/pt/problems/view/1046

import java.util.Scanner;

public class URI1046{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int inicio, fim, duracao;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        if(inicio < fim){
            duracao = fim - inicio;
        }
        else if(inicio > fim){
            duracao = 24 + fim - inicio;
        }
        else{
            duracao = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        // outra opção que tbm funciona para a saida:
        //System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
                
    }
}