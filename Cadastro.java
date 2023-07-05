
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        String nome;
        String profissao;
        int nasc;
        String opcao;

        opcao = "sim";

        while (opcao != "não") {
            System.out.println("Qual o seu nome? ");
            nome = entrada.nextLine();

            System.out.println("Qual a sua profissão? ");
            profissao = entrada.nextLine();

            System.out.println("Qual o ano do seu nascimento? ");
            nasc = entrada.nextInt();

            System.out.println("Qual a sua idade: ");
            idade = entrada.nextInt();

            System.out.println("Nome: " + nome);
            System.out.println("Profissão: " + profissao);
            System.out.println("Ano de nascimento: " + nasc);
            System.out.println("Idade: " + idade);

            System.out.println("Quer cadastrar mais um usuário? ");
            opcao = entrada.nextLine();

        }

        System.out.println("Quer cadastrar mais um usuário? ");
        opcao = entrada.nextLine();

        if (opcao == "Não") {
            System.out.println("Usuários cadastrados, programa encerrado");
        }

    }
}