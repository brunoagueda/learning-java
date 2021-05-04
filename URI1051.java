// https://www.urionlinejudge.com.br/judge/pt/problems/view/1051

import java.util.Scanner;

public class URI1051{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        double renda, imposto;

        renda = teclado.nextDouble();

        if(renda <= 2000){
            System.out.println("Isento");
        }
        else if(renda >= 2000.01 && renda <= 3000){
            imposto = (renda - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else if(renda >= 3000.1 && renda <= 4500){
            imposto = (1000 * 0.08) + (renda - 3000) * 0.18;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else {
            imposto = (1000 * 0.08) + (1500 * 0.18) + (renda - 4500) * 0.28;
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}