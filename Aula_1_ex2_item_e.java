// Exercicios Algoritmos-Java.pdf

// Ex 2 itens e

import java.util.Scanner;

public class Aula_1_ex2_item_e{

    public static void main(String args[]){

        // Declarando variaveis
        Scanner teclado = new Scanner(System.in);
        double base_maior, base_menor, altura, area;

        // Entrada de dados
        System.out.println("Digite o valor da base maior: ");
        base_maior = teclado.nextDouble();
        System.out.println("Digite o valor da base menor: ");
        base_menor = teclado.nextDouble();
        System.out.println("Digite o valor da altura: ");
        altura = teclado.nextDouble();

        // Processamento
        area = (base_menor + base_maior)*altura/2;

        // Saida
        System.out.println("O valor da area vale: " + area);
    }

       


}