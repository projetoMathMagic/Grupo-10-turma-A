package projeto_p.i;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MathMagic {

    Scanner input = new Scanner(System.in);

    // tempo das dialogs e falas dos personagens, para mudar o tempo apenas troque o valor.
    static int temp_dialog = 70, temp_falas = 100;

    public static void main(String[] args) {
        int op = menu();
        //chama a função para o usuário escolher a opção desejada.
        controlador(op);
    }

    //Função que chama as opções escolhidas pelo jogador.
    public static void controlador(int op) {
        switch (op) {
            case 1 ->
                instrucoes();
            case 2 ->
                historia();
            case 3 ->
                creditos();
            case 4 ->
                sair();
        }
    }

    //Menu com as opções iniciais do jogo.
    public static int menu() {
        Scanner input = new Scanner(System.in);
        int options = 0;
        do {
            System.out.println("*******MATHMAGIC*******");
            System.out.println("\n1 - Instruções\n2 - Jogar\n3 - Créditos\n4 - Sair");
            options = input.nextInt();

            if (options < 1 || options > 4) {
                System.out.println("Opção Inválida!");
                System.out.println("Digite novamente!");
            }
        } while (options < 1 || options > 4);
        return options;
    }

    public static void instrucoes() {
        System.out.println("""
                           Resolva desafios matemáticos e instaure a paz entre as duas vilas que se odeiam
                            Dê um nome a seu personagem, pegue um arco ou uma espada e vamos à luta!
                           O seu objetivo \u00e9 estabelecer a paz. Quanto mais você avança mais XP (conhecimento) você ganha""");

    }

    //Função
    public static void historia() {
        String[] names = capitulo1();
        int conhecimento = capitulo2(names);
        int conhecimento2 = capitulo3(names, conhecimento);
        int conhecimento3 = capitulo4(names, conhecimento2);
        int conhecimento4 = capitulo5(names, conhecimento3);
        capitulo6(names, conhecimento4);

    }

    //Primeiro capitulo do MathMagic RPG.
    public static String[] capitulo1() {
        Scanner input = new Scanner(System.in);
        String[] names = new String[7];
        names[1] = "Jarvis";
        names[2] = "Ório";
        names[3] = "Sarah";
        int coletaDados;
        names[5] = "Math";
        names[6] = "Esfinge";

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
                + "Mas ele se solta da um beijo em seu rosto para se despedir\n e vai em direção a saida do abrigo e pede uma arma a um arqueiro q estava distribuindo armas, para os que estavam indo para o fronte.");
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

    //Segundo capitulo do MathMagic RPG.   
    public static int capitulo2(String[] names) {
        Scanner input = new Scanner(System.in);
        int conhecimento = 0;
        System.out.println("Após longos dias passando de viagem");
        System.out.printf("Por muitas vezes tendo que se esconder das tropas inimigas, finalmente %s chegou em Mathema.", names[0]);
        System.out.printf("%s: certo, preciso dar um jeito de invadir o castelo do Math.", names[0]);
        System.out.printf("Após algumas horas estudando o castelo de longe,decidiu entrar pela área de serviços.");
        System.out.printf("%s consegui entrar pela área de serviço, após nocautear um cozinheiro e pegar a roupa dele.", names[0]);
        System.out.printf("%s subiu vários andares pelas as escadas, até que encontrou um guarda,\n o atacou pelas costa e seguiu seu caminho.", names[0]);
        System.out.printf("Ele só não esperava de encontraria %s em um dos andares,\n se escondeu em uma das salas do corredor e ficou o observando de longe.", names[5]);
        System.out.printf("Do nada Math se vira e olha para a porta, e questão de segundos %s apaga", names[0]);
        System.out.printf("%s acordou amarrado em uma sala que parecia ter um trono no meio dela.", names[0]);
        System.out.printf("%s:Finalmente acordou, pensei que nunca iria acordar", names[5]);
        System.out.printf("%s:Realmente achou que invadiria meu castelo e eu não sentiria sua presença?", names[5]);
        System.out.printf("%s:Vou dar uma dica para você meu caro, jamais subestime os poderes de um mago,\n se esconder se esconder dentro da minha sala de poções ?", names[5]);
        System.out.printf("%s:Chega a ser hilário, e ainda tenta atacar minha vila sozinho.", names[5]);
        System.out.printf("%s: %s, maldita insolência, como ousou atacar a minha vila e achar que sairiam impune?", names[5], names[0]);
        System.out.printf("%s: Onde eu ataquei a sua vila? Prove!", names[0]);
        System.out.printf("%s: prove, velhote! Você e esses seus cabelos brancos não significam NADA, N-A-D-A", names[0]);
        System.out.printf("%s: Essa maldita guerra,\n ela não estaria acontecendo se você não tivesse atacado o meu povo com a sua ignorância", names[5]);
        System.out.printf("%s: Eu taquei pedras para descontrair. Nada demais, são só pedras!", names[0]);
        System.out.printf("%s:E elas acertaram sem querer a cabeça dos meu soldados né? ", names[5]);
        System.out.printf("%s: Você não tem civilidade nenhuma!", names[5]);
        System.out.printf("%s: Eu sou mais civilizado que vocês, loucos dos números!", names[0]);
        System.out.printf("Math aprisiona %s em Mathema", names[0]);

        System.out.printf("%s: Onde estou? QUE RAIOS DE LUGAR É ESSE?!", names[0]);
        System.out.println("Math: O lugar que seu povo condena");
        System.out.printf("%s: ME TIRA DAQUI!", names[0]);
        System.out.println("Math: Daqui só se saí com matemática");
        System.out.println("Math: Só sai com matemática ou você fica ai e nunca mais volta");
        System.out.printf("%s: Você precisa aprender a ameaçar mais as pessoas! Mas enfim, como volto?", names[0]);
        System.out.println("Math: O primeiro passo é matemática básica: potenciação!");
        System.out.printf("%s: E o que raios é isso?", names[0]);
        System.out.println("Math: \"A potenciação é uma operação matemática"
                + "Utilizamos a potenciação para indicar multiplicações consecutivas de um mesmo número");
        System.out.printf("%s: Vamos tentar então!", names[0]);
        System.out.println("");
        System.out.println("Math: Dois elevado a 3 é: ");
        int n = 0;
        while (true) {
            int resposta = input.nextInt();

            if (resposta == 8) {
                //Sistema de conhecimento (pontuação)
                if (n <= 2) {
                    System.out.println("Math: Parabéns, você acertou!");
                    conhecimento += 1;
                } else {
                    System.out.println("Math: Parabéns, você acertou!");
                }
                break;
            } else {
                System.out.println("Math: Pense mais um pouco e tente de novo");
            }
            n++;
        }

        System.out.println("Math: Logo dois elevado a 7 é: ");
        int i = 0;
        while (true) {
            int resposta = input.nextInt();

            if (resposta == 128) {
                //Sistema de conhecimento (pontuação)
                if (i <= 2) {
                    System.out.println("Math: Muito bom, você acertou!");
                    conhecimento += 1;
                } else {
                    System.out.println("Math: Muito bom, você acertou!");
                }
                break;
            } else {
                System.out.println("Math: Tente de novo!");
            }
            i++;
        }

        System.out.println("Math: Cinco elevado a 5 é: ");
        int j = 0;
        while (true) {
            int resposta = input.nextInt();

            if (resposta == 3125) {
                //Sistema de conhecimento (pontuação)
                if (j <= 2) {
                    System.out.println("Math: Parabéns, você acertou!");
                    conhecimento += 3;
                } else if (j > 2 && j <= 5) {
                    System.out.println("Math: Parabéns, você acertou!");
                    conhecimento += 1;
                } else {
                    System.out.println("Math: Parabéns, você acertou!");
                }
                break;
            } else {
                System.out.println("Math: Vamos lá! Você está indo bem, tente de novo!");
            }
            j++;

        }

        System.out.printf("Pegou o jeito da coisa, agora é só continuar, %s.\n Como recompensa, aqui está um pedaço da escada para você voltar\n", names[0]);
        System.out.println(""
                + "______-------\n");

        System.out.printf("%s: *voz sarcastica* Ah, que lindo, um degrau! Muito obrigado, viu? ~_~\\n", names[0]);;

        System.out.printf("Pegou o jeito da coisa, agora é só continuar, %s. Tem mais obstáculos a frente.\n", names[0]);
        return conhecimento;
    }

    //Terceiro capitulo do MathMagic RPG.  
    public static int capitulo3(String[] names, int conhecimento) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s é transportado para uma espécie de vale",names[0]);
        System.out.printf("%s: o que é aquilo ?",names[0]);
        System.out.printf("%s encontra vários armamentos no chão.",names[0]);
        if (names[4] == "Arqueiro") {
            System.out.printf("%s: Que flechas diferentes.\n", names[0]);
            System.out.printf("%s: Pelo visto cada tipo de flecha tem uma base numérica.\n", names[0]);
            System.out.printf("%s: Nessa aula de matemática eu não faltei.\n", names[0]);
        } else {
            System.out.printf("%s: Que espadas diferentes.\n", names[0]);
            System.out.printf("%s: Pelo visto cada tipo tem uma base numérica.\n", names[0]);
            System.out.printf("%s: Nessa aula de matemática eu não faltei.\n", names[0]);
        }
        System.out.printf("%s: Sue barulho é esse?\n",names[0]);
        System.out.printf("%s Se vira e olha para as árvores ao fundo.\n",names[0]);
        System.out.printf("%s: Que droga de criatura é essa?\n", names[0]);
        System.out.printf("A criatura se aproxima correndo, e %s percebe que é um golem\nEle tenta atacar ela.", names[0]);
        System.out.printf("%s:Meus ataques não surtem efeito nessa coisa, deve ter algum truque por trás disso!", names[0]);
        if (names[4] == "Arqueiro") {
            System.out.printf("%s: Minhas flechas de base hexadecimal não estão causando dano,\n vou testar com outro tipo de flechas!", names[0]);
        } else {
            System.out.printf("%s: Meus golpes de base hexadecimal não estão surtindo efeito,\n vou testar com outro tipo de base ", names[0]);
        }
        System.out.printf("%s: Meus ataques com outras bases também não estão causando dano nesse golem,\n preciso pensar em algo rápido!", names[0]);

        System.out.printf("%s: Vou tentar algo arriscado, acho que meus ataques não estão surtindo efeito,\n pois esse golem está se adaptando a base numérica dos meus ataques no momento em que eles vão atingi-lo!", names[0]);

        System.out.printf("%s: Para superar essa habilidade, preciso usar a magia das minhas armas para alterar a base numérica dele no momento que meus ataques forem acertar!\n Assim ele não vai conseguir se adaptar e conseguirei causar dano,\n para isso terei que resolver o cálculo necessário para alterar sua base numérica.", names[0]);

        int n = 0;
        while (true) {
            System.out.printf("%s: A base numérica do golem é o número hexadecimal 2A, preciso passar essa base para um número binário: \n Alternativas: \n1- 101010\n2- 001001\n3- 111000\n4- 010101\n", names[0]);
            int resposta = input.nextInt();

            if (resposta == 1) {
                //Sistema de conhecimento (pontuação)
                if (n <= 2) {
                    System.out.printf("%s: Consegui causar dano!", names[0]);
                    conhecimento += 1;
                } else {
                    System.out.printf("%s: Consegui causar dano!", names[0]);
                }
                break;
            } else {
                System.out.printf("%s: O cálculo está errado, não consegui alterar a base numérica dele!", names[0]);
            }
            n++;
        }
        int i = 0;
        while (true) {
            System.out.printf("%s: Ele alterou a base numérica novamente,agora a base numérica dele é o número octal 47,\n dessa vez vou usar um ataque de base hexadecimal, preciso converter a base dele!\nAlternativas: \n1- 32\n2- 54\n3- 27\n4- 11\n", names[0]);
            int resposta = input.nextInt();

            if (resposta == 3) {
                //Sistema de conhecimento (pontuação)
                if (n <= 2) {
                    System.out.printf("%s: Ótimo, mais um golpe certeiro, mais um acerto e é o fim da linha para você!", names[0]);
                    conhecimento += 1;
                } else {
                    System.out.printf("%s: Ótimo, mais um golpe certeiro, mais um acerto e é o fim da linha para você!", names[0]);
                }
                break;
            } else {
                System.out.printf("%s: Droga, não consegui converter a base dele para a base decimal e ele conseguiu absorver meu ataque!", names[0]);
            }
            i++;
        }
        int j = 0;
        while (true) {
            System.out.printf("%s: Preciso acertar esse golpe final! A base numérica dele agora é o número 3F6 na base hexadecimal,\n vou usar um ataque de base decimal para finaliza-lo.\n Alternativas: \n1- 2030\n2- 1013\n3- 1050\n4- 1014\n", names[0]);
            int resposta = input.nextInt();

            if (resposta == 4) {
                //Sistema de conhecimento (pontuação)
                if (j <= 2) {
                    System.out.printf("%s: Está acabado, finalmente consegui derrota-lo!", names[0]);
                    conhecimento += 3;
                } else if (j > 2 && j <= 5) {
                    System.out.printf("%s: Está acabado, finalmente consegui derrota-lo!", names[0]);
                    conhecimento += 1;
                } else {
                    System.out.printf("%s: Está acabado, finalmente consegui derrota-lo!", names[0]);
                }
                break;
            } else {
                //Sistema de conhecimento (Ajuda)
                System.out.printf("%s: Falhei em converter a base dele para decimal, mas não desistirei!", names[0]);
                if (j == 3 && conhecimento > 3 || j == 5 && conhecimento > 3) {
                    System.out.println("Que tal uma dica?");
                    System.out.println("Quando uma questão é acertada você adquiri pontos de conhecimento.");
                    System.out.println("Se for um acerto com menos de tentativas você recebe 3 pontos, até 5 tentativas e mais que 3 você recebe um ponto. ");
                    System.out.printf("cada dica custa 3 pontos (Atualmente você possui %d pontos), e elas são escolhidas de forma aleatória.", conhecimento);
                    int r;
                    do {
                        System.out.println("Quer uma Dica? \n1) Sim\n2) Não");
                        r = input.nextInt();
                    } while (r < 1 || r > 2);
                    if (r == 1) {
                        conhecimento -= 3;
                        int aleatório = numeroAleatorio();
                        switch (aleatório) {
                            case 1:
                            	System.out.println("=================================");
                                System.out.println("A 2 e 3 estão ERRADAS");
                                System.out.println("=================================");
                                break;
                            case 2:
                                System.out.println("====================================================================");
                                System.out.println("Use essa fórmula: (3 X 16^2) + (15 x 16^1) + (6 x 16^0)");
                                System.out.println("====================================================================");
                                break;
                            case 3:
                                System.out.println("===================================================================================================================");
                                System.out.println("Os pesos são potências de 16 (1, 16, 256 ...) mulplique 6 com 1, F(15) com 16, 3 com 256 e some todos os resultados");
                                System.out.println("===================================================================================================================");
                                break;
                        }
                    }
                }
                n++;
            }
            j++;
        }
        return conhecimento;

    }

    public static int capitulo4(String[] names, int conhecimento) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Após finalmente derrotar o monstro,%s continuou a sua jornada\n", names[0]);
        System.out.printf("%s: Nossa, batalhar contra esse monstro me deixou exausto! Preciso repor minha energias.\n", names[0]);
        System.out.printf("Então %s avista um local que parece ter comida e vai em sua direção\n", names[0]);
        System.out.printf("Ao chegar lá, %s percebe que era uma armadilha e acaba preso dentro de um quarto com uma porta mágica\n", names[0]);
        System.out.printf("%s: Droga!, não acredito que caí nisso", names[0]);
        System.out.printf("Olhando ao redor do quarto,¨%s nota que há uma equação de 1°grau escrita na parede e precisa do resultado para destrancar a porta\n", names[0]);
        int n = 0;
        while (true) {
            System.out.printf("%s: Hmmm, aqui na parede está a conta 2x + 5 = 11, preciso saber o valor de x. \n Alternativas: \n1- 5\n2- 2\n3- 3\n4- 6\n", names[0]);
            int resposta = input.nextInt();

            if (resposta == 3) {
                if (n <= 2) {
                    System.out.printf("%s: Boa! consegui destrancar a porta", names[0]);
                    conhecimento += 1;
                    break;
                } else {
                    System.out.printf("%s: Boa! consegui destrancar a porta", names[0]);
                    break;
                }
            } else {
                System.out.printf("%s: Ainda tenho mais chances, preciso manter a calma", names[0]);
            }
            n++;
        }
        System.out.printf("%s: Só o que me faltava, mais uma porta ~-~\n", names[0]);
        int j = 0;
        while (true) {
            System.out.print("%s: Aqui nessa parede está a conta 2x − 5 = 11. \n Alternativas: \n1- 8\n2- 7\n3- 16\n4- 4\n");
            int resposta = input.nextInt();

            if (resposta == 1) {
                if (j <= 2) {
                    System.out.printf("%s: Ufa, espero que essa seja a última\n", names[0]);
                    conhecimento += 3;
                } else if (j > 2 && j <= 5) {
                    System.out.printf("%s: Ufa, espero que essa seja a última\n", names[0]);
                    conhecimento += 1;
                } else {
                    System.out.printf("%s: Ufa, espero que essa seja a última\n", names[0]);
                }
                break;
            } else {
                System.out.printf("%s: Isso está muito difícil !\n", names[0]);
                if (j == 3 && conhecimento > 3 || j == 5 && conhecimento > 3) {
                    System.out.println("Que tal uma dica?");
                    System.out.println("Quando uma questão é acertada você adquiri pontos de conhecimento.");
                    System.out.println("Se for um acerto com menos de tentativas você recebe 3 pontos, até 5 tentativas e mais que 3 você recebe um ponto. ");
                    System.out.printf("cada dica custa 3 pontos (Atualmente você possui %d pontos), e elas são escolhidas de forma aleatória.", conhecimento);
                    int r;
                    do {
                        System.out.println("Quer uma Dica? \n1) Sim\n2) Não");
                        r = input.nextInt();
                    } while (r < 1 || r > 2);
                    if (r == 1) {
                        conhecimento -= 3;
                        int aleatório = numeroAleatorio();
                        switch (aleatório) {
                            case 1 -> {
                            	System.out.println("=================================");
                                System.out.println("A 2 e a 3 estão ERRADAS");
                                System.out.println("=================================");
                            }
                            case 2 -> {
                                System.out.println("===============================================================================================");
                                System.out.println("Primeiro isole o 2x e passe o 5 para o outro lado mudando seu sinal, some 5 e 11 e divida por 2");
                                System.out.println("===============================================================================================");
                            }
                            case 3 -> {
                                System.out.println("============================================");
                                System.out.println("A resposta é menor que 10 e um múltiplo de 2");
                                System.out.println("============================================");
                            }
                        }
                    }
                }
                n++;
            }
            j++;
        }
        return conhecimento;
    }

    public static int capitulo5(String[] names, int conhecimento) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s: Finalmente vou poder descansar, e comer um pouco! ", names[0]);
        System.out.println("%s:Após algumas horas...");
        System.out.printf("%s sente que algo está se aproximando.\n", names[0]);
        System.out.printf("%s:Que legal...",names[0]);
        System.out.printf("%s: Mais um problema, essa criatura parece ser um mago muito poderoso,\n que tipo de ataques ele vai usar?\n", names[0]);
        System.out.printf("Mago guardião: Não pense que será fácil, você não é o primeiro a chegar aqui, e não será o último que cairá pelas minhas mãos!\n");
        System.out.printf("Mago Guardião: Veja com seus próprios olhos,\n esses são as almas dos idiotas que sucumbiram perante minhas questões matemáticas.\n");
        System.out.printf("%s: Era só o que faltava, essa coisa consegue invocar a alma de quem ele derrota?\n Não preciso ter medo, só preciso ser melhor do que os que vieram antes de mim!\n", names[0]);
        System.out.printf("%s: Para conseguir atacar o mago diretamente primeiro tenho que tirar esses fantasmas do meu caminho!\n Eles estão fazendo questões matemáticas para mim, devem estar querendo me testar.\n Vou superar as questões que eles não foram capazes de resolver e vou dar um fim naquele mago!", names[0]);

        int n = 0;
        while (true) {
            System.out.printf("Fantasma do derrotado: Resolva se você for capaz:\n Qual a solução de 3x -7 = 8? \n Alternativas: \n1- X=1/3\n2- x=-9\n3- x=3\n4- x=5\n");
            int resposta = input.nextInt();

            if (resposta == 4) {
                //Sistema de conhecimento (pontuação)
                if (n <= 2) {
                    System.out.printf("%s: Consegui, que venha o próximo!", names[0]);
                    conhecimento += 1;
                } else {
                    System.out.printf("%s: Consegui, que venha o próximo!", names[0]);
                }
                break;
            } else {
                System.out.printf("%s: Errei! Droga, não vou desistir fantasma cabeçudo!", names[0]);
            }
            n++;
        }
        int i = 0;
        while (true) {
            System.out.printf("Fantasma do derrotado: Essa não será tão fácil, responda essa equação: x^2 -3x - 10 = 0\nAlternativas: \n1- x=6 e x=-4\n2- 22\n3- x=5 e x=-2\n4- x=2 e x=-5\n");
            int resposta = input.nextInt();

            if (resposta == 3) {
                //Sistema de conhecimento (pontuação)
                if (n <= 2) {
                    System.out.printf("%s: Muito fácil, vocês realmente não eram de nada!", names[0]);
                    conhecimento += 1;
                } else {
                    System.out.printf("%s: Muito fácil, vocês realmente não eram de nada!", names[0]);
                }
                break;
            } else {
                System.out.printf("%s: Errei alguma coisa no meu cálculo, mas isso não ficará assim!", names[0]);
            }
            i++;
        }

        int j = 0;
        while (true) {
            System.out.printf("Fantasma do derrotado: Encare a pergunta que me levou à derrota! 2y^2 + 5y -3 = 0\n Alternativas: \n1- y= -1/2 e y= 3 \n2- y= 3/2 e y= 6\n3- y= -13\n4- y= 5 e y= 1/4\n");
            int resposta = input.nextInt();

            if (resposta == 1) {
                //Sistema de conhecimento (pontuação)
                if (j <= 2) {
                    System.out.printf("%s: Consegui, Esse foi o último! \n Agora é sua vez mago!\n O mago guardião que estava desprotegido sem seus fantasmas recebe um golpe certeiro na cabeça e é derrotado!\n", names[0]);
                    conhecimento += 3;
                } else if (j > 2 && j <= 5) {
                    System.out.printf("%s: Consegui, Esse foi o último! \n Agora é sua vez mago!\n O mago guardião que estava desprotegido sem seus fantasmas recebe um golpe certeiro na cabeça e é derrotado!\n", names[0]);
                    conhecimento += 1;
                } else {
                    System.out.printf("%s: Consegui, Esse foi o último! \n Agora é sua vez mago!\n O mago guardião que estava desprotegido sem seus fantasmas recebe um golpe certeiro na cabeça e é derrotado!\n", names[0]);
                }
                break;
            } else {
                //Sistema de conhecimento (Ajuda)
                System.out.printf("%s: Droga, essa realmente é uma questão difícil, mas não cheguei tão longe para nada!", names[0]);
                if (j == 3 && conhecimento > 3 || j == 5 && conhecimento > 3) {
                    System.out.println("Que tal uma dica?");
                    System.out.println("Quando uma questão é acertada você adquiri pontos de conhecimento.");
                    System.out.println("Se for um acerto com menos de tentativas você recebe 3 pontos, até 5 tentativas e mais que 3 você recebe um ponto. ");
                    System.out.printf("cada dica custa 3 pontos (Atualmente você possui %d pontos), e elas são escolhidas de forma aleatória.", conhecimento);
                    int r;
                    do {
                        System.out.println("Quer uma Dica? \n1) Sim\n2) Não");
                        r = input.nextInt();
                    } while (r < 1 || r > 2);
                    if (r == 1) {
                        conhecimento -= 3;
                        int aleatório = numeroAleatorio();
                        switch (aleatório) {
                            case 1:
                            	System.out.println("=================================");
                                System.out.println("A 2 e 4 estão ERRADAS");
                                System.out.println("=================================");
                                break;
                            case 2:
                                System.out.println("=================================");
                                System.out.println("O valor de delta é 49");
                                System.out.println("=================================");
                                break;
                            case 3:
                                System.out.println("=================================");
                                System.out.println("Faça y = (-5 +- √49)/4");
                                System.out.println("=================================");
                                break;

                        }
                    }
                }
                n++;
            }
            j++;
        }
        return conhecimento;

    }

    public static void capitulo6(String[] names, int conhecimento) {
        Scanner input = new Scanner(System.in);
        System.out.println("Após derrotar o Mago, surge uma porta.");
        System.out.println("Ao adentrar.");
        System.out.println("Sai em um lugar todo escuro...");
        System.out.println("Derrepente uma luz acende, e tudo fica claro.");
        System.out.println("E surge uma estátua gigantesca.");
        System.out.printf("%s pensou: que espécie de estátua é essa? \n", names[0]);
        System.out.println("Finalmente alguém, não aguentava mais ficar olhando para o nada... sou uma esfinge antes que me pergunte.");
        System.out.printf("%s: %s me tirou da minha terra, o egito não sei se já ouviu falar.\n", names[6], names[5]);
        System.out.printf("%s:ele se transportou para minha realidade e teve uma série de problemas com o meu faraó.\n", names[6]);
        System.out.printf("%s:por punição vim parar aqui.\n", names[6]);
        System.out.printf("%s: O que é um faraó?, aliás me chamo %s\n", names[0], names[0]);
        System.out.printf("%s: faraó é o meu rei\n", names[6]);
        System.out.printf("%s: Bem vamos logo ao ponto, antes que aquele velho venha me atormentar.\n", names[6]);
        System.out.printf("%s: Desde que ele me trancou nesse lugar, %s me obriga a fazer uma pergunta aqueles que chegarem aqui.\n", names[6], names[5]);
        System.out.printf("%s: Bem caso você acerte, está livre e pode voltar ao seu mundo\nCaso contrário irá esquecer tudo do que aconteceu\n e irá voltar para o dia em que decidiu atacar %s \n", names[6], names[5]);
        System.out.printf("%s: E vai viver tudo de novo até chegar aqui, se chegar normalmente o pessoal não consegue pasar por todos os desafios de novo.\n", names[6]);
        System.out.printf("%s: Foi assim com meu faraó.\n", names[6]);
        System.out.printf("%s: Ao menos foi o que ele me disse, quando vocês saem daqui minha mémoria é apagada, só lembro do motivo de estar aqui.\n", names[6]);
        System.out.printf("%s: Não posso reviver tudo isso de novo\n", names[0]);
        System.out.printf("%s: Sinto muito por tudo que aconteceu com você\n", names[0]);
        System.out.printf("%s: O maximo que posso fazer é te dar mais que uma oportunidade de responder\n", names[6]);
        System.out.printf("%s: Como faz muito tempo que não converso com alguém e fui com sua cara, vou te dar 5 chances.\n", names[6]);
        System.out.printf("%s: Você não pode simplesmente me passar ou me dar a resposta ?\n", names[0]);
        System.out.printf("%s: %s sempre está de olho em tudo que acontece, ficam dezenas de outros magos vigiando tudo que está acontecendo nessa dimenção.\nQuanto a resposta ele fez um feitiço e eu não consigo falar a resposta.\nApenas se está certa ou não.", names[6], names[0]);
        System.out.printf("%s:... A pergunta é a seguinte.\n", names[6]);
        int j = 0;
        while (true) {
            System.out.printf("4 elevado a X é igual 16384, qual o x da equação ?\n", names[6]);
            int resposta = input.nextInt();

            if (resposta == 7) {
                System.out.printf("%s: Resposta correta, foi um prazer te conhecer!\n", names[6]);
                break;
            } else {
                System.out.printf("%s: Resposta incorreta\n", names[6]);
                if (j == 5) {
                    System.out.printf("%s:Infeliz você retornará o seu caminho, foi um prazer te conhecer!\n", names[6]);
                    System.out.println("========================================================================");
                    historia();
                    break;
                } else {
                    if (j == 3 && conhecimento > 3) {
                        System.out.println("Que tal uma dica?");
                        System.out.println("Quando uma questão é acertada você adquiri pontos de conhecimento.");
                        System.out.println("Se for um acerto com menos de tentativas você recebe 3 pontos, até 5 tentativas e mais que 3 você recebe um ponto. ");
                        System.out.printf("cada dica custa 3 pontos (Atualmente você possui %d pontos), e elas são escolhidas de forma aleatória.", conhecimento);
                        int r;
                        do {
                            System.out.println("Quer uma Dica? \n1) Sim\n2) Não");
                            r = input.nextInt();
                        } while (r < 1 || r > 2);
                        if (r == 1) {
                            conhecimento -= 3;
                            int aleatório = numeroAleatorio();
                            switch (aleatório) {
                                case 1:
                                    System.out.println("=================================");
                                    System.out.println("A resposta é um número primo");
                                    System.out.println("=================================");
                                    break;
                                case 2:
                                    System.out.println("====================================================================");
                                    System.out.println("Você conseguirá a resposta por meio de uma equação exponencial.");
                                    System.out.println("====================================================================");
                                    break;
                                case 3:
                                    System.out.println("===================================================");
                                    System.out.println("Você pode usar logaritmo para descobrir o resultado");
                                    System.out.println("===================================================");
                                    break;
                            }
                        }
                    }
                }
                j++;
            }

        }
    }

    //Função que define os créditos do jogo.
    public static void creditos() {
        System.out.println("CRÉDITOS");
        System.out.println("JOÃO PEDRO CARVALHO E SILVA\nJOÃO PEDRO SERIGNOLLI BORIN\nGABRIEL DE ASSIS SILVA\nCAIO ROBERTO MORAES DE OLIVEIRA\nIGOR LIMA CHARLES");

    }

    //Função para definir a mensagem que será imprimida ao fechar o jogo.
    public static void sair() {
        System.out.println("O Jogo está sendo fechado, Obrigado e Volte Sempre!");
    }

    //Função para definir o tempo de falas dos personagens.
    public static void Falas(String falas, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : falas.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }

    //Função para gerar números aleatórios.
    public static int numeroAleatorio() {
        Random numAleatorio = new Random();
        int num = numAleatorio.nextInt(1, 4);
        return num;
    }
}
