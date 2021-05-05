import java.util.Scanner;

public class URI1065{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int valor, count = 0;

        for(int i = 1 ; i <= 5 ; i++){
            valor = teclado.nextInt();
            if(valor % 2 == 0){
                count++;
            }
        }

        System.out.println(count + " valores pares");
    }
}