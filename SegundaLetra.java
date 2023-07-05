/*Escreva um programa que leia duas strings (dois nomes) e as imprima na
 * tela. Imprima também a segunda letra de cada String
 */

/*Importação da classe Scanner que irá ler os valores passados */
import java.util.Scanner;

public class SegundaLetra {

    public static void main(String[] args) {

        /* Declaração do scanner que irá ler os valores */
        Scanner entrada = new Scanner(System.in);

        /* Ira conter o primeiro nome */
        String nome1;
        /* Ira conter o segundo nome */
        String nome2;

        /* Impressão das instruções do usuário */
        System.out.println("Informe o primeiro nome: ");
        /* Ira ler e guardar na variável nome1 que irá receber o Scanner com o valor */
        nome1 = entrada.nextLine();
        /* Impressão das instruções do usuário */
        System.out.println("Informe o segundo nome: ");
        /* Ira ler e guardar na variável nome2 que irá receber o Scanner com o valor */
        nome2 = entrada.nextLine();
        /*
         * Impressão dos resultados com o método charAt(), que tem como finalidade
         * retornar a String do indice indicado dentro dele
         */
        System.out.println("Primeiro nome informado: " + nome1);
        System.out.println("Segunda letra do nome: " + nome1.charAt(1));
        System.out.println("----------------------------------------------");
        System.out.println("Segundo nome informado: " + nome2);
        System.out.println("Segunda letra do nome: " + nome2.charAt(1));

    }

}
