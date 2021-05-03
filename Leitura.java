import java.util.Scanner;

public class Leitura{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        // entrada de dados
        System.out.println("Por favor, digite o valor da base:");
        base = teclado.nextDouble();
        System.out.println("Por favor, digite o valor da altura:");
        altura = teclado.nextDouble();

        // processamento
        area = base * altura;

        // saida
        System.out.println("O valor da area vale " + area);

    }

}