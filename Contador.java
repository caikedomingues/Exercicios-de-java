
/*Vamos criar um programa que terá um contador que faça contagens
	do 0 até onde o usuário pedir*/

/*Primeiro é necessário declarar o Scanner */
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int valor;// Irá guardar o valor digitado pelo usuário
        int contador;// Ira servir como parametro para o for e tera como valor inicial o 0
        /* Declaração do Scanner */
        Scanner entrada = new Scanner(System.in);
        /* Vamos pedir ao usuário um valor */
        System.out.println("Digite o valor da contagem");
        /* Ira receber como valor o Scanner */
        valor = entrada.nextInt();
        /*
         * Para cada contador de valor inicial 0 e menor ou igual ao valor
         * passado pelo usuário, terá como incremento +1 na contagem
         */
        for (contador = 0; contador <= valor; contador = contador + 1) {
            System.out.println(contador);
        }
        /* Impressão da contagem */
        System.out.println(" Terminei a contagem");
    }

}
