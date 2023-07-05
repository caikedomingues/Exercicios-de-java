
/*Crie um programa para ler um numero como sendo a quantidade de computadores
 * gerenciados por uma empresa. Verificar se o número (quantidade) de 
 * computadores é par ou impar.
 * Obs: para o númeroser par o resto da divisão por dois deve ser igual a 0.
 * Usar o operador %. 
 * 
 */

/*Import do scanner que irá ler os valores digitados */
import java.util.Scanner;

public class QuantComputador {
    public static void main(String[] args) {
        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);
        /* Variável que irá receber o scanner com a quantidade de computadores */
        int comp;
        /* Impressão do pedido da quantidade */
        System.out.println("Informe a quantidade de computadores: ");
        /* Leitura e gravação do dado */
        comp = entrada.nextInt();
        /* Chamada do método com o resultado final */
        parImpar(comp);
    }

    /* Criação do método que irá verificar se é par ou impar */
    public static int parImpar(int comp) {
        /* Estrutura que verificara a resposta */
        if (comp % 2 == 0) {

            System.out.println("A quantidade de computadores é par");
        } else {
            System.out.println("A quantidade de computador é impar");
        }
        /* Retorno da variável com o resultado */
        return comp;
    }
}
