
/*Criar um programa usando a estrutura while para ler 100 numeros inteiros
 * e somar apenas os valores pares. Ao final mostrar o total da soma.
 */

/*import do scanner que irá ler os valores digitados */
import java.util.Scanner;

public class SomaParesComWhile {
    public static void main(String[] args) {
        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);

        int i = 0;// irá receber o scanner com os valores digitados
        int soma = 0;// Irá realizar a soma dos pares.
        /*
         * Enquanto i for menor que 100, ele irá perguntar os valores,
         * verificar se é par e somar os resultados pares
         */
        while (i < 100) {
            /* Impressão do pedido de valores */
            System.out.println("Informe um valor: ");
            /* Leitura e gravação dos valores digitados */
            i = entrada.nextInt();
            /*
             * Se o resto da divisão do valor digitado por 2 for igual
             * a 0, ele ira adicionar na soma.
             */
            if (i % 2 == 0) {
                // Cálculo da soma
                soma = soma + i;
            }
            /* Incremento que irá perguntar até a condição ser satisfeita. */
            i++;

        }
        /* Impressão do resultado final */
        System.out.println("Soma dos valores pares: " + soma);
    }
}
