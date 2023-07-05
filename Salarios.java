
/*dado o array salarios, com os salários de N funcionários. Aumente em 200 todos os salários. */

/*Importação do Scanner que irá ler os valores */
import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {

        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);

        /*
         * Irá guardar a quantidade de funcionários que quero
         * registrar
         */
        int quantFuncionarios;

        /* Irapedir um valor pro usuário */
        System.out.println("Quantos funcionários você quer registrar? ");
        /* Ira guardar a quantidade de pessoas que quero registrar */
        quantFuncionarios = entrada.nextInt();
        /* Array que ira armazena a quantidade da variável quantFuncionários */
        int[] salarios = new int[quantFuncionarios];

        /*
         * for que tera como parametro a variável i e ira percorrer o array
         * enquanto i for menor que o tamanho do array salarios
         */
        for (int i = 0; i < salarios.length; i++) {

            /* Ira perguntar ao usuário o salario */
            System.out.println("Informe o salário: ");
            /*
             * Ira ler e guardar no array salarios de indice i(parametro
             * para percorrer o array)
             */
            salarios[i] = entrada.nextInt();

            /* Essa variável irá somar os valores digitados por 200 */
            int soma = salarios[i] + 200;

            /* Impressão das respostas e finalização do programa */
            System.out.println("Salário atual: " + salarios[i]);
            System.out.println("Com acréscimo de 200 reais: " + soma);
            System.out.println("------------------------------------------------");
        }

    }

}
