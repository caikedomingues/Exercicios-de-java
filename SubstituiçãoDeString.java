/*Escreva um programa que leia uma string e substitua todos os
 * caracteres "a" da String lida por "*". Informe na tela quantos
 * caracteres foram substituidos.
 */

/*Importação da classe scanner que irá ler os resultados */
import java.util.Scanner;

public class SubstituiçãoDeString {

    public static void main(String[] args) {

        /* Declaração do scanner que irá ler os valores */
        Scanner entrada = new Scanner(System.in);
        /* Ira conter o valor digitado */
        String texto;
        /* Pedido de valor ao usuário */
        System.out.println("Informe uma palavra: ");
        /* Variável que irá receber o scanner com o valor digitado */
        texto = entrada.nextLine();
        /*
         * Impressão do resultado digitado com o método replace, que tem
         * como finalidade substitui um letra por outra letra ou caractere.
         */
        System.out.println("Palavra com caracter *: " + texto.replace("a", "*"));

    }

}
