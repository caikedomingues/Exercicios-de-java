/* Crie um programa para inserir valores inteiros em uma matriz 4 x 4. Calcular
 * e imprimir a soma de todos os elementos da matriz.
*/

/*Import do scanner*/
import java.util.Scanner;

public class SomadaMatriz {
    public static void main(String[] args) {
        /* Criação da matriz 4 x 4 */
        int[][] valores = new int[4][4];
        /* Chamada do método com o resultadi final */
        Soma(valores);

    }

    public static void Soma(int[][] valores) {
        /* Declaraçao do scanner */
        Scanner entrada = new Scanner(System.in);
        /* Variável que irá realizar a soma */
        int soma = 0;
        /* Laço que imprimira as linhas */
        for (int i = 0; i < valores.length; i++) {
            /* Laço que imprimira as colunas */
            for (int j = 0; i < valores.length; i++) {
                /* Impressão do pedido de valor */
                System.out.println("Informe o " + (i + 1) + "°" + " valor: ");
                /* Leitura e gravação dos valores */
                valores[i][j] = entrada.nextInt();
                /* Soma dos valores */
                soma = soma + valores[i][j];
                /* Impressão do resultado final */
                System.out.println("Total: " + soma);

            }
        }

    }
}
