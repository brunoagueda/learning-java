// https://www.urionlinejudge.com.br/judge/pt/problems/view/1012

import java.util.Scanner;

public class URI1012{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        double A, B, C, triang, circ, trap, quad, ret, pi;
        

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        pi = 3.14159 ;

        triang = A * C / 2;
        circ = C * C * pi;
        trap = (A + B) * C / 2;
        quad = B * B;
        ret = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triang);
        System.out.printf("CIRCULO: %.3f\n", circ);
        System.out.printf("TRAPEZIO: %.3f\n", trap);
        System.out.printf("QUADRADO: %.3f\n", quad);
        System.out.printf("RETANGULO: %.3f\n", ret);
    }
}