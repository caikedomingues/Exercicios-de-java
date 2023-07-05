
/*Crie um programa que lê dois numeros e envia esses numeros para um 
método chamado calcularSoma. O método calcularSoma, após receber esses
valores, deverá realizar uma soma e imprimir o resultado obtido dentro
do método
 * 
 */
/*Importação da classe scanner que irá ler os valores */
import java.util.Scanner;

public class MétodoSoma {

    public static void main(String[] args) {
        /* Declaração do scanner que ira receber os valores */
        Scanner entra = new Scanner(System.in);
        /* Variáveis que irão armazenar os valores que serão somados */
        int valor1, valor2;

        /* Vamos pedir ao usuário o primeiro valor */
        System.out.println("Digite o primeiro valor: ");
        /* A variável irá receber o scanner com o valor digitado */
        valor1 = entra.nextInt();

        /* Vamos pedir ao usuário o primeiro valor */
        System.out.println("Digite o segundo valor: ");
        /* A variável irá receber o scanner com o valor digitado */
        valor2 = entra.nextInt();
        /* Chamada do método */
        calculaSoma(valor1, valor2);

    }

    /*
     * Criação do método que irá realizar a soma, ele será do tipo inteiro
     * e terá como parametro as variáveis valor1 e valor2
     */
    public static int calculaSoma(int valor1, int valor2) {

        /*
         * Aqui dentro do método iremos criar uma variável soma
         * que terá como valor a soma de valor1 + valor2
         */
        int soma = valor1 + valor2;
        /* Impressão do resultado */
        System.out.println("O resultado da soma entre " + valor1 + " e " + valor2 + " é igual a " + soma);
        /*
         * Como esse método não é void, devemos atribuir um retorno, no caso a variável
         * soma
         * do método
         */
        return soma;

    }

}
