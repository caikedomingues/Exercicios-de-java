
import java.util.Scanner;

public class VetorMultiplicadoPor3ComFor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[20];

        for (int i = 0; i < valores.length; i++) {

            System.out.println("informe um valor: ");
            valores[i] = entrada.nextInt();
            System.out.println("Valor informado: " + valores[i]);
            System.out.println("Valor multiplicado por 3: " + valores[i] * 3);
            System.out.println("----------------------------------------------");
        }
    }

}
