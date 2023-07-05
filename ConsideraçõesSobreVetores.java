/*Crie um programa em java para ler e armazenar 20 numeros inteiros em um
 * vetor, em seguida imprimir esses numeros na ordem inversa da leitura
 * ou seja, o ultimo número deve ser o primeiro a ser exibido.
 */

/*Antes de iniciarmos devemos importar a classe Scanner */
import java.util.Scanner;

public class ConsideraçõesSobreVetores {

    public static void main(String[] args) {

        /* Após importar devemos declarar a classe scanner */
        Scanner entrada = new Scanner(System.in);

        /* Criei um array que irá guardar 20m valores */
        int[] numeros = new int[20];

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o primeiro número: ");
        /* Vou atribuir ao indice 0 o valor digitado pelo usuário */
        numeros[0] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o segundo número: ");
        /* Vou atribuir ao indice 1 o valor digitado pelo usuário */
        numeros[1] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o terceiro número: ");
        /* Vou atribuir valor ao indice 2 o valor digitado pelo usuário */
        numeros[2] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o quarto número: ");
        /* Vou atribuir ao indice 3 o valor digitado pelo usuário */
        numeros[3] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o quinto número: ");
        /* Vou atribuir ao indice 4 o valor digitado pelo usuário */
        numeros[4] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o quinto número: ");
        /* Vou atribuir ao indice 5 o valor digitado pelo usuário */
        numeros[5] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o sexto número: ");
        /* Vou atribuir ao indice 6 o valor digitado pelo usuário */
        numeros[6] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o sétimo número: ");
        /* Vou atribuir ao indice 5 o valor digitado pelo usuário */
        numeros[7] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o oitavo número: ");
        /* Vou atribuir ao indice 8 o valor digitado pelo usuário */
        numeros[8] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o nono número: ");
        /* Vou atribuir ao indice 9 o valor digitado pelo usuário */
        numeros[9] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o decimo número: ");
        /* Vou atribuir ao indice 10 o valor digitado pelo usuário */
        numeros[10] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o decimo primeiro número: ");
        /* Vou atribuir ao inidice 11 o valor digitado pelo usuário */
        numeros[11] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o decimo segundo número: ");
        /* Vou atribuir ao indice 12 o valor digitado pelo usuário */
        numeros[12] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o decimo terceiro número: ");
        /* Vou atribuir ao indice 13 o valor digitado pelo usuário */
        numeros[13] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o decimo quarto número: ");
        /* Vou atribuir ao indice 14 o valor digitado pelo usuário */
        numeros[14] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o decimo quinto número: ");
        /* Vou atribuir ao indice 15 o valor digitado pelo usuário */
        numeros[15] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o decimo sexto número: ");
        /* Vou atribuir ao indice 16 o valor digitado pelo usuário */
        numeros[16] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o decimo setimo número: ");
        /* Vou atribuir ao valor 17 o valor digitado pelo usuário */
        numeros[17] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o decimo oitavo número: ");
        /* Vou atribuir ao indice 18 o valor digitado pelo usuário */
        numeros[18] = entrada.nextInt();

        System.out.println("--------------------------");

        /* Imprimi a mensagem que irá pedir um valor ao usuário */
        System.out.println("Informe o decimo nono número: ");
        /* Vou atribuir ao indice 19 o valor digitado pelo usuário */
        numeros[19] = entrada.nextInt();

        /* Agora basta imprimir os indices em oredem decrescente. */
        System.out.println(numeros[19]);

        System.out.println("----------");

        System.out.println(numeros[18]);

        System.out.println("----------");

        System.out.println(numeros[17]);

        System.out.println("----------");

        System.out.println(numeros[16]);

        System.out.println("----------");

        System.out.println(numeros[15]);

        System.out.println("----------");

        System.out.println(numeros[14]);

        System.out.println("----------");

        System.out.println(numeros[13]);

        System.out.println("----------");

        System.out.println(numeros[12]);

        System.out.println("----------");

        System.out.println(numeros[11]);

        System.out.println("----------");

        System.out.println(numeros[10]);

        System.out.println("----------");

        System.out.println(numeros[9]);

        System.out.println("----------");

        System.out.println(numeros[8]);

        System.out.println("----------");

        System.out.println(numeros[7]);

        System.out.println("----------");

        System.out.println(numeros[6]);

        System.out.println("----------");

        System.out.println(numeros[5]);

        System.out.println("----------");

        System.out.println(numeros[4]);

        System.out.println("----------");

        System.out.println(numeros[3]);

        System.out.println("----------");

        System.out.println(numeros[2]);

        System.out.println("----------");

        System.out.println(numeros[1]);

        System.out.println("----------");

        System.out.println(numeros[0]);
    }
}
