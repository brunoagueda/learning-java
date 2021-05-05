public class TabuadaComFor{
    public static void main(String args[]){
        int numero = 6;
        int contador;

        for(contador = 1 ; contador <= 10 ; contador = contador + 1){
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
        }
    }
}

/*
contador = contador + 1;
contador++; // exclusivo para comar 1

contador = contador + 5; => contador += 5;

*/