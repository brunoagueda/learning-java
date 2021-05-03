// Exercicios Algoritmos-Java.pdf

// Ex 2 itens c

import java.util.Scanner;

public class Aula_1_ex2_item_c{

    public static void main(String args[]) {
        
        // Declarando variaveis
        Scanner teclado = new Scanner(System.in);
        double base, altura, area;

        // Entrada de dados
        System.out.println("Digite o valor da base: ");
        base = teclado.nextDouble();
        System.out.println("Digite o valor da altura: ");
        altura = teclado.nextDouble();

        // Processamento
        area = (base * altura)/2 ;

        // Saida
        System.out.println("O valor da area vale: " + area);
    }




}