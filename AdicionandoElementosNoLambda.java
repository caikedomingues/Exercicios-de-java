
/*Criaçao de um programa que recebe 5 valores e calcula: os valores me dobro, separa os pares,
 * separa os impares.
 */
/*Import que possibiita usar listas em java */
import java.util.ArrayList;
/*Import que possibilita criar scanners */
import java.util.Scanner;

public class AdicionandoElementosNoLambda {
    public static void main(String[] args) {
        /* Instanciação do scanner */
        Scanner entra = new Scanner(System.in);
        /* Criação dos arraylists que possuirão os valores */
        ArrayList<Integer> valor = new ArrayList<Integer>();// Array que armazenara os valores digitados pelo usuário
        ArrayList<Integer> dobro = new ArrayList<Integer>();// Ira armazenar o dobro dos valores
        ArrayList<Integer> par = new ArrayList<Integer>();// Ira armazenar os valores pares.
        ArrayList<Integer> impar = new ArrayList<Integer>();// Ira armazenar os valores impares.
        /* For que ira pedir 5 valores ao usuário */
        for (int i = 0; i < 5; i++) {
            /* Impressão do pedido */
            System.out.println("Informe o " + (i + 1) + "° " + "valor: ");
            /* Leiutura e armazenamento dos valores informados */
            valor.add(entra.nextInt());
        }
        /*
         * função lambda que ira possuir os metodos de cada arraylist dentro de um for
         * each que percorrera
         * a variavel valores (quem ira receber os dados).
         */
        valor.forEach((v) -> {
            dobro.add(v * 2);
            if (v % 2 == 0) {
                par.add(v);
            } else {
                impar.add(v);
            }
        });

        /* Impressão dos resultados finais */
        System.out.println("Valores informados: " + valor);
        System.out.println("Valores em dobro: " + dobro);
        System.out.println("valores pares: " + par);
        System.out.println("Valores impar: " + impar);

    }
}
