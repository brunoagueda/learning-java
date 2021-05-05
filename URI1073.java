import java.util.Scanner;

public class URI1073{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int n, count;

        n = teclado.nextInt();
        
        for(int i = 2 ; i <= n ; i += 2){
            System.out.println(i + "^2 = " + (i * i));
        }

    }
}