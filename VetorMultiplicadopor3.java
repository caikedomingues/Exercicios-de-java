
/*Crie um programa em java para ler e armazenar 15 números inteiros 
 * em um vetor com os valores do primeiro multiplicado por 3.
 */

/*é necessário importar a classe scanner para leitura de teclado */
import java.util.Scanner;

public class VetorMultiplicadopor3 {

    public static void main(String[] args) {

        /* Após a importação devemos declarar o scanner */
        Scanner entrada = new Scanner(System.in);
        /* Vamos criar 2 vetores de tamanho 15 e do tipo inteiro */

        /* O primeiro ira armazenar os valores digitados */
        int[] numeros = new int[15];
        /* O segundo ira pegar os valores e multiplicar por 3 */
        int[] mult = new int[15];

        /* Aqui vamos atribuir os valores do scanner em seus determinados indices */
        System.out.println("Informe o número: ");
        numeros[0] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[1] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[2] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[3] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[4] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[5] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[6] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[7] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[8] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[9] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[10] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[11] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[12] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[13] = entrada.nextInt();

        System.out.println("Informe o número: ");
        numeros[14] = entrada.nextInt();

        /*
         * Após a passagem de valores para o vetor numeros, devemos passar
         * os mesmos valores ao vetor 3 só que multiplicando por 3
         */
        mult[0] = numeros[0] * 3;

        mult[1] = numeros[1] * 3;

        mult[2] = numeros[2] * 3;

        mult[3] = numeros[3] * 3;

        mult[4] = numeros[4] * 3;

        mult[5] = numeros[5] * 3;

        mult[6] = numeros[6] * 3;

        mult[7] = numeros[7] * 3;

        mult[8] = numeros[8] * 3;

        mult[9] = numeros[9] * 3;

        mult[10] = numeros[10] * 3;

        mult[11] = numeros[11] * 3;

        mult[12] = numeros[12] * 3;

        mult[13] = numeros[13] * 3;

        mult[14] = numeros[14] * 3;

        /* Impressão dos valores digitados */
        System.out.println(numeros[0]);
        System.out.println("------");

        System.out.println(numeros[1]);
        System.out.println("------");

        System.out.println(numeros[2]);
        System.out.println("------");

        System.out.println(numeros[3]);
        System.out.println("------");

        System.out.println(numeros[4]);
        System.out.println("------");

        System.out.println(numeros[5]);
        System.out.println("------");

        System.out.println(numeros[6]);
        System.out.println("------");

        System.out.println(numeros[7]);
        System.out.println("------");

        System.out.println(numeros[8]);
        System.out.println("------");

        System.out.println(numeros[9]);
        System.out.println("------");

        System.out.println(numeros[10]);
        System.out.println("------");

        System.out.println(numeros[11]);
        System.out.println("------");

        System.out.println(numeros[12]);
        System.out.println("------");

        System.out.println(numeros[13]);
        System.out.println("------");

        System.out.println(numeros[14]);
        System.out.println("------");

        /* Impressão dos valores de numeros multiplicados por 3 */
        System.out.println("Valores Multiplicados ");

        System.out.println(mult[0]);
        System.out.println("------");

        System.out.println(mult[1]);
        System.out.println("------");

        System.out.println(mult[2]);
        System.out.println("------");

        System.out.println(mult[3]);
        System.out.println("------");

        System.out.println(mult[4]);
        System.out.println("------");

        System.out.println(mult[5]);
        System.out.println("------");

        System.out.println(mult[6]);
        System.out.println("------");

        System.out.println(mult[7]);
        System.out.println("------");

        System.out.println(mult[8]);
        System.out.println("------");

        System.out.println(mult[9]);
        System.out.println("------");

        System.out.println(mult[10]);
        System.out.println("------");

        System.out.println(mult[11]);
        System.out.println("------");

        System.out.println(mult[12]);
        System.out.println("------");

        System.out.println(mult[13]);
        System.out.println("------");

        System.out.println(mult[14]);

    }

}
