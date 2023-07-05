/*Vamos criar um programa que converte a temperatura farenheit
	em celsius*/

/*Fórmula: celsius = (f - 32) / 1.8 */

/*Importação da classe Scanner */
import java.util.Scanner;

public class Farenheit {

    public static void main(String[] args) {
        /* Variáveis que irão guardar valores trabalhados */
        int farenheit, subtracao;
        double divisao, celsius;
        /* Declaração do Scanner que importamos */
        Scanner entra = new Scanner(System.in);

        subtracao = 32;// Irá ter 32 como valor de atribuição e será usado na subtração da fórmula
        divisao = 1.08;/*
                        * Ira ter o valor 1.08 como atribuição e será utilizado na divisão da fórmula
                        */
        /* Vamos pedir a temperatura ao usuário */
        System.out.println("Informe a temperatura: ");
        /* Ira receber o scanner com o valor digitado pelo usuário */
        farenheit = entra.nextInt();
        /* Ira receber a conversão/resolução como valor */
        celsius = (farenheit - subtracao) / divisao;
        /* Impressão do resultado */
        System.out.println("Temperatura em celsius: " + celsius);

    }

}
