
/*Crie um programa que contenha um método denomindado verificaValor.
 * O método recebe um parametro que é um valor inteiro e verifica se 
 * esse valor é par ou impar. imprimir a mensagem dentro do método.
 */

/*Importação do scanner */
import java.util.Scanner;

public class MétodoParImpar {

    public static void main(String[] args) {
        /* Declaração do scanner que lerá os valores */
        Scanner entra = new Scanner(System.in);
        /* Vraiável que irá guardar o valor passado */
        int valor;

        /* Vamos pedir um valor ao usuário */
        System.out.println("Informe um valor: ");
        /* Irá receber o scanner com o valor digtado pelo usuário */
        valor = entra.nextInt();

        /* Chmada do método */
        verificaValor(valor);

    }

    /*
     * Criação do método que irá verificar se o valor é par ou impar,
     * nos metodos temos que definir o tipo dele e colocar um parametro
     * (a variável que vai ser trabalhada) e como ela não é void. temos
     * que definir um return para ela
     */
    public static int verificaValor(int valor) {
        /*
         * Vamos verificar se o resto da divisão entre o valor
         * digitado e 2 é igual a 0, se a condição for verdadeira,
         * ele irá informar que o numero é par, se não informara
         * que o numero é impar.
         */
        if (valor % 2 == 0) {
            System.out.println("Esse valor é par");
        } else {
            System.out.println("Esse valor é impar");
        }
        /* A variável que ele deve retornar */
        return valor;

    }
}
