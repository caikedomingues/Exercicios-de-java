
/*Faça um programa que contenha um método chamado emitirConceito e que
 * recebe a média final de um aluno por parametro e retorna o seu conceito
 * conforme a tabela:
 * 
 * De 0,0 a 4,9: Conceito D
 * De 5,0 a 6,9: Conceito C
 * De 7,0 a 8,9: Conceito b
 * De 9,0 a 10,0: Conceito A
 * 
 */

/*Antes de tudo, devemos a classe scanner para lermos as notas */
import java.util.Scanner;

public class ConceitoComFor {

    public static void main(String[] args) {
        /* Declaração do scanner que irá ler os valores */
        Scanner entrada = new Scanner(System.in);
        /* Variável que irá conter as notas digitadas */
        int nota;
        nota = 0;// Inicialização da variável

        /* For que será responsável por executar o programa 4 vezes */
        for (int i = 0; i < 4; i++) {
            /* Impressão do pedido de notas */
            System.out.println("Informe a nota: ");
            /* Leitura da nota digitada */
            nota = entrada.nextInt();
        }

        /* Chamada do método */
        emitirConceito(nota);

    }

    /*
     * Criação do método que irá calcular a media e verificar em qual conceito
     * o resultado se encaixa, ele será do tipo int e recebera como parametro
     * as notas que deverão ser analisadas.
     */
    public static int emitirConceito(int nota) {

        /*
         * Dentro do método vamos criar uma variável que será responsável por calcular
         * a média
         */
        int media;
        /* Calculo da média */
        media = (nota + nota + nota + nota) / 4;

        /*
         * Estrutura condicional para conferir em qual comceito a media
         * se encaixa
         */
        if (media > 0 && media <= 5) {
            System.out.println("Conceito: D");

        } else if (media > 5 && media < 7) {
            System.out.println("Conceito: C");
        } else if (media >= 7 && media < 9) {
            System.out.println("Conceito: B");
        } else {
            System.out.println("Conceito: A");
        }
        /* Impressão dos resultados. */
        System.out.println("A media do aluno é: " + media);
        /* Como esse método não é void ele deve retornar o resultado final */
        return media;

    }
}
