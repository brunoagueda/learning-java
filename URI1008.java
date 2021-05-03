import java.util.Scanner;

public class URI1008{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int number, hours;
        double valor_hora, salary;

        number = teclado.nextInt();
        hours = teclado.nextInt();
        valor_hora = teclado.nextDouble();

        salary = valor_hora * hours;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);


    }
}