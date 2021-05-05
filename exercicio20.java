import java.util.Scanner;

public class exercicio20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        String sexo;
        double altura, pesoIdeal;

        System.out.println("Digite o sexo da pessoa");
        sexo = teclado .nextLine();
        
        switch(sexo){
            case "M":
            case "m":
            case "masc":
            case "Masc":
            case "Masculino":
            case "masculino":
                System.out.println("Digite a altura");
                altura = teclado.nextDouble();
                pesoIdeal = 72.7 * altura - 58;
                System.out.printf("O peso ideal masculino vale: %.1f\n", pesoIdeal);
                break;
            case "F":
            case "f":
            case "fem":
            case "Fem":
            case "Feminino":
            case "feminino":
                System.out.println("Digite a altura");
                altura = teclado.nextDouble();
                pesoIdeal = 62.1 * altura - 44.7;
                System.out.printf("O peso ideal feminino vale: %.1f\n", pesoIdeal);
                break;
            default:
                System.out.println("Valor invalido");
        }
    }
}