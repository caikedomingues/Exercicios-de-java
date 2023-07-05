/*Nesse ano ocorrerão as eleições para prefeitos, vices e vereadores. De acordo
 * com o Tribunal Superior Eleitoral é considerada a idade da pessoa, ou seja,
 * se a mesma pode votar, ou se o seu voto é opcional, ou se a pessoa não pode
 * votar. A tabela em questão é exibida a seguir: 
 * Menor de 16 anos: não pode votar
 * Maior ou igual a 16 anos e menor que 18 anos: Voto opcional
 * de 18 a 64 anos: Voto Obrigatório
 * maior ou igual a 65 anos: Voto Opcional.
 * 
 * Considerando a necessidade de verificar a situação de uma pessoa, crie um
 * programa em Java que dada a idade de uma pessoa, determine a condição do 
 * eleitor
 */

/*import do scanner que irá ler os valores */
import java.util.Scanner;

public class Eleicoes {

    public static void main(String[] args) {
        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);
        int idade;
        /* Impressão do pedido da idade */
        System.out.println("Qual a sua idade? ");
        /* Leitura e gravação da informação passada */
        idade = entrada.nextInt();
        /* Chamada do método com o resultado finalizado */
        Condicao(idade);

    }

    /*
     * Criação do método do tipo inteiro que irá verificar a situação do candidato
     */
    public static int Condicao(int idade) {
        /*
         * Dentro do método, vamos crar uma estrutura condicional
         * para verificar e imprimir uma determinada resposta
         * de acordo com a idade informada.
         */
        if (idade < 16) {
            System.out.println(" Não pode votar");
        } else if (idade >= 16 && idade < 18) {

            System.out.println(" pode escolher se quer votar");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println(" possui voto obrigatório");
        } else {
            System.out.println(" pode escolher se quer votar");
        }
        /* Retorno da variável que conterá o resultado do método. */
        return idade;
    }

}
