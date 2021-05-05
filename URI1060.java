import java.util.Scanner;

public class URI1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double valor;
        int qtdPositivos = 0;

        for(int contador = 1 ; contador <= 6 ; contador++){
            valor = teclado.nextDouble();
            if(valor > 0){
                qtdPositivos++;
            }
        }
        System.out.println(qtdPositivos + " valores positivos");

    }
}