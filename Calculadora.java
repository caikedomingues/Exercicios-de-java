
/*A idéia é criar um programa que peça 2 valores
    para o usuário.
    Após a coleta da informação o programa ira realizar
    as 4 operações básicas da matematica*/
/*Primeiro devemos importar o scanner para realizar a leitura dos valores */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int soma;// Ira guardar o resultado da soma
        int subtracao;// Ira guardar o resultado da subtração
        int multiplicacao;// Ira guardar o resultado da multiplicação
        int divisao;// Irá guardar o resultado da divisao
        int valor1;// Ira guardar o primeiro valor digitado pelo usuário
        int valor2;// Irá guardar o segundo valor digitado pelo usuário

        /* Declaração do scanner que lerá os valores */
        Scanner entra = new Scanner(System.in);
        /* Vamos pedir o primeiro valor */
        System.out.println("Digite o primeiro valor: ");
        /* o valor1 irá receber o scanner com o valor digitado */
        valor1 = entra.nextInt();

        /* Vamos pedir o segundo valor */
        System.out.println("Digite o segundo valor: ");
        /* o valor2 irá receber o scanner com o segundo valor digitado */
        valor2 = entra.nextInt();

        soma = valor1 + valor2;// Ira realizar a soma dos valores
        subtracao = valor1 - valor2;// Ira realizar a subtração dos valores
        multiplicacao = valor1 * valor2;// Irá realizar a multiplicação dos valores
        divisao = valor1 / valor2;// Ira realizar a divisão dos valores

        /* Impressão das respostas */
        System.out.println("A soma entre " + valor1 + " e " + valor2 + " é igual a " + soma);

        System.out.println("A subtração entre " + valor1 + " e " + valor2 + " é igual a " + subtracao);

        System.out.println("A multiplicação entre " + valor1 + " e " + valor2 + " é igual a " + multiplicacao);

        System.out.println("A divisão entre " + valor1 + " e " + valor2 + " é igual a " + divisao);
    }
}
