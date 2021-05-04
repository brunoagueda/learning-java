// https://www.urionlinejudge.com.br/judge/pt/problems/view/1017

import java.util.Scanner;

public class URI1017{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int tempo, velocidade;
        double litros;

        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();

        litros = (double)tempo * velocidade / 12 ;

        System.out.printf("%.3f\n", litros);

    }
}