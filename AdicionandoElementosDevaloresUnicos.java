
/*import do Scanner */
import java.util.Scanner;
/*import do HashSet */
import java.util.HashSet;

public class AdicionandoElementosDevaloresUnicos {
    public static void main(String[] args) {
        int opcao;// Variável que ira guardar as opções que estão relacionadas a exclusão
        int verifica;// Ira guardar o valor que vamos verificar se existe

        Scanner entra = new Scanner(System.in);// Ira ler os valores que serão digitados
        Scanner excluir = new Scanner(System.in);// Ira ler o valor que queremos excluir
        Scanner entrada = new Scanner(System.in);// Ira ler o valor que queremos verificar

        /* Instanciação do HashSet de tipo string */
        HashSet<String> nomes = new HashSet<String>();

        /* For que ira pedir 10 nomes ao usuário */
        for (int i = 0; i < 10; i++) {
            /* Impressão do pedido de nomes */
            System.out.println("Informe o " + (i + 1) + "° " + "nome: ");
            /* Leitura dos nomes digitados */
            nomes.add(entra.nextLine());
            System.out.println("------------------------------------");
        }

        /* Impressão das opções */
        System.out.println("Escolha uma opção: ");
        System.out.println("1 para escolher um item para exclusão ");
        System.out.println("2 para remover todos os itens da lista ");
        System.out.println("3 para não remover nenhum item.");
        /* Leitura da opção escolhida */
        opcao = entra.nextInt();

        /*
         * Estrutura que ira verificar a opção escolhida e executara um determinado
         * bloco
         */
        if (opcao == 1) {
            /* Impressão do pedido */
            System.out.println("Selecione o nome que você vai quer excluir");
            /* Leitura e exclusão do nome informado */
            nomes.remove(excluir.nextLine());
            System.out.println("-------------------------------------------");

        } else if (opcao == 2) {
            /* Ira excluir todos os elementos */
            nomes.clear();
        } else if (opcao == 3) {
            /* Não ira excluir nehum item */
            System.out.println("Nenhum item excluido");
            System.out.println("---------------------");
        } else {
            /* Só sera executado se as condiçoes acima não forem satisfeitas */
            System.out.println("Valor inválido");
            System.out.println("---------------");
        }

        /* Impressão dos valores pedidos */
        System.out.println("Valores informados: " + nomes);
        System.out.println("------------------------------");
        /* Impressão da pergunta de verificação */
        System.out.println("Você quer verificar se um determinado item esta na lista? ");
        System.out.println("4 para verificar ");
        System.out.println("5 para encerrar o programa");
        /* Leitura do valor informado */
        verifica = entra.nextInt();

        /* Estrutura que ira verificar se o valor existe ou não */
        if (verifica == 4) {
            /* Impressão do pedido de valor */
            System.out.println("Informe o nome que você quer verificar: ");
            /* Leitura e verificação do valor informado */
            System.out.println(nomes.contains(entrada.nextLine()) ? "O item esta na lista" : "O item não está lista");

        } else if (verifica == 5) {
            /* Encerramento do programa caso o usuário não queira verificar os valores */
            System.out.println("Entendido, obrigado por utilizar o sistema");
        } else {
            /* Caso nenhuma das condições sejam satisfeitas */
            System.out.println("Valor inválido");
        }

    }

}
