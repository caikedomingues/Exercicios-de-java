
/*  Escreva um programa para armazenar 50 números inteiros em um vetor. Ao final
 * mostrar apenas os numeros positivos contidos no vetor.
*/
/*Import do Scanner */
import java.util.Scanner;

public class ApenasPositivos {

    public static void main(String[] args) {
        /* Criação do array de tipo inteiro de 50 posições */
        int[] num = new int[50];
        /* Chamada do método que contém o resultado final */
        positivos(num);

    }

    public static void positivos(int[] num) {
        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);
        /* O primeiro laço irá imprimir a quantidade necessária de pedidos */
        for (int i = 0; i < num.length; i++) {
            /* impressão do pedido */
            System.out.println("Informe o " + (i + 1) + "°" + " valor: ");
            /* Leityra e gravação do valor */
            num[i] = entrada.nextInt();
        }
        /* O segundo laço ira conter um if para verificar se o valor é positivo */
        for (int i = 0; i < num.length; i++) {
            /* Verificação da condição */
            if (num[i] > 0) {
                /* Impressão do resultado final */
                System.out.println("Valores positivos: " + num[i]);
            }
        }
    }
}
