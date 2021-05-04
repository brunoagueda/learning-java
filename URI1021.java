// https://www.urionlinejudge.com.br/judge/pt/problems/view/1021

import java.util.Scanner;

public class URI1021{

    public static void main(String args[]){

        // Define variaveis
        Scanner teclado = new Scanner(System.in);
        double valor;
        int nota100, nota50, nota20, nota10, nota5, nota2, moeda1, moeda050, moeda025, moeda010, moeda005, moeda001, reais, cents;

        // Recebe entrada
        valor = teclado.nextDouble();
        reais = (int)valor;
        cents = (int)((valor - reais) * 100) ;

        // Processamento
        nota100 = reais / 100;
        nota50 = (reais % 100) / 50;
        nota20 = (reais % 100 % 50) / 20;
        nota10 = (reais % 100 % 50 % 20) / 10;
        nota5 = (reais % 100 % 50 % 20 % 10) / 5;
        nota2 = (reais % 100 % 50 % 20 % 10 % 5) / 2;
        moeda1 = (reais % 100 % 50 % 20 % 10 % 5 % 2);
        moeda050 = (cents / 50 );
        moeda025 = (cents % 50 ) / 25 ;
        moeda010 = (cents % 50 % 25 ) / 10;
        moeda005 = (cents % 50 % 25 % 10 ) / 5 ;
        moeda001 = (cents % 50 % 25 % 10 % 5 );

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