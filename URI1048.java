// https://www.urionlinejudge.com.br/judge/pt/problems/view/1048

import java.util.Scanner;

public class URI1048{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        double salario, novoSalario, reajuste;
        int percent;
        

        salario = teclado.nextDouble();

        if(salario >= 0 && salario <= 400.00){
            percent = 15;
        }
        else if(salario >= 400.01 && salario <= 800.00){
            percent = 12;
        }
        else if(salario >= 800.01 && salario <= 1200.00){
            percent = 10;
        }
        else if(salario >= 1200.01 && salario <= 2000.00){
            percent = 7;
        }
        else{
            percent = 4;
        }
        
        reajuste = salario * percent/100;
        novoSalario = salario + reajuste;
        
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n" , percent);
    }
}