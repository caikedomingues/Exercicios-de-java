
/*Vamos criar um programa que irá calcular 
o imposto de 60% de um produto*/
//porcentagem do imposto: 60%
/*Primeiro temos que importar a classe Scanner */
import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        /* Declaração das variáveis que serão utilizadas */
        int imposto;// Vai guardar a porcentagem do imposto
        int divisao;// Vai guardar o valor que temos que dividir durante a operação
        float produto;// Irá guardar o valor digitado pelo usuário
        float resultado;// Ira calcular o imposto e guardar o resultado da operação

        imposto = 60;// Vai ter como valor o 60
        divisao = 100;// vai ter como valor o 100
        /* Declaração do Scanner */
        Scanner entrada = new Scanner(System.in);
        /* Vamos pedir o valor do produto para o usuário */
        System.out.println("Informe o preço do produto: ");
        /* O produto irá receber o scanner como valor */
        produto = entrada.nextFloat();
        /* O resultado irá receber como valor o cálculo da porcentagem */
        resultado = (produto * imposto) / divisao;
        /* Impressão do resultado */
        System.out.println("Você ira pagar" + resultado + " de imposto");

    }

}
