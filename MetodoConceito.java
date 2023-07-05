
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

public class MetodoConceito {

    public static void main(String[] args) {

        /* Declaração do scanner que irá ler os valores */
        Scanner entra = new Scanner(System.in);
        /* Variáveis que irão conter as notas digitadas */
        int nota1, nota2, nota3, nota4;
        /* Pedido de notas com atribuição do scanner as varivaeis */
        System.out.println("Informe a primeira nota");
        nota1 = entra.nextInt();

        System.out.println("Informe a segunda nota");
        nota2 = entra.nextInt();

        System.out.println("Informe a terceira nota");
        nota3 = entra.nextInt();

        System.out.println("Informe a quarta nota");
        nota4 = entra.nextInt();

        /* Chamada do método */
        emitirConceito(nota1, nota2, nota3, nota4);

    }

    /*
     * Criação do método que irá calcular a media e verificar em qual conceito
     * o resultado se encaixa, ele será do tipo int e recebera como parametro
     * as 4 notas que deverão ser analisadas
     */
    public static int emitirConceito(int nota1, int nota2, int nota3, int nota4) {
        /*
         * Dentro do método vamos criar uma variável que será responsável por calcular
         * a média
         */
        int media;
        /* Calculo da média */
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        /* Impressão do resultado da média */
        System.out.println("A media do aluno é: " + media);

        /*
         * Estrutura condicional para conferir em qual comceito a media
         * se encaixa
         */
        if (media >= 0 && media <= 5) {
            System.out.println("Conceito: D");
        } else if (media > 5 && media <= 6) {
            System.out.println("Conceito: C");
        } else if (media > 6 && media <= 8) {
            System.out.println("Conceito: B");
        } else {
            System.out.println("Conceito: A");
        }
        /* Como esse método não é void ele deve retornar o resultado final */
        return media;
    }

}
