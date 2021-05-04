// https://www.urionlinejudge.com.br/judge/pt/problems/view/2787

import java.util.Scanner;

public class URI2787{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int L, C;

        L = teclado.nextInt();
        C = teclado.nextInt();

        if((L + C) % 2 == 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}