
/*Crie um programa em Java que tendo como dados de entrada a altura(h) e o sexo
 * de uma pessoa (1 - masculino e 2 - feminino), calcular seu peso idela,
 * utilizando as seguintes fórmulas:
 * 
 * para masculino: (72.7 * h) - 58;
 * para feminino: (62.1 * h) - 44.7
 */

/*Import do scanner */
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);

        int opcao;// Ira receber o scanner com o a opção
        double altura;// Ira receber o scanner com a altura
        double peso;// Ira receber o calculo do peso

        altura = 0;// Inicialização da variável com 0
        peso = 0;// Inicialização da variável com 0

        /* Impressão da opção que será pedida pelo usuário */
        System.out.println("Informe o seu sexo: ");
        System.out.println("1 para masculino ");
        System.out.println("2 para feminino ");
        /* Ira guardar a opção */
        opcao = entrada.nextInt();

        /*
         * Estrutura que irá verificar a opção escolhida e executar
         * o método correspondente a escolha.
         */
        if (opcao == 1) {
            /* Chamada do método */
            masculino(peso, altura);

        }

        if (opcao == 2) {
            /* Chamada do método */
            feminino(peso, altura);
        }

    }

    /*
     * Criação do método para calculos de pesos masculinos. Ele sera
     * do tipo double e recebara como parametro o peso e a altura
     */
    public static double masculino(double peso, double altura) {
        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);
        /* Impressão do pedido de altura */
        System.out.println("Informe a sua altura: ");
        /* Leitura e gravação da altura */
        altura = entrada.nextDouble();
        /* Cálculo do peso ideal */
        peso = (72.7 * altura) - 58;
        /* Impressão do resultado */
        System.out.println("O seu peso ideal é: " + peso);
        /* Valor que o método deve retornar */
        return peso;

    }

    /*
     * Criação do método para calculos de pesos femininos. Ele sera
     * do tipo double e recebara como parametro o peso e a altura
     */
    public static double feminino(double peso, double altura) {
        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);
        /* Impressão do pedido de altura */
        System.out.println("Informe a sua altura: ");
        /* Leitura e gravação da altura */
        altura = entrada.nextDouble();
        /* Cálculo do peso ideal */
        peso = (62.1 * altura) - 44.7;
        /* Impressão do resultado */
        System.out.println("O seu peso ideal é: " + peso);
        /* Valor que o método deve retornar */
        return peso;
    }

}
