
/*Escrever um programa (usando a estrutura for) para ler os 20 valores, um de cada
 * vez, para a variável X. Contar quantos destes valores são negativos, mostrando
 * os mesmos e escrevendo esta quantidade no final
 */

/*Import do scanner que irá ler os valores */
import java.util.Scanner;

public class ContagemDeNegativos {

    public static void main(String[] args) {
        /* Declaraçaõ do scanner */
        Scanner entra = new Scanner(System.in);

        int valor;// Irá receber o scanner com o valor digitado
        int contNegativos;// Irá realizar a contagem de negativos

        contNegativos = 0;// Valor inicial da contagem
        /*
         * Enquanto o i que recebe 0 for menor que 20, ele irá acrescantar
         * mais uma instrução no laço
         */
        for (int i = 0; i < 20; i++) {
            /* Impressão do pedido de valor */
            System.out.println("Informe um valor: ");
            /* Leitura e gravação do valor digitado */
            valor = entra.nextInt();
            /*
             * Estrutura que ira verificar se o valor é menor que 0, caso
             * essa condição seja verdadeira, ele irá adicionar +1 na
             * contagem.
             */
            if (valor < 0) {
                contNegativos++;
            }
        }
        /* Impressão do resultado final. */
        System.out.println("Quantidade de valores negativos: " + contNegativos);

    }

}
