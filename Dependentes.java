
/*Criação de um programa que irá calcular o novo salário
	de funcionarios de acordo com os dependentes*/

/*Importação do scanner para realização da leitura dos dados */
import java.util.Scanner;

public class Dependentes {
    public static void main(String[] args) {
        String nome;// Ira guardar o nome do usuário
        float salario;// Ira guardar o salario atual do usuário
        float novosalario;// Ira guardar o valor do novo salario
        int dependentes;/* ira guardar a quantidade de dependentes */
        /* Declaração do scanner que fara a leitura dos dados */
        Scanner entra = new Scanner(System.in);

        novosalario = 0;// O novosalario tem como valor inicial o 0.

        /* Vamos perguntar o nome do funcionário */
        System.out.println("Nome do funcionário: ");
        /*
         * Vamos ler o valor e guardar na variavel nome que ira ter como o valor o
         * scanner
         */
        nome = entra.nextLine();
        /* Vamos perguntar o salario atual do funcionário */
        System.out.println("Salário atual: ");
        /*
         * Vamos ler o valor e guardar na variavel salario que ira ter como o valor o
         * scanner
         */
        salario = entra.nextFloat();
        /* Vamos perguntar a quantidade de dependentes do funcionário */
        System.out.println("Dependentes: ");
        /*
         * Vamos ler o valor e guardar na variavel dependentes que ira ter como o valor
         * o scanner
         */
        dependentes = entra.nextInt();
        /*
         * Estruturas condicionais que irão definir o novo salário de acordo com a
         * quantidade de depenedentes
         */
        if (dependentes == 0) {
            novosalario = salario + (salario * 5 / 100);
        }

        if (dependentes == 1 && dependentes <= 3) {
            novosalario = salario + (salario * 5 / 100);
        }

        if (dependentes > 3 && dependentes <= 6) {
            novosalario = salario + (salario * 15 / 100);
        }

        if (dependentes > 6) {
            novosalario = salario + (salario * 18 / 100);
        }
        /* Impressão dos resultados baseado nas informações passadas */
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário atual: " + salario);
        System.out.println("Novo salário: " + novosalario);

    }

}
