
/*Programa que pede nomes para compor uma lista e no final informa
 * o valor que ficou no topo e pergunta se o usuário quer ou não
 * remover o topo da lista.
 */

/*Import que possibilita trabalharmos com filhas */
import java.util.Queue;
/*Import que possibilita a leitura do teclado */
import java.util.Scanner;
/*Import que possibilita usar o linkedlist, que serve para
 * instanciar a fila.
 */
import java.util.LinkedList;

public class AdicionandoElementosNaFila {

    public static void main(String[] args) {
        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);
        /* Declaração e instanciação da fila */
        Queue<String> nomes = new LinkedList<>();

        int opcao;

        /* For que irá pedir 10 nomes para compor a lista */
        for (int i = 0; i < 10; i++) {
            /* Impressão do pedido */
            System.out.println("Infome o " + (i + 1) + " nome da lista: ");
            /* Variável que ira ler os valores e adicionar na fila */
            nomes.add(entrada.nextLine());

        }

        /* Impressão do resultado final / fila. */
        System.out.println("Topo da lista: " + nomes.peek());
        System.out.println("-----------------------------");
        /* Impressão do pedido e da instrução. */
        System.out.println("Você quer remover o topo da lista? ");
        System.out.println("Digite 1 para remover o topo");
        System.out.println("Digite 2 para não remover");
        /* variavel que ira guardar a opção escolhida pelo usuário */
        opcao = entrada.nextInt();
        /* Estrutura que irá verificar a opção informada, e imprimir uma mensagem */

        if (opcao == 1) {
            /*
             * Se o usuário informar 1, ele executara a mensagem com o
             * método poll que irá removere o topo da lista e imprimir
             * na tela quem foi removido
             */
            System.out.println("item removido: " + nomes.poll());
        } else if (opcao == 2) {
            /*
             * se o usuário informar 2, ele imprimira a mensagem informando
             * que o topo não foi removido da lista
             */
            System.out.println("Item não removido");
        } else {
            /*
             * Caso o usuário informe um valor diferente de 1 e 2, ele dira
             * que o valor é inválido
             */
            System.out.println("Valor inválido");
        }
    }
}