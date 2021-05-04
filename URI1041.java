// https://www.urionlinejudge.com.br/judge/pt/problems/view/1041

import java.util.Scanner;

public class URI1041{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        double eixoX, eixoY;

        eixoX = teclado.nextDouble();
        eixoY = teclado.nextDouble();

        if(eixoX == 0 && eixoY != 0){
            System.out.println("Eixo Y");
        }
        else if(eixoX != 0 && eixoY == 0){
            System.out.println("Eixo X");
        }
        else if(eixoX > 0 && eixoY > 0){
            System.out.println("Q1");
        }
        else if(eixoX < 0 && eixoY > 0){
            System.out.println("Q2");
        }
        else if(eixoX < 0 && eixoY < 0){
            System.out.println("Q3");
        }
        else if(eixoX > 0 && eixoY < 0){
            System.out.println("Q4");
        }
        else{
            System.out.println("Origem");
        }
    }
}