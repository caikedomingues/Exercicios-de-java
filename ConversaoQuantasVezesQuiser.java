/*Conversão de moeda quantas vezes o usuário quiser */

/*Importação do scanner que permite a leitura de valores */
import java.util.Scanner;

public class ConversaoQuantasVezesQuiser {
    public static void main(String[] args) {
        /* Variáveis que irão guardar valores */
        double vezes, contador, reais, dolar, conversao;

        dolar = 5.08;// Ira ter como valor inicial o atual preço do dolar
        contador = 1;/* Tera como valor inicial de contagem o 0 */
        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);
        /* Vamos perguntar quantos valores o usuário irá converter */
        System.out.println("Quantos valores você quer converter? ");
        /* A variável vezes irá receber o scanner com o valor informado */
        vezes = entrada.nextDouble();
        /*
         * Enquanto o valor do contador for menor que o numero digitado pelo
         * usuário ele irá perguntar e converter os valores
         */
        while (contador <= vezes) {
            /* Irá pedir um valor para o usuário */
            System.out.println("Informe o valor: ");
            /* Irá receber o valor digitado */
            reais = entrada.nextDouble();
            /* Ira realizar a conversão */
            conversao = reais / dolar;
            /*
             * Irá adicionar +1 na contagem até igualar o valor digitado
             * pelo usuário em vezes
             */
            contador++;
            /* Impressão dos resultados. */
            System.out.println("Valor em reais: " + conversao);
        }

    }
}