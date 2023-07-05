/*Criação de um programa que pede valores e  conta  quantos numeros estão entre 0 e 10
	e realiza a soma dos impares*/

import java.util.Scanner;

public class QuantosImpares {
    public static void main(String[] args) {
        int valor;
        int total10;
        int contador;
        int soma;

        Scanner entrada = new Scanner(System.in);
        soma = 0;
        total10 = 0;

        for (contador = 0; contador <= 6; contador++) {
            System.out.println("Informe um numero: ");
            valor = entrada.nextInt();

            if (valor <= 10) {
                total10 = total10 + 1;
            }

            if (valor % 2 == 1) {
                soma = soma + valor;
            }
        }
        System.out.println("Ao todo temos " + total10 + "Numeros entre 0 e 10 ");

        System.out.println("No total temos " + soma + " valores impares");

    }
}
