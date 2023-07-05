
/*Import que possibilita trabalhar com scanners*/
import java.util.Scanner;
/*Import para trabalhar com HashMap */
import java.util.HashMap;

public class AdicionandoElementosNaChave {
    public static void main(String[] args) {
        /* Instanciação do Scanner */
        Scanner entra = new Scanner(System.in);
        /* Variavel que ira guardar a opção escolhida pelo usuário */
        int opcao;
        /* Instanciação do HashMap com os tipo da chave e do valor. */
        HashMap<Integer, String> nomes = new HashMap<Integer, String>();
        /* For que ira pedir 10 valores ao usuário */
        for (int i = 1; i < 10; i++) {
            /* Impressão do pedido */
            System.out.println("Informe o " + i + " nome: ");
            /* Gravação dos nomes informados */
            nomes.put(i, entra.nextLine());
        }
        System.out.println("-------------------------------------");
        /* Impressão das opções do "menu" */
        System.out.println("você quer remover algum elemento");
        System.out.println("1 para remover");
        System.out.println("2 para não remover");
        System.out.println("3 para remover todos os valores");
        opcao = entra.nextInt();
        /*
         * Estrutura que ira verificar a resposta informada para a execução de um
         * determinado bloco
         */
        if (opcao == 1) {
            /*
             * Na opção 1 ele ira pedir o valor da chave que deve ser excluida com
             * o método remove
             */
            System.out.println("Informe o valor da chave que você quer excluir.");
            nomes.remove(entra.nextInt());

            System.out.println("-------------------------------------------------");
        } else if (opcao == 2) {
            /* Não irá excluir nenhum elemento */
            System.out.println("Nenhum elemento foi excluido");
            System.out.println("-------------------------------");
        } else if (opcao == 3) {
            /* Remove todos os elementos */
            nomes.clear();
        } else {
            /* Caso nenhuma das opções acima sejam escolhidas */
            System.out.println("valor inválido");
            System.out.println("-------------------------");
        }
        /* Impressãop do resultado final */
        System.out.println("Valores informados: " + nomes);
    }

}
