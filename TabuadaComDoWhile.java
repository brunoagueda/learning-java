public class TabuadaComDoWhile{
    public static void main(String args[]){

        int numero = 6;
        int contador = 1;

        do{
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador = contador + 1;
        }
        while (contador < 10);
            
    }
}