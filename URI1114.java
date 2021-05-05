import java.util.Scanner;

public class URI1114{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int leitura;

        do{
            leitura = teclado.nextInt();
            if(leitura == 2002){
                System.out.println("Acesso Permitido");
            }
            else{
                System.out.println("Senha Invalida");
            }
        }
        while(leitura != 2002);
    }
}