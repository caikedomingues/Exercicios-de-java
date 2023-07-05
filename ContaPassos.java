
import java.util.Scanner;

/*Necessita de ajustes */
public class ContaPassos {
    public static void main(String[] args) {
        String permissao;
        int passos;

        Scanner entrada = new Scanner(System.in);

        permissao = "sim";

        if (permissao == "sim") {

            System.out.println("Posso andar? ");
            permissao = entrada.next();

            System.out.println("Quantos passos? ");
            passos = entrada.nextInt();

            System.out.println("Andei " + passos + " passos");
        }

        if (permissao == "não") {
            System.out.println("Não andei");
        }
    }
}