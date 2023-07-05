
import java.util.Scanner;

/*Contador que irá imprimir apenas valores pares*/
public class ContadorPar {
    public static void main(String[] args) {
        int valor;// Irá guardar o valor digitado pelo usuário
        int contador;// Ira servir como parametro pro for e tera como valor inicial o 0
        /* Declaração do Scanner */
        Scanner entrada = new Scanner(System.in);
        /* Vamos pedir um valor ao usuário */
        System.out.println("Digite um valor: ");
        /* A variável valor ira receber o scanner */
        valor = entrada.nextInt();
        /*
         * Para cada contador que recebe 0 e é menor ou igual ao valor passado
         * pelo usuário, irá ter como incremento +2 em sua contagem
         */
        for (contador = 0; contador <= valor; contador = contador + 2) {
            /* Impressão da contagem */
            System.out.println(contador);
        }

    }
}
