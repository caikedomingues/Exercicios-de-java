
/*Programa que pede valores para compor a pilha e imprimi o topo */
import java.util.Stack;

import java.util.Scanner;

public class AdicionandoElementosNaPilha {
    public static void main(String[] args) {

        Scanner entra = new Scanner(System.in);

        Stack<String> nomes = new Stack<>();

        int opcao;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + "° nome da lista: ");
            nomes.push(entra.nextLine());

        }

        System.out.println("Topo da lista: " + nomes.peek());

        System.out.println("Você quer remover o topo? ");
        System.out.println("Digite 1 para remover");
        System.out.println("Digite 2 para não remover");

        opcao = entra.nextInt();

        if (opcao == 1) {

            System.out.println("Item removido:  " + nomes.pop());
        } else if (opcao == 2) {
            System.out.println("Item não removido");
        } else {

            System.out.println("Valor inválido");
        }

    }
}
