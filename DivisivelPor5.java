
/*Crie um programa em linguagem Java para inserir dados em um vetor A de 30
 * posições de inteiros. Os numeros inteiros que serão armazenados no vetor
 * só podem ser divisiveis por 5 (números que divididos por 5 terão resto igual 
 * a zero). Ao final, mostrar o vetor A, e mostrar se o usuário digitou  numeros
 * não divisiveis por 5 e a respectiva quantidade.
 */

/*Importação do scanner */
import java.util.Scanner;

public class DivisivelPor5 {

    public static void main(String[] args) {
        /* Criaçaõ do array de 30 posições do tipo inteiro */
        int[] valor = new int[30];
        /* Chamada do método */
        Divisivel(valor);

    }

    /*
     * Criação do método que irá imprimir o pedido do valor e a verificação da
     * condição
     */
    public static void Divisivel(int[] valor) {
        /* Declaração do Scanner */
        Scanner entra = new Scanner(System.in);
        /* Variável que irá contar a quantidade de valores não divisiveis */
        int cont = 0;
        int i;// Variável que será parametro no for
        /*
         * Laço que ira imprimir a mensagem enquanto i for menor que o tamanho do vetor
         */
        for (i = 1; i < valor.length; i++) {
            /* Impressão do pedido */
            System.out.println("Informe o " + i + "°" + " valor: ");
            /* Leitura e gravação do valor */
            valor[i] = entra.nextInt();
            /*
             * Ira verificar se a divisão do valor por 5 tem resto diferente de 0,
             * se a condição for verdadeira ele irá adicionar o valor na contagem
             */
            if (valor[i] % 5 != 0) {
                /* Contagem dos valores que satisfazem a condição */
                cont++;
            }
        }
        /* Impressão do resultado final. */
        System.out.println("Quantidade de valores não divisiveis por 5: " + cont);

    }
}
