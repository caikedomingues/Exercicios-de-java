/*Faça um programa para armazenar 20 valores reais em um vetor chamado valores.
 * Em seguida, implemente os seguintes métodos para:
 * 
 * mostrar os valores do vetor
 * Calcular e mostrar a média dos valores do vetor.
 */

public class PositivosReais {
    public static void main(String[] args) {
        /* Criação de uma variável do tipo double de 50 posições */
        double[] valores = { 1.33, 33.4, 78.7, 89.9, 90.2, 12.3, 33.5, 67.8, 88.7, 89.9, 11.4, 12.5, 13.9, 67.9, 15.9,
                87.9, 90.8, 12.9, 36.9, 20.4, 33.5, 32.5,
                23.9, 34.7, 56.7, 98.9, 78.9, 28.0, 45.8, 67.9, 54.9, 90.2, 34.6, 56.8, 67.9, 89.9, 45.7, 90.8, 67.9,
                78.9, 89.0, 45.2, 44.7, 67.9, 90.9, 99.9, 67.9,
                45.8, 46.7, 90.8 };
        /* Chamada do método com o resultado final */
        mostrarVetor(valores);
    }

    /* Criação do método que imprimira o vetor e calculara a média */
    public static void mostrarVetor(double[] valores) {
        double soma = 0;// ira calcular a media dos valores digitados
        /* O laço ira imprimir os valores digitados */
        for (int i = 0; i < valores.length; i++) {
            /* Impressão dos valores */
            System.out.println("Valores informados: " + valores[i]);
            /* Calculo da média */
            soma = (soma + valores[i]) / 50;

        }
        /* Impressão do resultado final. */
        System.out.println("Media dos valores informados: " + soma);
    }

}
