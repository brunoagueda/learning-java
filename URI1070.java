import java.util.Scanner;

public class URI1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x;

        x = teclado.nextInt();

        if(x % 2 == 0){
            x++;
        }
        
        for(int i = 1 ; i <= 6 ; i++){
            System.out.println(x);
            x += 2;
        }
    }
}
