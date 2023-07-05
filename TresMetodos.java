
/*Escreva um programa para:
 * -ler o numero inteiro e armazenar esse número em uma variável chamada
 * opção
 * 
 * -armazenar 30 numeros inteiros positivos em um vetor chamado vet
 * 
 * O programa deve possuir 4 métodos denomaindaos f1, f2, f3,  as quais
 * deve possuir 3 funcionalidades
 * 
 * f1: devera imprimir o vetor;
 * f2: devera imprimir os números armazenados nas posições impares do vetor
 * f3: deverá imprimir o quadrado dos numeros armazenados nas posições impares
 * do vetor;
 * 
  */

/*Antes de iniciarmos, devemos importar a classe Scanner */
import java.util.Scanner;

public class TresMetodos {

    public static void main(String[] args) {
        /* Declaração do scanner que irá armazenar valores */
        Scanner entra = new Scanner(System.in);
        /* Variável que irá receber o scanner com o valor passado */
        int opcao;
        /* Criação do array do tipo e de 30 posições */
        int[] vet = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29 };
        /* Impressão das instruçoes e pedidos */
        System.out.println("Escoha uma opção: ");
        System.out.println("1: Imprimira o vetor");
        System.out.println("2: mostrara valores nas posições impares");
        System.out.println("3: quadrado dos numeros das posições impares");
        /* Irá ler o que foi digitado */
        opcao = entra.nextInt();
        /*
         * Essa estrutura irá análisar o valor passado e
         * realizara a chamada de método de acordo com
         * o valor informado
         */
        if (opcao == 1) {
            // Chamada de método
            f1(vet);
        }

        if (opcao == 2) {
            // Chamada de método
            f2(vet);
        }

        if (opcao == 3) {
            // Chamada de método
            f3(vet);
        } else {
            /*
             * Ocorrera caso o usuário digite um valor diferente dos que foi
             * informado.
             */
            System.out.println("Valor inválido");
        }

    }

    // Criação dos métodos
    /*
     * f1: Método do tipo void(não retorna nada) que tem como parametro o vetor, e
     * sua
     * função é percorrer o vetor e imprimir os valores
     */
    public static void f1(int[] vet) {

        for (int i = 0; i < vet.length; i++) {

            System.out.println("Valor do vetor: " + vet[i]);
        }
    }

    /*
     * f2: Método do tipo void(não retorna nada) que tem como parametro o vetor, sua
     * função é
     * percorrer vetor e analisar quais valores divididos por 2 tem resto diferente
     * de 0,
     * ou seja, se eles são impares. Feito isso, ele ira imprimir apenas os valores
     * que
     * satisfazem a condição.
     */
    public static void f2(int[] vet) {

        for (int i = 0; i < vet.length; i++) {

            if (vet[i] % 2 != 0) {
                System.out.println("Valor Impar do vetor: " + vet[i]);
            }
        }
    }

    /*
     * f3: Método do tipo void(não retorna nada) que tem como parametro o vetor, irá
     * percorrer
     * o vetor e verificar quais são valores impares. Feito isso irá imprimir o
     * quadrado dos
     * valores impares do vetor.
     */
    public static void f3(int[] vet) {

        for (int i = 0; i < vet.length; i++) {

            if (vet[i] % 2 != 0) {

                System.out.println("Quadrado dos impares: " + vet[i] * vet[i]);
            }
        }
    }

}
