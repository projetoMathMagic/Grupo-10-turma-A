/*
Criado por:
João Pedro Carvalho e Silva
 */
package projeto_p.i;

import java.util.Scanner;

public class MathMagic {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int op = menu();
        controlador(op);
    }

    public static void controlador(int options) {
        switch (options) {
            case 1:
                historia();
                break;
            case 2:
                break;
            case 3:
                creditos();
                break;
            case 4:
                sair();
        }
    }

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

    public static void historia() {
        Scanner input = new Scanner(System.in);
        String name;
        String second_name = "Jarvis";
        String name_father = "Ório";
        String name_mother = "Sarah";
        String classe;
        int coletaDados;

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
        System.out.println(name_mother + ": Não!, Você é muito jovem para ir para guerra!");
        System.out.println(name + "é meu dever, tenho q defender meu povo!");
        System.out.println(name + "deixa sua mãe no abrigo, ela o puxa pelo braço pedindo par ele não ir.\n"
                + "Mas ele se solta da um beijo em seu rosto para se depedir e vai em direção a saida do abrigo e pede uma arma a um arqueiro q estava distribuindo armas, para os que estavam indo para o fronte.");
        System.out.println(name + ":Amigo, preciso de uma arma.");
        System.out.println("Soldado: Qual Você quer ? ");
        do {
            System.out.println("Escolha sua arma: \n1)Espada \n2)Arco");
            coletaDados = input.nextInt();
            if (coletaDados == 1) {
                classe = "Bárbaro";
            } else {
                classe = "Arqueiro";
            }
        } while (coletaDados < 1 || coletaDados > 2);
        System.out.println("Soldado: Que Falta de Educação a minha me chamo " + second_name + "!\n"
                + "Boa Sorte, Bravo " + classe + ", as tropas de apoio se encontram a 10km daqui, tem um grupo de soldados se preparando para ir também, é só seguir a trilha");
        System.out.println(name + ": Certo");
        System.out.println("Após quase uma hora indo com seu grupo a direção das tropas, " + name + " houve um som muito alto, se vira e vê o abrigo pegando fogo.");
        System.out.println("O grupo ficou muito abalado, mas decidiu continuar seu caminho, "+ name +" por outro lado, pensando em sua mãe, decidiu  voltar ao abrigo.");
        System.out.println("O grupo e " + name +" entraram em discussão, eles não queriam que ele voltasse sozinho, e que continuasse com o grupo.");
        System.out.println("Porém, ele voltou mesmo assim.");
        System.out.println("Chegando lá, o exército inimigo já não estava mais lá, só tinha destroços do abrigo.");
        System.out.println("Após muita procura, ele encontra o corpo de sua mãe.");
        System.out.println(name + ": Não!!!!\n"
                + "Não pode ser!\n"
                + "gritou chorando.");
        System.out.println("Eu juro que vou me vingar!!");

        // Capítulo 2
        System.out.printf("Mathema: %s, maldita insolência, como ousa atacar a minha vila e achar que sairiam impune?", name);
        System.out.printf("%s: prove, velhote! Você e esses seus cabelos brancos não significam NADA, N-A-D-A", name);
        System.out.println("Mathema: Ah é? Lógiki te aguarda");
        System.out.printf("%s: mais um nomezinho deplorável que vocês de exatas inventaram, e outra: vai fazer o quê? Me mandar pra outro planeta ou outra dimensãozinha?", name);
        System.out.println("Mathema: você não sabe mesmo a hora de parar");
        System.out.println("***********~~~~~~~~~~~~~~~~~~~~~~~~~~***********");
        System.out.println("***********~~~~~~~~| |~~~~~~~~~***********");
        System.out.println("***********~~~~~|        |~~~~~***********");
        System.out.println("***********|                  |***********");
        System.out.println("****|            lÓGIKI              |****");

        System.out.printf("%s: Ixe! E não é que o velhote tava falando sério!", name);
        System.out.println("Mathema: Ué? você não era o bonzão?");
        System.out.printf("%s: Também achava que eu era! Não sou mais, agora me tira daqui!", name);
        System.out.println("Mathema: Daqui só se saí com matem...");
        System.out.printf("%s: Lá vem!!1 Vocês não cansam de números, lógica e blablabla não?", name);
        System.out.println("Mathema: ...ática");
        System.out.println("Mathema: Só sai com matemática ou você fica ai e nunca mais volta");
        System.out.printf("%s: Você precisa aprender a ameaçar mais as pessoas! Mas enfim tiozão, como volto?", name);
        System.out.println("Mathema: Oh pessoazinha difícil!");
        System.out.println("Mathema: O primeiro passo é matemática básica: potenciação!");
        System.out.printf("%s: E o que raios é isso?", name);
        System.out.println("Mathema: \"A potenciação é uma operação matemática."
                + "Utilizamos a potenciação para indicar multiplicações consecutivas de um mesmo número");
        System.out.printf("%s: Vamos tentar então!", name);

        System.out.println("Mathema: Dois elevado a 3 é: ");
        while (true) {
            int resposta = input.nextInt();

            if (resposta == 8) {
                System.out.println("Mathema: Parabéns, você acertou!");
                break;
            } else {
                System.out.println("Mathema: Tente de novo!");
            }
        }

        System.out.println("Mathema: Logo dois elevado a 7 é: ");
        while (true) {
            int resposta = input.nextInt();

            if (resposta == 128) {
                System.out.println("Mathema: Muito bom, você acertou!");
                break;
            } else {
                System.out.println("Mathema: Tente de novo!");
            }
        }

        System.out.println("Mathema: Cinco elevado a 5 é: ");
        while (true) {
            int resposta = input.nextInt();

            if (resposta == 3125) {
                System.out.println("Mathema: Parabéns, você acertou!");
                break;
            } else {
                System.out.println("Mathema: Calma! Tente de novo!");
            }

        }

        System.out.printf("Pegou o jeito da coisa, agora é só continuar, %s. Como recompensa, aqui está um pedaço da escada para você voltar", name);
        System.out.println(""
                + "______-------");

        System.out.printf("%s: *voz sarcastica* Ah, que lindo, um degrau! Muito obrigado, viu? ~_~", name);

    }

    public static void creditos() {
        System.out.println("CRÉDITOS");
        System.out.println("JOÃO PEDRO CARVALHO E SILVA\nJOÃO PEDRO SERIGNOLI BORIN\nGABRIEL ASSIS\nCAIO ROBERTO\nIGOR LIMA CHARLES");
    }

    public static void sair() {
        System.out.println("O Jogo está sendo fechado, Obrigado e Volte Sempre!");
    }
}
