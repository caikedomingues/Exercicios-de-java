/*Programa que ira possuir um método que calcula a soma
 * dos valores que são pares e divisiveis por 3
 */

/*Importação do scanner que irá receber os valores digitados */
import java.util.Scanner;

public class VetorSomatorio {

    public static void main(String[] args) {

        /* Criação do vetor de 20 posições do tipo inteiro */
        int[] vetA = new int[20];

        /* Chamada do método */
        metodo1(vetA);

    }

    /*
     * Criação do método do tipo void(não tem retorno) e que recebe
     * o vetor como parametro
     */
    public static void metodo1(int[] vetA) {
        /* Variáel de valor inicial 0 que irá realizar a soma */
        int soma = 0;
        /* Declaração do Scanner */
        Scanner entra = new Scanner(System.in);
        /*
         * For que irá percorrer o array e irá verificar se a variável
         * i é menor que o tamanho do array, enquanto essa condição for
         * verdadeira, ele irá adicionar mais 1 na contagem.
         */
        for (int i = 0; i < vetA.length; i++) {
            /* Impressão do pedido de valor */
            System.out.println("Digite um valor: ");
            /* Ira receber o scanner com o valor informado */
            vetA[i] = entra.nextInt();
            /* Ira verificar quais valores são divisiveis por 2 e 3 */
            if (vetA[i] % 2 == 0 && vetA[i] % 3 == 0) {
                /*
                 * Ira pegar os valores que satisfazem a condição
                 * e realizara a soma.
                 */
                soma = vetA[i] + soma;
            }
        }
        /* Impressão do resultado */
        System.out.println("Soma dos valores do vetor: " + soma);
    }

}
