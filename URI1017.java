// https://www.urionlinejudge.com.br/judge/pt/problems/view/1017

import java.util.Scanner;

public class URI1017{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int time, dist;
        double litros;

        time = teclado.nextInt();
        dist = teclado.nextInt();

        litros = (double)time * dist / 12 ;

        System.out.printf("%.3f\n", litros);

    }
}