
/*Criar um programa usando a estrutura while para imprimir os 100 primeiros
 * multiplos de 13.
 */
public class MultiploDe13 {

    public static void main(String[] args) {

        int i = 0;
        while (i < 100) {
            i = i + 13;
            System.out.println("Multiplo de 13: " + i);
        }

    }

}
