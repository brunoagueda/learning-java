// Exercicios Algoritmos-Java.pdf

// Ex 2 itens f

import java.util.Scanner;

public class Aula_1_ex2_item_f{

    public static void main(String args[]){

        // Declarando variaveis
        Scanner teclado = new Scanner(System.in);
        double altura, largura, profundidade, volume;

        // Entrada de dados
        System.out.println("Digite o valor da altura: ");
        altura = teclado.nextDouble();
        System.out.println("Digite o valor da largura: ");
        largura = teclado.nextDouble();
        System.out.println("Digite o valor da profundidade: ");
        profundidade = teclado.nextDouble();

        // Processamento
        volume = altura * largura * profundidade;

        // Saida
        System.out.println("O valor do volume vale: " + volume);

    }

}