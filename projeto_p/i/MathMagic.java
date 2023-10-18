/*
Criado por:
João Pedro Carvalho e Silva
 */
package projeto_p.i;

import java.util.Scanner;

public class MathMagic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int options;
        int close = 0;
        do {
            System.out.println("*******MATHMAGIC*******");
            System.out.println("1 - Jogar\n2 - Capítulos\n3 - Créditos\n4 - Sair");
            options = input.nextInt();

            if (options == 1 || options == 2 || options == 3 || options == 4) {
                close = 1;
            } else {
                close = 0;
            }
        } while (close == 0);

        switch (options) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

}
