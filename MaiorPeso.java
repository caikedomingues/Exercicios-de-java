
/*Detector da pessoa mais pesada, a idéia é pedir a o usuário 5 nomes e 6 pesos
feito isso, o prgrama deve apontar a pessoa mais pesada*/

/*Importação da classe Scanner */
import java.util.Scanner;

public class MaiorPeso {
    public static void main(String[] args) {
        String n1;// Ira guardar o primeiro nome
        String n2;// Ira guardar o segundo nome
        String n3;// Ira guardar o terceiro nome
        String n4;// Irá guardar o quarto nome
        String n5;// Irá guardar o quinto nome
        String pesado;// Ira guardar o nome da pessoa mais pesada
        float mai;// Irá guardar o maior peso informado
        float p1;// irá guardar o primeiro peso
        float p2;// irá guardar o Segundo peso
        float p3;// irá guardar o Terceiro peso
        float p4;// irá guardar o Quarto peso
        float p5;// irá guardar o Quinto peso

        /* Declaração do scanner que irá ler os valores */
        Scanner entra = new Scanner(System.in);

        mai = 0;/* O maior peso tera como valor inicial o 0 */
        pesado = "Tony";/* Atribuimos o nome que quisermos apenas para iniciar a variável */

        /* Vamos pedir o primeiro nome */
        System.out.println("Informe o seu nome: ");
        /* Vamos ler o valor e guardar na variavel n1 */
        n1 = entra.nextLine();

        /* Vamos pedir o Segundo nome */
        System.out.println("Informe o seu nome: ");
        /* Vamos ler o valor e guardar na variavel n2 */
        n2 = entra.nextLine();

        /* Vamos pedir o terceiro nome */
        System.out.println("Informe o seu nome: ");
        /* Vamos ler o valor e guardar na variavel n3 */
        n3 = entra.nextLine();

        /* Vamos pedir o quarto nome */
        System.out.println("Informe o seu nome: ");
        /* Vamos ler o valor e guardar na variavel n4 */
        n4 = entra.nextLine();

        /* Vamos pedir o quinto nome */
        System.out.println("Informe o seu nome: ");
        /* Vamos ler o valor e guardar na variavel n5 */
        n5 = entra.nextLine();

        /* Vamos pedir o primeiro peso */
        System.out.println("Informe o seu peso: ");
        /* Vamos ler o valor e guardar na variável p1 */
        p1 = entra.nextFloat();

        /* Vamos pedir o segundo peso */
        System.out.println("Informe o seu peso: ");
        /* Vamos ler o valor e guardar na variável p2 */
        p2 = entra.nextFloat();

        /* Vamos pedir o terceiro peso */
        System.out.println("Informe o seu peso: ");
        /* Vamos ler o valor e guardar na variável p3 */
        p3 = entra.nextFloat();

        /* Vamos pedir o quarto peso */
        System.out.println("Informe o seu peso: ");
        /* Vamos ler o valor e guardar na variável p4 */
        p4 = entra.nextFloat();

        /* Vamos pedir o quinto peso */
        System.out.println("Informe o seu peso: ");
        /* Vamos ler o valor e guardar na variável p5 */
        p5 = entra.nextFloat();

        /*
         * essa estrutura irá verificar qual dos valores é maior que a variável mai,
         * caso, alguma variável satisfaça essa condição, a variável mai passa a ter
         * o valor do maior peso e a variável pesado, passa a ter o nome da pessoa
         * mais pesada.
         */
        if (p1 > mai) {
            pesado = n1;
            mai = p1;
        }

        if (p2 > mai) {
            pesado = n2;
            mai = p2;
        }

        if (p3 > mai) {
            mai = p3;
            pesado = n3;
        }

        if (p4 > mai) {
            pesado = n4;
            mai = p4;
        }

        if (p5 > mai) {
            mai = p5;
            pesado = n5;
        }
        /* Impressão da resposta. */
        System.out.println("A pessoa com maior peso é " + pesado + " com " + mai + " quilos");

    }
}
