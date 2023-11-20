package projeto_p.i;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MathMagic {

    Scanner input = new Scanner(System.in);
    static int temp_dialog = 70, temp_falas = 100; // tempo das dialogs e falas dos personagens.

    public static void main(String[] args) {
        int op = menu();
        controlador(op);
    }

    public static void controlador(int op) {
        switch (op) {
            case 1 ->
                historia();
            case 2 ->
                creditos();
            case 3 ->
                sair();
        }
    }

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int options = 0;
        do {
            System.out.println("*******MATHMAGIC*******");
            System.out.println("1 - Jogar\n2 - Créditos\n3 - Sair");
            options = input.nextInt();

            if (options < 1 || options > 4) {
                System.out.println("Opção Inválida!");
                System.out.println("Digite novamente!");
            }
        } while (options < 1 || options > 4);
        return options;
    }

    public static void historia() {
        String[] names = capitulo1();
        capitulo2(names);

    }

    public static String[] capitulo1() {
        Scanner input = new Scanner(System.in);
        String[] names = new String[6];
        names[1] = "Jarvis";
        names[2] = "Ório";
        names[3] = "Sarah";
        int coletaDados;
        names[5] = "Math";

        System.out.println("Para Iniciarmos nossa Jornada bravo guerreiro me diga seu nome.");
        System.out.println("Digite seu Nome: ");
        names[0] = input.next();
        System.out.println("Em uma manhã em Ánthropos, " + names[0] + " acorda assustado com seu pai (" + names[2] + ") mandando ele ir para um abrigo seguro!");
        System.out.println(names[2] + ": Anda levanta a vila está sendo atacada!\n"
                + "maldito exército de Mathema, pegaram a gente de surpresa\n"
                + "Leva sua mãe para um abrigo!\n"
                + "Vou para o fronte de batalha com o exército, depois a gente se encontra.");
        System.out.println("Ório é o Líder da vila, Ánthropos é a vila de humanas que está em guerra com Mathema a anos, sendo sincero não sabemos o motivo até hoje.");
        System.out.println(names[0] + ": Vamos mãe (" + names[3] + ") estamos sendo atacados, vou levar a senhora para o abrigo!");
        System.out.println(names[0] + " Sai de casa com sua mãe , e vê dezenas de casas pegando fogo, flechas voando, saqueadores invadindo casas! ");
        System.out.println("No caminho encontram um soldado guiando o caminho,'Venham por aqui descendo as escadas encontrarão o abrigo!'");
        System.out.println("Chegando no local, " + names[0] + " encontrou dezenas de civis feridos, alguns inclusive pareciam ter sido atingidos por Magia!");
        System.out.println(names[0] + ": Já que deixei a senhora aqui vou para o fronte.");
        System.out.println(names[0] + ": Não!, Você é muito jovem para ir para guerra!");
        System.out.println(names[0] + "é meu dever, tenho q defender meu povo!");
        System.out.println(names[0] + "deixa sua mãe no abrigo, ela o puxa pelo braço pedindo par ele não ir.\n"
                + "Mas ele se solta da um beijo em seu rosto para se depedir e vai em direção a saida do abrigo e pede uma arma a um arqueiro q estava distribuindo armas, para os que estavam indo para o fronte.");
        System.out.println(names[0] + ":Amigo, preciso de uma arma.");
        System.out.println("Soldado: Qual Você quer ? ");
        do {
            System.out.println("Escolha sua arma: \n1)Espada \n2)Arco");
            coletaDados = input.nextInt();
            if (coletaDados == 1) {
                names[4] = "Bárbaro";
            } else {
                names[4] = "Arqueiro";
            }
        } while (coletaDados < 1 || coletaDados > 2);
        System.out.println("Soldado: Que Falta de Educação a minha me chamo " + names[1] + "!\n"
                + "Boa Sorte, Bravo " + names[4] + ", as tropas de apoio se encontram a 10km daqui, tem um grupo de soldados se preparando para ir também, é só seguir a trilha");
        System.out.println(names[4] + ": Certo");
        System.out.println("Após quase uma hora indo com seu grupo a direção das tropas, " + names[0] + " houve um som muito alto, se vira e vê o abrigo pegando fogo.");
        System.out.println("O grupo ficou muito abalado, mas decidiu continuar seu caminho, " + names[0] + " por outro lado, pensando em sua mãe, decidiu  voltar ao abrigo.");
        System.out.println("O grupo e " + names[0] + " entraram em discussão, eles não queriam que ele voltasse sozinho, e que continuasse com o grupo.");
        System.out.println("Porém, ele voltou mesmo assim.");
        System.out.println("Chegando lá, o exército inimigo já não estava mais lá, só tinha destroços do abrigo.");
        System.out.println("Após muita procura, ele encontra o corpo de sua mãe.");
        System.out.println(names[0] + ": Não!!!!\n"
                + "Não pode ser!\n"
                + "gritou chorando.");
        System.out.println("Eu juro que vou me vingar!!");
        System.out.println("***********Duas semanas depois***********");
        System.out.println(names[0] + ": acordou em sua cabana, no acampamento de batalha ");
        System.out.println(names[0] + ": estava decidido a colocar um fim nisso, mas não sabia com quem conversar.");
        System.out.println(names[0] + ": Será que aquele velhote chamado Math ainda existe?");
        System.out.println(names[0] + ": decide ir para cabana onde estão sendi decididas as táticas de guerra.");
        System.out.println(names[0] + ": pai eu vou até Mathema, vou me vingar daquele povo!");
        System.out.println(names[2] + ": Não, você não vai!");
        System.out.println(names[0] + ": eu vou de qualquer jeito");
        System.out.println("Disse " + names[0] + " saindo da cabana!");
        System.out.println("Durante a tarde ele encontrou o " + names[1] + " e pediu ajuda para saber onde ficavam as saidas do acampamento.");
        System.out.println(names[1] + ": O que você está pretendendo fazer ?");
        System.out.println(names[0] + ": Só estou fazendo uma pesquisa para saber onde melhorar a segurança do acampamento.");
        System.out.println(names[1] + ": Entendo.");
        System.out.println("Durante a Madrugada ele entrou no estábulo roubou um cavalo,e com levou sua armadura e arma.");

        return names;
    }

    public static void capitulo2(String[] names) {
        Scanner input = new Scanner(System.in);
        System.out.println("Após longos dias passando de viagem");
        System.out.printf("Por muitas vezes tendo que se esconder das tropas inimigas, finalmente %s chegou em Mathema.", names[0]);
        System.out.printf("%s: certo, preciso dar um jeito de invadir o castelo do Math.", names[0]);
        System.out.printf("Após algumas horas estudando o castelo de longe,decidiu entrar pela área de serviços.");
        System.out.printf("%s consegui entrar pela área de serviço, após nocautear um cozinheiro e pegar a roupa dele.", names[0]);
        System.out.printf("%s subiu vários andares pelas as escadas, até que encontrou um guarda, o atacou pelas costa e seguiu seu caminho.", names[0]);
        System.out.printf("Ele só não esperava de encontraria %s em um dos andares, se escondeu em uma das salas do corredor e ficou o observando de longe.", names[5]);
        System.out.printf("Do nada Math se vira e olha para a porta, e questão de segundos %s apaga", names[0]);
        System.out.printf("%s acordou amarrado em uma sala que parecia ter um trono no meio dela.", names[0]);
        System.out.printf("%s:Finalmente acordou, pensei que nunca iria acordar", names[5]);
        System.out.printf("%s:Realmente achou que invadiria meu castelo e eu não sentiria sua presença?", names[5]);
        System.out.printf("%s:Vou dar uma dica para você meu caro, jamais subestime os poderes de um mago, se esconder se esconder dentro da minha sala de poções ?", names[5]);
        System.out.printf("%s:Chega a ser hilário, e ainda tenta atacar minha vila sozinho.", names[5]);
        System.out.printf("%s: %s, maldita insolência, como ousou atacar a minha vila e achar que sairiam impune?", names[5], names[0]);
        System.out.printf("%s: Onde eu ataquei a sua vila? Prove!", names[0]);
        System.out.printf("%s: prove, velhote! Você e esses seus cabelos brancos não significam NADA, N-A-D-A", names[0]);
        System.out.printf("%s: Essa maldita guerra não estaria acontecendo se você não tivesse atacado o meu povo com a sua ignorância", names[5]);
        System.out.printf("%s: Eu taquei pedras para descontrair. Nada demais, são só pedras!", names[0]);
        System.out.printf("%s:E elas acertaram sem querer a cabeça dos meu soldados né? ", names[5]);
        System.out.printf("%s: Você não tem civilidade nenhuma!", names[5]);
        System.out.printf("%s: Eu sou mais civilizado que vocês, loucos dos números!", names[0]);
        System.out.println("***********~~~~~~~~~~~~~~~~~~~~~~~~~~***********");
        System.out.println("***********~~~~~~~~| |~~~~~~~~~***********");
        System.out.println("***********~~~~~|        |~~~~~***********");
        System.out.println("***********|                  |***********");
        System.out.println("****|            lÓGIKI              |****");

        System.out.printf("%s: Onde estou? QUE RAIOS DE LUGAR É ESSE?!", names[0]);
        System.out.println("Math: Ué? você não era o bonzão?");
        System.out.printf("%s: Também achava que eu era! Não sou mais, agora me tira daqui!", names[0]);
        System.out.println("Math: Daqui só se saí com matem...");
        System.out.printf("%s: Lá vem!!1 Vocês não cansam de números, lógica e blablabla não?", names[0]);
        System.out.println("Math: ...ática");
        System.out.println("Math: Só sai com matemática ou você fica ai e nunca mais volta");
        System.out.printf("%s: Você precisa aprender a ameaçar mais as pessoas! Mas enfim, como volto?", names[0]);
        System.out.println("Math: O primeiro passo é matemática básica: potenciação!");
        System.out.printf("%s: E o que raios é isso?", names[0]);
        System.out.println("Math: \"A potenciação é uma operação matemática"
                + "Utilizamos a potenciação para indicar multiplicações consecutivas de um mesmo número");
        System.out.printf("%s: Vamos tentar então!", names[0]);

        System.out.println("Math: Dois elevado a 3 é: ");
        while (true) {
            int resposta = input.nextInt();

            if (resposta == 8) {
                System.out.println("Math: Parabéns, você acertou!");
                break;
            } else {
                System.out.println("Math: Tente de novo!");
            }
        }

        System.out.println("Math: Logo dois elevado a 7 é: ");
        while (true) {
            int resposta = input.nextInt();

            if (resposta == 128) {
                System.out.println("Math: Muito bom, você acertou!");
                break;
            } else {
                System.out.println("Math: Tente de novo!");
            }
        }

        System.out.println("Math: Cinco elevado a 5 é: ");
        while (true) {
            int resposta = input.nextInt();

            if (resposta == 3125) {
                System.out.println("Math: Parabéns, você acertou!");
                break;
            } else {
                System.out.println("Math: Calma! Tente de novo!");
            }

        }

        System.out.printf("Pegou o jeito da coisa, agora é só continuar, %s. Como recompensa, aqui está um pedaço da escada para você voltar", names[0]);
        System.out.println(""
                + "______-------");

        System.out.printf("%s: *voz sarcastica* Ah, que lindo, um degrau! Muito obrigado, viu? ~_~", names[0]);
    }

    public static void capitulos() {

    }

    public static void creditos() {
        System.out.println("CRÉDITOS");
        System.out.println("JOÃO PEDRO CARVALHO E SILVA\nJOÃO PEDRO SERIGNOLLI BORIN\nGABRIEL DE ASSIS SILVA\nCAIO ROBERTO MORAES DE OLIVEIRA\nIGOR LIMA CHARLES");
    }

    public static void sair() {
        System.out.println("O Jogo está sendo fechado, Obrigado e Volte Sempre!");
    }

    public static void Falas(String falas, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : falas.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }
}
