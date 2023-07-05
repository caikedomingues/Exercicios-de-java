/*Programa que tem a finalidade de calcular o imc
do usuário*/

/*
		Tabela do IMC
		menor que 17: muito abaixo do peso
		entre 17 e 18.5: muito abaixo do peso
		entre 18.5 e 25: você está no peso ideal
		entre 25 e 30: você está com sobrepeso
		entre 30 e 35: você está com obesidade
		entre 35 e 40: você está com obesidade severa
		40 ou mais: você está com obesidade mórbida */
//massa sobre altura ao quadrado

/*Primeiro temos que importar o Scanner */
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        float peso;// Variável que irá guardar o peso digitado pelo usuário
        float altura;// Irá guardar a altura digitada pelo usuário
        float res;// Irá guardar o resultado do imc
        /* Declaração do Scanner */
        Scanner entra = new Scanner(System.in);
        /* Vamos pedir o peso do usuário */
        System.out.println("Informe o seu peso: ");
        /* A variável peso ira receber o scanner como o valor */
        peso = entra.nextFloat();
        /* Vamos pedir a altura do usuário */
        System.out.println("Informe a sua altura: ");
        /* A variável altura irá receber o Scanner como valor */
        altura = entra.nextFloat();
        /* Irá receber o cáculo do imc */
        res = peso / (altura * altura);
        /*
         * Estrutura condicional que irá verificar em que situação
         * o usuário se encontra
         */
        if (res < 17) {
            System.out.println("Muito abaixo do peso");
        }

        if (res >= 17 && res < 18.5) {
            System.out.println("Abaixo do peso");
        }

        if (res >= 18.5 && res < 25) {
            System.out.println("Você está no peso ideal");
        }

        if (res >= 25 && res < 30) {
            System.out.println("Você está com sobrepeso");
        }

        if (res >= 30 && res < 35) {
            System.out.println("Você esta com obesidade");
        }

        if (res >= 35 && res < 40) {
            System.out.println("Você está com obesidade severa");
        }

        if (res >= 40) {
            System.out.println("Você está com obesidade mórbida");
        }
        /* Impressão da resposta final */
        System.out.println("O seu imc é: " + res);
    }
}
