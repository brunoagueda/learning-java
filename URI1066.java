import java.util.Scanner;

public class URI1066{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int valor, par = 0, impar = 0, positivo = 0, negativo = 0;

        for(int i = 1 ; i <= 5 ; i++){
            valor = teclado.nextInt();
            if(valor % 2 == 0){
                par++;
            }
            else{
                impar++;
            }

            if(valor < 0){
                negativo++;
            }
            else if(valor > 0){
                positivo++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}