/*
Criado por:
João Pedro Carvalho e Silva
 */
package projeto_p.i;

import java.util.Scanner;

public class MathMagic {

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int options = 0;
        do {
            System.out.println("*******MATHMAGIC*******");
            System.out.println("1 - Jogar\n2 - Capítulos\n3 - Créditos\n4 - Sair");
            options = input.nextInt();

            if (options < 1 || options > 4) {
                System.out.println("Opção Inválida!");
                System.out.println("Digite novamente!");
            }
        } while (options < 1 || options > 4);
        return options;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int options = menu();

        switch (options) {
            case 1:
                String name;
                String second_name = "Jarvis";
                String name_father = "Ório";
                String name_mother = "Sarah";

                System.out.println("Para Iniciarmos nossa Jornada bravo guerreiro me diga seu nome.");
                System.out.println("Digite seu Nome: ");
                name = input.next();
                System.out.println("Em uma manhã em Ánthropos, " + name + " acorda assustado com seu pai (" + name_father + ") mandando ele ir para um abrigo seguro!");
                System.out.println(name_father + ": Anda levanta a vila está sendo atacada!\n"
                        + "maldito exército de Mathema, pegaram a gente de surpresa\n"
                        + "Leva sua mãe para um abrigo!\n"
                        + "Vou para o fronte de batalha com o exército, depois a gente se encontra.");
                System.out.println("Ório é o Líder da vila, Ánthropos é a vila de humanas que está em guerra com Mathema a anos, sendo sincero não sabemos o motivo até hoje.");
                System.out.println(name + ": Vamos mãe (" + name_mother + ") estamos sendo atacados, vou levar a senhora para o abrigo!");
                System.out.println(name + " Sai de casa com sua mãe , e vê dezenas de casas pegando fogo, flechas voando, saqueadores invadindo casas! ");
                System.out.println("No caminho encontram um soldado guiando o caminho,'Venham por aqui descendo as escadas encontrarão o abrigo!'");
                System.out.println("Chegando no local, " + name + " encontrou dezenas de civis feridos, alguns inclusive pareciam ter sido atingidos por Magia!");
                System.out.println(name + ": Já que deixei a senhora aqui vou para o fronte.");
                System.out.println(name_mother + "Não!, Você é muito jovem para ir para guerra!");
                System.out.println(name + "é meu dever, tenho q defender meu povo!");
                System.out.println(name + "deixa sua mãe no abrigo, ela o puxa pelo braço pedindo par ele não ir.\n"
                        + "Mas ele se solta da um beijo em seu rosto para se depedir e vai em direção a saida do abrigo e pede uma arma a um arqueiro q estava distribuindo armas, para os que estavam indo para o fronte.");
                /* System.out.println("Que Falta de Educação a minha me chamo " + second_name + "!"); */
                break;

            case 2:

                break;
            case 3:
                System.out.println("CRÉDITOS");
                System.out.println("JOÃO PEDRO CARVALHO E SILVA\nJOÃO PEDRO SERIGNOLI BORIN\nGABRIEL ASSIS\nCAIO ROBERTO\nIGOR HENRIQUE");
                break;
            case 4:
                System.out.println("O Jogo está sendo fechado, Obrigado e Volte Sempre!");
        }

    }

}
