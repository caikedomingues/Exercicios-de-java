
/*"O custo de um carro novo para o consumidor é a soma do custo de
fábrica com a porcentagem do distribuidor (em cima do custo de fábrica) e dos
impostos (também aplicados ao custo de fábrica)". 
    Supondo que a porcentagem do distribuidor seja de 32% e os impostos de 41%,
escrever um programa em linguagem Java para ler os custos de fábrica de um carro
e imprimir o custo ao consumidor.
*/

/*import do scanner que irá ler os valores */
import java.util.Scanner;

public class Consumidor {
    public static void main(String[] args) {
        int custFabrica;// Ira receber o scanner com valor de custo de fábrica
        int porcDistribuidor;// Irá receber o scanner com o valor da porcentagem
        int imposto;// Ira receber o scanner com valor do imposto
        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);
        /* Impressão do pedido do valor de fabrica */
        System.out.println("Informe o valor do custo de fabrica: ");
        /* Leitura e gravação do custo passado */
        custFabrica = entrada.nextInt();
        /* Impressão do pedido do valor do imposto */
        System.out.println("Informe o valor do imposto");
        /* Irá leitura e gravação do valor do imposto */
        imposto = entrada.nextInt();
        /* Calculo de porcentagem do distribuidor */
        porcDistribuidor = (custFabrica / 100) * 32;
        /* Cálculo de porcentagem do imposto */
        imposto = (imposto / 100) * 41;
        /* Soma dos valores extraidos da porcentagem do distribuidor e do imposto */
        int soma = porcDistribuidor + imposto;
        /* Impressão dos resultados */
        System.out.println("Custo do Consumidor: " + soma);

    }
}
