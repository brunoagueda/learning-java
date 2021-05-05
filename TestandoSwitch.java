import java.util.Scanner;

public class TestandoSwitch{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor");
        int valor = teclado.nextInt();

        switch(valor){
            case 1:
                System.out.println("Digitou o valor 1");
                break;
            case 2:
                System.out.println("Digitou o valor 2");
                break;
            case 3:
                System.out.println("Digitou o valor 3");
                break;
            default:
                System.out.println("Digitou outro valor");
        }
    }
}