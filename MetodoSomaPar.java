
/*Faça um programa para armazenar quantos números inteiros o usuário quiser  em um vetor chamado numeros.
 * Em seguida chamar um método denominado somarPares que: recebe o vetor 
 * numeros por parametro;
 * 
 * soma os numeros pares;
 * 
 * retorna o total da soma para a função principal a fim de imprimir esse total.
 */

/*import do scanner que ira ler os valores digitados */
import java.util.Scanner;

public class MetodoSomaPar {
    public static void main(String[] args) {
        /* Declarção do scanner */
        Scanner entra = new Scanner(System.in);
        int total;// Variável que irá conter o valor informado
        /* Impressão doe pedido de tamanho */
        System.out.println("Quantos valores você quer digitar? ");
        /* Leitura e gravação do tamanho informado */
        total = entra.nextInt();
        /* Criação do array de tipo inteiro */
        int[] numeros = new int[total];
        /* Chamada do método com o resultado final */
        somarPares(numeros);
    }

    /*
     * Criaçaõ do método que irá imprimir os valores informados e somar os pares,
     * lembrando que como ele é do tipo void, ele não tem retorno.
     */
    public static void somarPares(int[] numeros) {
        /* Declaração do Scanner */
        Scanner entra = new Scanner(System.in);
        /* Variável que ira guardar a soam dos pares */
        int soma = 0;
        /* For que ira executar o pedido enquanto o tamanho não for alcançado */
        for (int i = 0; i < numeros.length; i++) {
            /* Impressão do pedido */
            System.out.println("informe o " + (i + 1) + "° " + "valor: ");
            /* Leitura e gravação do valores informados */
            numeros[i] = entra.nextInt();
            /* Estrutura que irá verificar se o valor é par */
            if (numeros[i] % 2 == 0) {
                /*
                 * Se essa condição for verdadeira, a variável soma irá adicionar
                 * os valores na soma.
                 */
                soma = soma + numeros[i];

            }

        }
        /* Impressão do resultado final */
        System.out.println("Soma dos valores pares: " + soma);
    }
}
