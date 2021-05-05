import java.util.Scanner;

public class URI1074{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int n, leitura;

        n = teclado.nextInt();

        for(int i = 1 ; i <= n ; i++){
            leitura = teclado.nextInt();
            
            if(leitura == 0){
                System.out.println("NULL");
            }
            else if(leitura > 0 && leitura % 2 == 0){
                System.out.println("EVEN POSITIVE");
            }
            else if(leitura < 0 && leitura % 2 == 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if(leitura > 0 && leitura % 2 != 0){
                System.out.println("ODD POSITIVE");
            }
            else if(leitura < 0 && leitura % 2 != 0){
                System.out.println("ODD NEGATIVE");
            }
        }
    }
}