// https://www.urionlinejudge.com.br/judge/pt/problems/view/1006

import java.util.Scanner;

public class URI1006{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        double A, B, C, MEDIA;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        MEDIA = (A*2 + B*3 + C*5) / 10;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }


}