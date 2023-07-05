
//Vamos criar um programa que irá ler se um programa é par ou impar

/*Importação do Scanner */
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        /* Irá guardar o valor digitado */
        int valor;
        /* Declaração do Scanner */
        Scanner entra = new Scanner(System.in);
        /* Vamos pedir um valor */
        System.out.println("Informe um valor: ");
        /* Ira receber o scanner com o valor digitado */
        valor = entra.nextInt();
        /* Se o resto da divisão por 2 for igual a 0 */
        if (valor % 2 == 0) {
            /* Impressão da resposta */
            System.out.println("O valor é par");
        } else {
            /*
             * senão ele irá imprimir outro texto, informando
             * que o valor é impar
             */
            System.out.println("O valor é impar");
        }

    }

}
