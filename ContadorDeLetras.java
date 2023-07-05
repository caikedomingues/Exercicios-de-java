
/*Programa que recebe uma palavra ou uma frase e realiza a contagem
 * de caracteres
 */

/*Primeiro de tudo devemos importar um scanner para ler os valores
 * que serão passados
 */
import java.util.Scanner;

public class ContadorDeLetras {

    public static void main(String[] args) {

        /* Declaração do Scanner que irá coletar os valores digitados */
        Scanner entrada = new Scanner(System.in);
        /* String que irá guardar o valor do scanner */
        String palavra;
        /* Impressão da pergunta/instrução ao usuário */
        System.out.println("Informe uma palavra ou uma frase e receba acontagem de caracteres");
        /* Variável que irá receber a informação passada */
        palavra = entrada.nextLine();

        /* Impressão da resposta com o length que ira contar os caracteres. */
        System.out.println("Quantidade de caracteres: " + palavra.length());

    }
}
