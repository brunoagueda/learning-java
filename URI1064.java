import java.util.Scanner;

public class URI1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double valor , soma = 0 , media;
        int qtdPositivos = 0;

        for(int contador = 1 ; contador <= 6 ; contador++){
            valor = teclado.nextDouble();
            if(valor > 0){
                qtdPositivos++;
                soma = soma + valor;
            }
        }
        media = soma / qtdPositivos;

        System.out.println(qtdPositivos + " valores positivos");
        System.out.printf("%.1f\n", media);

    }
}