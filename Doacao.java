
/*Tabela de Doação
    Vamos desenvolver um sistema de doação
 *      Digite 1 para doar 10 reais 
		Digite 2 para doar 25 reais
		Digite 3 para doar 50 reais
		Digite 4 para doar outro valor: 
		Digite 5 para fechar o programa
 * 
 */

/*Primeiro devemos, importar o scanner que irá ler os valores */
import java.util.Scanner;

public class Doacao {

    public static void main(String[] args) {
        int valor;/* Ira guardar o valor digitado pelo usuário */
        int opcao;/* Ira guardar o valor alternativo digitado pelo usuário */
        /* Declaração do scanner que irá coletar os valores */
        Scanner entrada = new Scanner(System.in);
        /* Mensagem de boas vindas e opções do usuário */
        System.out.println("Seja bem-vindo ");
        System.out.println("Digite 1 para doar 10 reais ");
        System.out.println("Digite 2 para doar 25 reais ");
        System.out.println("Digite 3 para doar 50 reais ");
        System.out.println("Digite 4 para doar outro valor: ");
        System.out.println("Digite 5 para fechar o programa ");
        /* Vamos perguntar ao usuário qual valor ele quer doar */
        System.out.println("Qual o valor da doação: ");
        /* A variável valor irá receber o scanner com o valor digitado */
        valor = entrada.nextInt();
        /*
         * Estrutura condicional que irá exibir a mensagem de acordo com a condição
         * estabelecida pelos estrutura
         */
        if (valor == 1) {
            System.out.println("Obrigado,  você doou 10 reais: ");
        }

        if (valor == 2) {
            System.out.println("Obrigado, você doou 25 reais");
        }

        if (valor == 3) {
            System.out.println("Obrigado, você doou 50 reais");
        }

        if (valor == 4) {
            /* Ira perguntar qual outro valor fora dos padrões da tabela */
            System.out.println("Digite o valor: ");
            /* Ira receber o scanner com o valor alternativo */
            valor = entrada.nextInt();
            /* Ira imprimir a mensagem com o valor alternativo */
            System.out.println("Obrigado, você doou " + valor + " reais");
        }

        if (valor == 5) {
            System.out.println("Você não doou nenhum valor");
        }
    }

}
