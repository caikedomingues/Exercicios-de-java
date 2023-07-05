
/*mprima as tabuadas de 1 a 10 no seguinte formato: */

/*Primeiro precisamos importar um scanner que irá ler os valores digitados */
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        /* Precisamso declarar o scanner no código */
        Scanner entrada = new Scanner(System.in);
        /* Variável que irá guardar o valor digitado */
        int valor;
        /* Vamos perguntar ao usuário um valor */
        System.out.println("Digite um valor para ver tabuada ");
        /* Irá ler o valor e armazenar na variável */
        valor = entrada.nextInt();

        /*
         * Para finalizar, basta imprimirmos o valor digitado junto com os textos e
         * com as operações que devem ser realizadas
         */
        System.out.println(valor + " x " + "1 " + " = " + valor * 1);

        System.out.println(valor + " x " + "2 " + " = " + valor * 2);

        System.out.println(valor + " x " + "3 " + " = " + valor * 3);

        System.out.println(valor + " x " + "4 " + " = " + valor * 4);

        System.out.println(valor + " x " + "5 " + " = " + valor * 5);

        System.out.println(valor + " x " + "6 " + " = " + valor * 6);

        System.out.println(valor + " x " + "7 " + " = " + valor * 7);

        System.out.println(valor + " x " + "8 " + " = " + valor * 8);

        System.out.println(valor + " x " + "9 " + " = " + valor * 9);

        System.out.println(valor + " x " + "10 " + " = " + valor * 10);

    }
}