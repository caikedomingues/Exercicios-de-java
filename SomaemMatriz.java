
import java.util.Scanner;

public class SomaemMatriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] valor = new int[4][4];

        for (int i = 0; i < valor.length; i++) {

            for (int j = 0; j < valor.length; j++) {

                System.out.println("Informe um valor: ");
                valor[i][j] = entrada.nextInt();

                int soma = valor[i][j] + 1;

                System.out.println("Soma dos valores na matriz: " + soma);

            }

        }

    }

}
