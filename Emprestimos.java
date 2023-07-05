//tenho que descobrir a porcentagem, depois adicionar o valor e dividir pelo número de parcelas
//A porcentagem de juros é de 20% nesse exercicio
/*Nesse exerciciodevemos calcular o valor a ser devolvido e
as parcelas que devem ser pagas*/

import java.util.Scanner;

public class Emprestimos {
    public static void main(String[] args) {
        float valor;
        int parcelas;
        float porcentagem;
        float soma;
        float divisao;

        porcentagem = 20;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do empréstimo: ");
        valor = entrada.nextFloat();

        System.out.println("Informe a quantidade de parcelas: ");
        parcelas = entrada.nextInt();

        porcentagem = (valor * 20) / 100;
        soma = valor + porcentagem;
        divisao = soma / parcelas;

        System.out.println("Você ira pagar " + soma + " reais ");
        System.out.println("Em " + parcelas + " parcelas de  " + divisao + " reais");

    }

}
