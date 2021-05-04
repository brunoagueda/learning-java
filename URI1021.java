// https://www.urionlinejudge.com.br/judge/pt/problems/view/1021

import java.util.Scanner;

public class URI1021{

    public static void main(String args[]){

        // Define variaveis
        Scanner teclado = new Scanner(System.in);
        double valor, aux;
        int nota100, nota50, nota20, nota10, nota5, nota2, moeda1, moeda050, moeda025, moeda010, moeda005, moeda001;

        // Recebe entrada
        valor = teclado.nextDouble();

        // Processamento
        nota100 = (int)valor / 100;
        nota50 = ((int)valor % 100) / 50;
        nota20 = ((int)valor % 100 % 50) / 20;
        nota10 = ((int)valor % 100 % 50 % 20) / 10;
        nota5 = ((int)valor % 100 % 50 % 20 % 10) / 5;
        nota2 = ((int)valor % 100 % 50 % 20 % 10 % 5) / 2;
        moeda1 = ((int)valor % 100 % 50 % 20 % 10 % 5 % 2);
        aux = (valor - nota100*100 - nota50*50 - nota20*20 - nota10*10 -nota5*5 - nota2*2 - moeda1);
        moeda050 = (int)(aux / 0.5 );
        moeda025 = (int)((aux % 0.5 ) / 0.25 );
        moeda010 = (int)((aux % 0.5 % 0.25 ) / 0.10);
        moeda005 = (int)((aux % 0.5 % 0.25 % 0.10 ) / 0.05 );
        moeda001 = (int)((aux % 0.5 % 0.25 % 0.10 % 0.05 ) / 0.01 );

        // Saida
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda050 + " moeda(s) de R$ 0.50");
        System.out.println(moeda025 + " moeda(s) de R$ 0.25");
        System.out.println(moeda010 + " moeda(s) de R$ 0.10");
        System.out.println(moeda005 + " moeda(s) de R$ 0.05");
        System.out.println(moeda001 + " moeda(s) de R$ 0.01");
        
    }
}