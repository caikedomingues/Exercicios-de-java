
/*Programa que coleta e armazena numeros em um array e depois multiplica por 3 */

/*Importação scanner para leitura de valores */
import java.util.Scanner;

public class ArraycomValoresmult3 {

    public static void main(String[] args) {

        /* Declaração do Scanner */
        Scanner entrada = new Scanner(System.in);
        /* Criação do arry/vetor que ira armazenar 10 valores do tipo inteiro */
        int[] valores = new int[10];

        /*
         * Vamos criar um laço que irá percorrer o array e enquanto
         * o valor de i for menor que o tamanho do laço, devemos
         * perguntar pro usuário o valor e armazenar o dado
         * no vetor de indice i (que será o nosso parametro na hora
         * de percorrer o array).
         */
        for (int i = 0; i < valores.length; i++) {

            /* Impressão da pergunta ao usuário */
            System.out.println(" Informe um numero: ");
            /* Vetor com indice que irá armazenar os 10 valores */
            valores[i] = entrada.nextInt();
            /* Impressão da resposta com a operação que deve ser realizada */
            System.out.println(valores[i] + " Multiplicado por 3: " + valores[i] * 3);
            System.out.println("--------------------------------------------------");
        }

    }

}
