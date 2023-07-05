/*Faça um programa para ler e armazenar 100 valores inteiros em um vetor.
 * Calcular a soma dos elementos que estão nos indices impares do vetor.
 */

/*Import do scanner que irá ler os valores digitados */
import java.util.Scanner;

public class IndicePar {

    public static void main(String[] args) {
        /* Criação do array de tipo inteiro de 100 posições */
        int[] valores = new int[100];
        /* Chamada do método que verificar os valores */
        verificaVetor(valores);
    }

    /*
     * Criação de um método do tipo void(sem retorno) que irá realizar
     * a impressão do pedido de valores ea verificação da condição.
     */
    public static void verificaVetor(int[] valores) {
        /* Declaração do Scanner */
        Scanner entra = new Scanner(System.in);
        /* Variável que ira guardar a soma dos impares */
        int soma = 0;
        /* Laço que ira imprimir e registrar os valores 100 vezes */
        for (int i = 1; i < valores.length; i++) {
            /* Impressão do pedido ao usuário */
            System.out.println("Informe o " + i + "°" + " valor : ");
            /* Leitura e gravação do valor passado */
            valores[i] = entra.nextInt();
            /*
             * Condição que irá verificar se o resto da divisão
             * dos valores do vetor é igual a 0, se essa condição
             * for verdadeira, ele irá adicionar o valor na soma
             */
            if (valores[i] % 2 != 0) {
                /* Soma dos valores impares */
                soma = soma + valores[i];

            }

        }
        /* Impressão do resultado final */
        System.out.println("Soma dos valores impares digitados: " + soma);
    }
}
