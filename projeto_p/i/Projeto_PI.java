//DAWN OF DARNESS

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;
class RPG {
  static int temp_dialog =70, temp_narrativa = 150, temp_transicao = 25; //Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3 variÃ¡veis para 0;
  public static void main(String[] args) throws Exception{
    Scanner entrada = new Scanner (System.in);
    Digita("\nMestre: EstÃ¡ pronto para vivenciar o verdadeiro desespero... hÃ£, digo, aventura?",TimeUnit.MILLISECONDS, temp_dialog);
    System.out.println("\n1 - Sim | 2 - Com certeza! |3 - NÃ£o sei nÃ£o hein...");
    int escolha_menu = entrada.nextInt();
        if(escolha_menu == 1 || escolha_menu == 2){
          Digita("\nMestre: ConheÃ§a o alvorecer da escuridÃ£o!",TimeUnit.MILLISECONDS, temp_dialog);
          menu();
        }else if(escolha_menu == 3){
           Digita("\nMestre: NÃ£o se engane jovem, nÃ£o Ã© como se vocÃª tivesse muita escolha... Abrace o destino!",TimeUnit.MILLISECONDS, temp_dialog);
           menu();
        }else{
            Digita("\nMestre: Mesmo digitando uma opÃ§Ã£o invÃ¡lida, seu destino lhe aguarda! Viva muito, explore, venca seus desafios e encontre a cura...",TimeUnit.MILLISECONDS, temp_dialog);
           menu();
        }}
    static void menu() throws Exception {
    Scanner entrada = new Scanner (System.in);
    int escolha_menu;
    do{
    Digita("\n\n..:: DAWN OF DARKNESS ::.. \n\n1 - Jogar \n2 - CapÃ­tulos\n3 - CrÃ©ditos \n4 - Sair",TimeUnit.MILLISECONDS, temp_transicao);
    System.out.println("\n");
    escolha_menu = entrada.nextInt();
    if(escolha_menu == 1){
              jogo();
    }
    else if(escolha_menu == 2){
             capitulos();
    }
    else if(escolha_menu == 3){
          creditos();
    }
    else if(escolha_menu == 4){
          System.exit(0);
    }
    else{
      System.out.println("\nOpÃ§Ã£o invÃ¡lida, digite novamente: ");
    }}while(escolha_menu !=1 && escolha_menu !=2 && escolha_menu !=3 && escolha_menu !=4);
    }
     static void creditos()throws Exception {
     Scanner entrada = new Scanner (System.in);
        int escolha_menu, temp_narrativa = 150;
        Digita("\n\n</> Desenvolvedores </>\n\n-> Ygor Oliveira \n-> Fillipe Vital \n-> Gabriely Barbosa \n-> Rodrigo Shuttleton \n-> Yasmim CandelÃ¡ria",TimeUnit.MILLISECONDS, temp_narrativa);
        do{
        System.out.println("\n2 - Sair");
        escolha_menu = entrada.nextInt();
        if(escolha_menu == 2){
          menu();
        }else{
           System.out.println("\nOpÃ§Ã£o invÃ¡lida, digite novamente: ");
        }}while(escolha_menu!=2);
     }
     static void capitulos()throws Exception {
     Scanner entrada = new Scanner (System.in);
        int escolha_capitulo;
        System.out.println("\n..:: DAWN OF DARKNESS - CapÃ­tulos da HistÃ³ria ::..");
        do{
        System.out.println("\n\n1 - A Taverna dos Aventureiros\n2 - A Floresta dos Desafios\n3 - A culpa Ã© sua, nÃ£o minha!\n4 - Voltar");
        escolha_capitulo = entrada.nextInt();
        if(escolha_capitulo == 1){
          capitulo_1();
        }else if(escolha_capitulo == 2){
           capitulo_2();
        }else if(escolha_capitulo == 3){
           capitulo_3();
        }else if(escolha_capitulo == 4){
          menu();
        }else{
          System.out.println("\nOpÃ§Ã£o invÃ¡lida, digite novamente: ");
        }}while(escolha_capitulo!=1 && escolha_capitulo!=2 &&escolha_capitulo!=3 &&escolha_capitulo!=4);
     }

          static void jogo()throws Exception{
          Scanner entrada = new Scanner (System.in);
          Digita("\nMestre: Hmm... veja sÃ³ o que temos por aqui, serÃ¡ um corajoso ou um curioso? \n\nBem... vamos lÃ¡...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\nMestre: Para comeÃ§armos, por favor, diga-me o seu nome.",TimeUnit.MILLISECONDS, temp_dialog);
          System.out.println("\n");
          String nome_aventureiro = entrada.next();
          Digita("\nMestre: Seja bem-vindo(a), ao intenso mundo de Alduin, " + nome_aventureiro + "!",TimeUnit.MILLISECONDS, 50);
          Digita("\n\nMestre: A partir daqui, serei seu guia e companheiro nesta jornada, pode me chamar de mestre.",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Gostaria de saber mais sobre a histÃ³ria do mundo no qual vocÃª estÃ¡ prestes a entrar ou ir direto para o jogo?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu;
          do{
          System.out.println("\n\n1 - Conte-me mais, mestre!");
          System.out.println("2 - Podemos ir direto para o jogo?");
          System.out.println("3 - Voltar");
          escolha_menu = entrada.nextInt();
          if(escolha_menu == 1){
          Digita("\n\nMestre: Muito bem, por onde comeÃ§ar...?",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nEsta Ã© a histÃ³ria de um mundo mÃ¡gico e incrÃ­vel chamado Alduin.\nAlduin Ã© um mundo repleto de vida, esperanÃ§a e prosperidade, diversas criaturas e animais vivem em harmonia. Alduin Ã© dividido em 4 grandes naÃ§Ãµes, sÃ£o elas: \n\n1) O Norte comandado pela corte de Elizabeth Clarke. DomÃ­nio dos bruxos.\n2) O Leste comandado pelos cavaleiros do reino de Luke Yeagher.\n3) O Sul comandado pelos Elfos e criaturas miticas. Seu maior empÃ©rio fica na capital de Elfheim.\n4) E o Oeste comandado pelos DemÃ´nios e Monstros Ancestrais. \n\nUma praga se espalha pelas sombras, desolando toda a vida existente em Alduin, aquele que contrai a praga certamente morre em um mÃªs. A praga destrÃ³i as suas forÃ§as e apodrece aos poucos seus orgÃ£os, ninguÃ©m sabe quem ou o que Ã© o causador dessa doenÃ§a, mas existem rumores de que ela teve inÃ­cio mas redondezas do Oeste. TerritÃ³rio dos demÃ´nios.",TimeUnit.MILLISECONDS, temp_dialog);
                  
          Digita("\n\nMestre: "+nome_aventureiro+", hora de iniciar a aventura!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Neste mundo vocÃª assumirÃ¡ o papel de um triste cavalei... quer dizer, um bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          capitulo_1();
          capitulo_2();
          capitulo_3();

          }else if(escolha_menu == 3){
                 menu();
          }
          else if(escolha_menu == 2){
          Digita("\n\nMestre: "+nome_aventureiro+", hora de iniciar a aventura!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Neste mundo vocÃª assumirÃ¡ o papel de um triste cavalei... quer dizer, um bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          capitulo_1();
          capitulo_2();
          capitulo_3();
    
          }else{
            System.out.println("\nOpÃ§Ã£o invÃ¡lida!");
          }
          }while(escolha_menu!= 1 ||escolha_menu!= 2 || escolha_menu!= 3);
          }

        static void capitulo_1() throws Exception{

        Scanner entrada = new Scanner (System.in);
        int resp;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - CapÃ­tulo 1 - A Taverna dos Aventureiros!",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\n1 - Vamos!!!",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu nÃ£o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp!=1);
        Digita("\n\nMestre: 14 dias apÃ³s sair com seu exÃ©rcito em busca da cura para seu pai, vocÃª se encontra em uma taverna isolada da cidade e civilizaÃ§Ã£o. \n\nO lugar estÃ¡ em pedaÃ§os, claramente dÃ¡ para perceber que esta taverna jÃ¡ teve seus momentos de gloria e felicidade, mas atualmente poucas pessoas ainda frequentam este local e as poucas restantes estÃ£o doentes ou em sofrimento.\n\nO dono da taverna Ã© um velho anÃ£o, sem esperanÃ§as na vida, sua Ãºnica fonte de renda era a taverna e com a chegada da praga seus lucros caÃ­ram muito. Mas mesmo assim ele continua com seu sorriso no rosto a ajudar quem for preciso na regiÃ£o.\nO taverneiro enquanto limpava o balcÃ£o se aproxima de vocÃª e pergunta:",TimeUnit.MILLISECONDS, temp_dialog);
        int resposta_menu;
        Digita("\n\nTaverneiro (AnÃ£o): Jovem rapaz, estÃ¡ tudo bem? NÃ£o acha que jÃ¡ bebeu muito? Algo lhe ocorreu?",TimeUnit.MILLISECONDS, temp_dialog);
        do{
        System.out.println("\n1 - Sim estÃ¡ tudo bem... | 2 - NÃ£o estou afim de conversar, anÃ£o...");
        resposta_menu = entrada.nextInt();
          if(resposta_menu != 1 && resposta_menu != 2){
              Digita("\n\nTaverneiro (AnÃ£o): Desculpe meu jovem, poderia repetir..?",TimeUnit.MILLISECONDS, temp_dialog);
          }
        }while(resposta_menu!=1 && resposta_menu!=2);
        Digita("\n\nMestre: O taverneiro ao ouvir suas palavras graves e fortes, lhe dÃ¡ um sorriso e apenas continua a limpar sua taverna...",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nMestre: VocÃª nÃ£o ficou bebado devido a sua alta resistÃªncia, porÃ©m encontra-se em tremendo luto e angustia pois perdeu muitos amigos na busca pela cura de seu pai... O ato ocorreu em uma feroz batalha... alÃ©m disso seu pai estÃ¡ com a praga e provavelmente morrerÃ¡ no prÃ³ximo inverno... vocÃª nÃ£o sabe a quem recorrer, e nÃ£o sabe Ã  causa dessa doenÃ§a...",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nMestre: Pouco tempo depois surge um homem, com roupas pretas e uma capa grande com capuz. Logo atrÃ¡s dele entra uma Elfa de pele clara que vestia uma capa esverdeada que ia de seus ombros atÃ© o chÃ£o. Os dois seguem atÃ© o balcÃ£o aonde vocÃª estÃ¡ e sentam ao seu lado.",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\n** TensÃ£o no ar **",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nHomem do capuz: JÃ¡ faz muito tempo, nÃ£o Ã© jovem principe da capital de Luke Yeagher?",TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_menu3, escolha_menu4;
        do{
        System.out.println("\n\n1 - Quem Ã© vocÃª?");
        System.out.println("2 - Por favor estranho, nÃ£o estou afim de joguinhos..");
        escolha_menu3 = entrada.nextInt();
        if(escolha_menu3 == 1 || escolha_menu3 == 2){
          Digita("\n\nHomem do capuz: Hahahaha, nÃ£o se lembra mais..?",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\n** Observa **",TimeUnit.MILLISECONDS, temp_narrativa);
          do{
          System.out.println("\n\n1 - Espera ai, vocÃª Ã© Rosswald? O grande bruxo Rosswald?!!");
          escolha_menu4 = entrada.nextInt();
          if(escolha_menu4!= 1){
            Digita("\n\nMestre: O homem nÃ£o ouviu o que vocÃª falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu4!=1); 
        }else{
            Digita("\n\nMestre: O homem nÃ£o ouviu o que vocÃª falou...",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(escolha_menu3 != 1 && escolha_menu3 == 2);
        Digita("\n\n** O homem tira o capuz **",TimeUnit.MILLISECONDS, temp_narrativa);
          Digita("\n\nRosswald: Da Ãºltima vez que te vi vocÃª era uma crianÃ§a, jovem principe!",TimeUnit.MILLISECONDS, temp_dialog); 
          Digita("\n\nRosswald: Vejo que amadureceu bastante, hein. A capital inteira de Luke Yeagher estÃ¡ dizendo que vocÃª estÃ¡ procurando a cura da praga...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nRosswald: Eu e minha companheira Idril temos pistas que talvez possam ajuda-lo, pistas que nos levam para o Oeste, Terra dos DemÃ´nios...",TimeUnit.MILLISECONDS, temp_dialog);  
          Digita("\n\nIdril (Elfa): Meu nome Ã© Idril, soubemos do que aconteceu com os seus companheiros na busca pela floresta sombria... sinto muito.",TimeUnit.MILLISECONDS, temp_dialog);   
          Digita("\n\nIdril (Elfa): O fato Ã© que as criaturas da floresta elfica estÃ£o morrendo pela praga, creio que podemos fazer uma parceria para investigar essas pistas... NÃ£o aguento mais perder vida inocentes por essa doenÃ§a!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nRosswald: NÃ£o se sinta obrigado a nos ajudar meu jovem principe, apenas nÃ£o quero vÃª-lo em total desolaÃ§Ã£o. Movido pelas suas motivaÃ§Ãµes e de Idril, podemos partir agora! O que me diz?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu5, escolha_menu6;
          do{
          System.out.println("\n\n1 - E como eu poderia ajuda-los?");
          escolha_menu5 = entrada.nextInt();
          if(escolha_menu5!= 1){
            Digita("\n\nMestre: O homem nÃ£o ouviu o que vocÃª falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu5!=1);
            Digita("\n\nIdril: Nos acompanhando atÃ© o Caverna do DemÃ´nio! Ã€s pistas nos dizem que o Rei DemÃ´nio Ã© o causador dessa praga...",TimeUnit.MILLISECONDS, temp_dialog);
          do{
          System.out.println("\n\n1 - O Rei DemÃ´nio...? Maldito...");
          escolha_menu6 = entrada.nextInt();
          if(escolha_menu6!= 1){
            Digita("\n\nMestre: A Idril nÃ£o ouviu o que vocÃª falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu6!=1);
          Digita("\n\nRosswald: E ai meu jovem, pronto para partirmos?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu7, escolha_menu8;
          do{
          System.out.println("\n\n1 - Montar a parceria \n2 - NÃ£o participar dessa busca.");
          escolha_menu7 = entrada.nextInt();
          if(escolha_menu7!= 1 && escolha_menu7!= 2){
            Digita("\n\nMestre: A Idril nÃ£o ouviu o que vocÃª falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }
          else if(escolha_menu7 == 2){
            Digita("\n\nIdril: Este jovem estÃ¡ muito abalado, Rosswald. Vamos embora.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nRosswald: Bom amigÃ£o, entendo sua dor... PorÃ©m nÃ£o temos mais tempo a perder aqui. Que a sorte esteja sempre ao seu lado...",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: Os dois saem da taverna e vocÃª continua bebendo, bebendo e bebendo...",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\n** 2 meses depois **",TimeUnit.MILLISECONDS, temp_narrativa);
            Digita("\n\nMestre: O tempo passou e vocÃª nÃ£o conseguiu encontrar a cura, seu pai morreu e mundo estÃ¡ em repleto caos.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: Ã€s vezes, sÃ³ o que a gente precisa Ã© de companheiros... O que poderia ter acontecido caso tivesse feito a parceria? Tarde demais para pensar.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: Agora sÃ³ lhe resta morrer pela praga, bravo cavaleiro...",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\n** Fim de Jogo **",TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n\n\n\n");
            System.exit(0);
          }
          else if(escolha_menu7 == 1){
                Digita("\n\nIdril: Perfeito!!! Rosswald, juntos eu sei que conseguiremos.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: Ah sim, levante meu jovem principe, vamos conseguir salvar seu pai e a floresta elfica, eu garanto.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** VocÃª vira seu Ãºltimo caneco de cerveja **",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: E juntos, vocÃªs partem para o Oeste, para Caverna do Rei DemÃ´nio!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nTaverneiro (AnÃ£o): EI! Jovem cavaleiro?",TimeUnit.MILLISECONDS, temp_dialog);
                int escolha_menu9;
                do{
                   System.out.println("\n\n1 - O quÃª?");
                     escolha_menu9 = entrada.nextInt();
                      if(escolha_menu9!= 1){
                      Digita("\n\nMestre: O taverneiro nÃ£o ouviu o que vocÃª falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu6!=1);
                      Digita("\n\nTaverneiro (AnÃ£o): Boa sorte na sua busca! Sei que seus amigos irÃ£o lhe ajudar!",TimeUnit.MILLISECONDS, temp_dialog);
                      Digita("\n\nMestre: E juntos vocÃªs partem para aventura!",TimeUnit.MILLISECONDS, temp_dialog);

          }}while(escolha_menu7!= 1 && escolha_menu7!= 2);

     }
     static void capitulo_2() throws Exception{
        Scanner entrada = new Scanner (System.in);
        int resp;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - CapÃ­tulo 2 - A Floresta dos Desafios!",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\n1 - Vamos!!!",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu nÃ£o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp!=1);
         Digita("\n\n** 1 dia de viagem se passa ** ",TimeUnit.MILLISECONDS, temp_narrativa);
         Digita("\n\nMestre: Para chegar na Caverna do Rei DemÃ´nio, vocÃªs precisam passar por uma floresta de desafios. Segundo minhas pesquisas a respeito, muitas pessoas que adentram-na, dficilmente saem vivos...",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\n** TensÃ£o no ar **",TimeUnit.MILLISECONDS, temp_narrativa);
         Digita("\n\nMestre: VocÃªs chegam na floresta e ficam de guarda alta, pois a qualquer momento inimigos podem aparecer...",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Reza a lenda que lobos gigantes circulam nesta floresta... e, infelizmente, trÃªs lobos cercam vocÃªs... se quiserem evitar que mais apareÃ§am, precisarÃ£o responder uma pergunta.",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: SÃ³ para avisar, para cada resposta errada a quantidade de lobos para enfrentar aumentarÃ¡ para 6, depois para 9, 12 e assim sucessivamente. Ã€s alternativas estarÃ£o aleatoriamente bagunÃ§adas, isto posto, fique atento bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: VocÃªs aguentarÃ£o combater no mÃ¡ximo 6 lobos! Acima disso, a sorte que dirÃ¡ o destino de vocÃªs...",TimeUnit.MILLISECONDS, temp_dialog);

          String a,b,c,d,e, pergunta_embaralhada, resposta_questao01;
          int qtd_lobos = 3, qtd_goblins = 0, resp_dado, random, resp_skill, escolha_fugir;
        a = "a) Apenas 3.";
        b = "b) 25 e 3.";
        c = "c) 25 e â€“ 2.";
        d = "d) 3 e â€“ 2.";
        e = "e) Apenas â€“ 2.";
        do{
        ArrayList<String> alternativas = new ArrayList<String>();
        alternativas.add(0,a);
        alternativas.add(1,b);
        alternativas.add(2,c);
        alternativas.add(3,d);
        alternativas.add(4,e);

        Collections.shuffle(alternativas);
        Collections.shuffle(alternativas);
        Collections.shuffle(alternativas);

        pergunta_embaralhada = "\n\nMestre: Quais sÃ£o Ã s raÃ­zes reais da equaÃ§Ã£o x2 â€“ x = 6?" + "\n\n" +alternativas.get(0)+ "\n" +alternativas.get(1)+ "\n" +alternativas.get(2)+ "\n" +alternativas.get(3)+ "\n" +alternativas.get(4);
        System.out.println(pergunta_embaralhada);
        resposta_questao01 = entrada.next();
        switch (resposta_questao01) {
          case "a":
          case "A":
          case "b":
          case "B":
          case "c":
          case "C":
          case "e":
          case "E":
          qtd_lobos = qtd_lobos+3;
          Digita("\n\nMestre: Cavaleiro, vocÃª errou.",TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "d":
          case "D":
          Digita("\n\nMestre: Se preparem! "+ qtd_lobos + " lobos estÃ£o Ã  caminho!",TimeUnit.MILLISECONDS, temp_dialog);
          if(qtd_lobos > 6){
            random = 1 + (int) (Math.random() * 6); 
            Digita("\n\nMestre: VocÃªs foram avisados, tudo agora dependerÃ¡ da sorte de vocÃªs... lance o dado, igual ou acima de 4 vocÃªs vivem, caso contrÃ¡rio vocÃªs morrem.",TimeUnit.MILLISECONDS, temp_dialog);
              do{
              Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Dado de 6 lados.",TimeUnit.MILLISECONDS, temp_transicao);
              Digita("\n\nRodar os dados? ",TimeUnit.MILLISECONDS, temp_transicao);
              Digita("\n\n1 - Vamos lÃ¡!!!",TimeUnit.MILLISECONDS, temp_transicao);
               System.out.println("\n");
              resp_dado = entrada.nextInt();
              if(resp_dado != 1){
               Digita("\n\nMestre: Meu bravo cavaleiro, eu nÃ£o ouvi direito.",TimeUnit.MILLISECONDS, 25);
               }}while(resp_dado!=1); 
               
              if(random >= 4){
               Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
               Digita("\n\nDado: "+random,TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nMestre: Parece que o dia de sua morte ainda nÃ£o chegou cavaleiro... Enfrente os lobos.",TimeUnit.MILLISECONDS, temp_dialog);
              }else{
                Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nDado: "+random,TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nLobos: Aarrrrh aaarrhhh",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: Ei ei ei ei ei ei ei nÃ£o vamos conseguir enfrentar tantos...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: Rosswald! NÃ£o hÃ¡ como fugir, o que vamos faremos?",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: ROSSWALD, ROSSWAAAAAAAAAAAAAALD!!!!!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nRosswald: NÃƒÃƒÃƒÃƒÃƒÃƒÃƒÃƒÃƒOOOOOOOOO!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Rosswald morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                do{
                System.out.println("\n\n1 - Fugir...");
                escolha_fugir = entrada.nextInt();
                if(escolha_fugir!= 1){
                Digita("\n\nMestre: AÃ§Ã£o invÃ¡lida.",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_fugir!=1); 
                Digita("\n\nMestre: Hummm, entendo... quando um dificil desafio nos Ã© posto a prova, revelamos nossa verdadeira natureza.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Os lobos o devoram inteiro em alguns segundos ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\n** Fim de Jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                System.exit(0);
              }}
          break;
          default:
          Digita("\n\nMestre: Desculpe jovem cavaleiro, eu nÃ£o consegui ouvi-lo, pode repetir?",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(!resposta_questao01.equals("D") && !resposta_questao01.equals("d"));

               Digita("\n\nRosswald: VENHAM PRA CIMA, AAAAAAAAAAAAAAAHHHHHH!!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nRosswald: TROVÃƒO LUPINO!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nIdril: FÃšRIA DE ELFHEIM!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nMestre: Chegou a hora de usar suas habilidades!",TimeUnit.MILLISECONDS, temp_dialog);
               do{
               System.out.println("\n\n1 - CORTE ESPECTRAL DE LUKE YEAGHER \n2 - PRINCIPE FANTASMA");
                resp_skill = entrada.nextInt();
                if(resp_skill != 1 && resp_skill != 2){
                   Digita("\n\nMestre: Eu nÃ£o ouvi direito, cavaleiro.",TimeUnit.MILLISECONDS, temp_dialog);
                }}while(resp_skill != 1 && resp_skill!= 2);
                 Digita("\n\nMestre: VocÃªs mataram os lobos, porÃ©m ao chegarem na entrada da Caverna do Rei DemÃ´nio, se deparam com 5 goblins guardiÃµes.",TimeUnit.MILLISECONDS, temp_dialog);
                 Digita("\n\nIdril: O que faremos, Rosswald?",TimeUnit.MILLISECONDS, temp_dialog);
                 Digita("\n\nRosswald: Podemos enfrentÃ¡-los, ou tentar a sorte procurando por alguma entrada alternativa...",TimeUnit.MILLISECONDS, temp_dialog);
                 
                 int pontuacao = 0,resp_entrada;
              do{
               System.out.println("\n\n1 - Enfrentar os Goblins GuardiÃµes \n2 - Procurar por outra entrada.");
                resp_entrada = entrada.nextInt();
                if(resp_entrada == 1){
                Digita("\n\nMestre: Cavaleiro corajoso! Para vencer os goblins vocÃª precisarÃ¡ responder 3 perguntas e acertar no mÃ­nimo duas delas. Ã€s questÃµes a seguir nÃ£o poderÃ£o ser respondidas novamente. Se vocÃª nÃ£o acertar pelo menos duas, entÃ£o o cruel combate contra os goblins dependerÃ¡ da sorte...",TimeUnit.MILLISECONDS, temp_dialog);
               


          String resp_bhaskara; 
          do{
          Digita("\n\nMestre: Aplicando a fÃ³rmula de Bhaskara, resolva as seguintes equaÃ§Ãµes do 2Âº grau. \n\na) 3xÂ² â€“ 7x + 4 = 0\n\nb) 9yÂ² â€“ 12y + 4 = 0\n\nc) 5xÂ² + 3x + 5 = 0\n\nEm seguida, digite a alternativa com os resultados corretos.",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n\nA) ResoluÃ§Ã£o -> a = S{4/3,1} | b = S{2/3,2/3} | c = NÃ£o possuem raÃ­zes. ");
        System.out.println("\nB) ResoluÃ§Ã£o -> a = S{5/3,2} | b = S{3/2,4/3} | c = NÃ£o possuem raÃ­zes. ");
        System.out.println("\nC) ResoluÃ§Ã£o -> a = S{4,1} | b = S{2/3,2/3} | c = NÃ£o possuem raÃ­zes. ");
        System.out.println("\nD) ResoluÃ§Ã£o -> a = NÃ£o possuem raizes | b = S{2/3,2/3} | c = NÃ£o possuem raÃ­zes. ");
        System.out.println("\nE) ResoluÃ§Ã£o -> a = NÃ£o possuem raizes | b = S{2/3,2/3} | c = S{4/3,1}");
        System.out.println("\n\nDigite a alternativa correta: ");
        resp_bhaskara = entrada.next();
        switch (resp_bhaskara) {
          case "e":
          case "E":
          case "b":
          case "B":
          case "c":
          case "C":
          case "d":
          case "D":
          Digita("\n\nMestre: Resposta errada, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: PontuaÃ§Ã£o igual Ã  "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "a":
          case "A":
          pontuacao = pontuacao+1;
          Digita("\n\nMestre: Resposta certa, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: PontuaÃ§Ã£o igual Ã  "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          default:
          Digita("\n\nMestre: Desculpe cavaleiro, eu nÃ£o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(!resp_bhaskara.equals("A") && !resp_bhaskara.equals("a") && !resp_bhaskara.equals("b") && !resp_bhaskara.equals("B") && !resp_bhaskara.equals("c") && !resp_bhaskara.equals("C") && !resp_bhaskara.equals("d") && !resp_bhaskara.equals("D") && !resp_bhaskara.equals("e") && !resp_bhaskara.equals("E"));
        

        String resp_equacao;
        do{
        Digita("\n\nMestre: Determine cada elemento da seguinte equaÃ§Ã£o: x2 â€“ 4x â€“ 5 = 0",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n\nA) ResoluÃ§Ã£o -> a = 1 | b = -5 | c = 4");
        System.out.println("\nB) ResoluÃ§Ã£o -> a = -5 | b = -4 | c = 1");
        System.out.println("\nC) ResoluÃ§Ã£o -> a = 0 | b = -4 | c = -5");
        System.out.println("\nD) ResoluÃ§Ã£o -> a = -5 | b = 0 | c = 1");
        System.out.println("\nE) ResoluÃ§Ã£o -> a = 1 | b = -4 | c = -5");
        System.out.println("\n\nDigite a alternativa correta: ");
        resp_equacao = entrada.next();
        switch (resp_equacao) {
          case "a":
          case "A":
          case "b":
          case "B":
          case "c":
          case "C":
          case "d":
          case "D":
          Digita("\n\nMestre: Resposta errada, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: PontuaÃ§Ã£o igual Ã  "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "e":
          case "E":
          pontuacao = pontuacao+1;
          Digita("\n\nMestre: Resposta certa, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: PontuaÃ§Ã£o igual Ã  "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          default:
          Digita("\n\nMestre: Desculpe cavaleiro, eu nÃ£o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(!resp_equacao.equals("A") && !resp_equacao.equals("a") && !resp_equacao.equals("b") && !resp_equacao.equals("B") && !resp_equacao.equals("c") && !resp_equacao.equals("C") && !resp_equacao.equals("d") && !resp_equacao.equals("D") && !resp_equacao.equals("e") && !resp_equacao.equals("E"));

    int vetor[] = new int [5], num_aleatorio, roda_dado, resp_dado_goblins;
    String resposta_mestre="";
    for (int i = 0;i<vetor.length;i++){
      num_aleatorio = 1 + (int) (Math.random() * 10);
      vetor[i] = num_aleatorio;
    }

    Digita("\n\nMestre: A 3Âª pergunta, fica a critÃ©rio de sua sorte. De 1 a 10, eu pensarei em exatamente 5 nÃºmeros e poderÃ£o ser eles repetidos e diferentes (nÃ£o seguirÃ¡ nenhuma ordem), desta forma vocÃª precisarÃ¡ acertar apenas 1 desses 5.",TimeUnit.MILLISECONDS, temp_dialog);
    System.out.print("\n\nTente acertar: ");
     int num = entrada.nextInt();
     for (int i = 0;i<vetor.length;i++){
         if(num == vetor[i]){
            resposta_mestre = "\n\nMestre: VocÃª acertou, boa!";
            pontuacao=pontuacao+1;
            break;
        
         }else{
            resposta_mestre = "\n\nMestre: Infelizmente vocÃª errou.";
         }
         }
         Digita("\n\nMestre: Veja sÃ³ os nÃºmeros que pensei: ",TimeUnit.MILLISECONDS, temp_dialog);
         System.out.print("\n");
          for (int i = 0;i<vetor.length;i++){ 
            System.out.println("\n"+(i+1)+"Âº nÃºmero = "+vetor[i]);
            }
          Digita(resposta_mestre,TimeUnit.MILLISECONDS, temp_dialog); 
          Digita("\n\nMestre: PontuaÃ§Ã£o nas questÃµes = "+(pontuacao),TimeUnit.MILLISECONDS, temp_dialog);
            if(pontuacao >=2){
                  Digita("\n\nMestre: Enfrentem os goblins!",TimeUnit.MILLISECONDS, temp_dialog);
            }else if(pontuacao < 2){
            Digita("\n\nMestre: VocÃªs foram avisados, tudo agora dependerÃ¡ da sorte de vocÃªs... lance o dado, igual ou acima de 4 vocÃªs vivem, caso contrÃ¡rio vocÃªs morrem.",TimeUnit.MILLISECONDS, temp_dialog);
              roda_dado = 1 + (int) (Math.random() * 6); 
              do{
               Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Dado de 6 lados.",TimeUnit.MILLISECONDS, temp_transicao);
               Digita("\n\nRodar os dados? ",TimeUnit.MILLISECONDS, temp_transicao);
               Digita("\n\n1 - Vamos lÃ¡!!!",TimeUnit.MILLISECONDS, temp_transicao); 
               System.out.println("\n");
               resp_dado_goblins = entrada.nextInt();
               System.out.println("\n");
               if(resp_dado_goblins != 1){
               Digita("\n\nMestre: Meu bravo cavaleiro, eu nÃ£o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
               }}while(resp_dado_goblins != 1);
                Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nDado: "+roda_dado,TimeUnit.MILLISECONDS, temp_dialog);
                if(roda_dado<4){
                Digita("\n\nGoblins: Matem eles!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: NÃƒÃƒÃƒO! Idril, fuja! Eles sÃ£o fortes demais...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Rosswald morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nIdril: ROSSWALD, NÃƒO... SEUS MALDITOS, IRÃƒO PAGAR POR ISSO!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: QUEIMEEEEEEEEM!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril conjura fogo com seu cajado ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: Mesmo com suas fortes habilidades de fogo, nÃ£o foi suficiente...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: SÃ³ restou vocÃª em batalha, jovem cavaleiro. O que vai fazer?",TimeUnit.MILLISECONDS, temp_dialog);
                do{
                System.out.println("\n\n1 - Fugir... \n2 - Lutar");
                escolha_fugir = entrada.nextInt();
                if(escolha_fugir!= 1 && escolha_fugir!= 2){
                Digita("\n\nMestre: AÃ§Ã£o invÃ¡lida.",TimeUnit.MILLISECONDS, temp_dialog);
                }
                else if(escolha_fugir == 2){
                    Digita("\n\nMestre: Realmente muito corajoso, porÃ©m vocÃª sozinho nÃ£o conseguirÃ¡...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Coragem nem sempre Ã© a resposta meu jovem, Ã© nos momentos de desespero onde mais precisamos manter a racionalidade...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Lembre-se disso...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins te devoram ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\n** Fim de Jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    System.exit(0);
                }
                else if(escolha_fugir == 1){
                    Digita("\n\nMestre: Fugir? E eu pensando que cavaleiros eram corajosos...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: NÃ£o hÃ¡ como fugir meu jovem, encare seu destino.",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: AceitaÃ§Ã£o Ã© o primeiro passo para compreensÃ£o de um erro. Aprenda e faÃ§a melhor na prÃ³xima aventura...",TimeUnit.MILLISECONDS, 70);
                    Digita("\n\n** Goblins te devoram ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\n** Fim de Jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    System.exit(0);
                }}while(escolha_fugir!= 1 && escolha_fugir!= 2); 
         
                }else if(roda_dado>=4){
                      Digita("\n\nMestre: Enfrentem os goblins!",TimeUnit.MILLISECONDS, temp_dialog);
                }
            }
        
                Digita("\n\nIdril: SONO CELESTIAL!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril coloca 2 grandes goblins para dormir **",TimeUnit.MILLISECONDS, temp_narrativa); 
                Digita("\n\nRosswald: BOLA DE FOGO!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Rosswald queima 2 goblins **",TimeUnit.MILLISECONDS, temp_narrativa); 
                Digita("\n\nMestre: Chegou a hora de usar suas habilidades!",TimeUnit.MILLISECONDS, temp_dialog);
                int escolha_de_habilidade;
                do{
                System.out.println("\n\n1 - CORTE ESPECTRAL DE LUKE YEAGHER \n2 - PRINCIPE FANTASMA");
                escolha_de_habilidade = entrada.nextInt();
                if(escolha_de_habilidade != 1 && escolha_de_habilidade != 2){
                   Digita("\n\nMestre: Eu nÃ£o ouvi direito, cavaleiro.",TimeUnit.MILLISECONDS, temp_dialog);
                }}while(escolha_de_habilidade != 1 && escolha_de_habilidade!= 2);
                Digita("\n\n* Todos os goblins morrem **",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: E juntos vocÃªs entram na Caverna do Rei DemÃ´nio...",TimeUnit.MILLISECONDS, temp_dialog); 


         }
                else if(resp_entrada == 2){
                  Digita("\n\nMestre: Muito bem, hÃ¡ exatamente 10 rotas alternativas que parecem indicar uma entrada para Caverna, porÃ©m apenas uma dessas rotas permitirÃ¡ que vocÃªs entrem... VocÃª terÃ¡ apenas 5 chances para descobrir. Caso seguiam pelo caminho errado 5 vezes, os goblins serÃ£o alertados e todos vocÃªs morrerÃ£o da maneira mais rÃ¡pida e cruel que conseguem imaginar... Que comece o desafio!",TimeUnit.MILLISECONDS, temp_dialog);
                  System.out.print("\n");
                  for(int i = 1; i<= 10;i++){
                        Digita("\n"+i+" - para seguir na "+i+"Âª rota aleatÃ³ria.",TimeUnit.MILLISECONDS, temp_dialog);
                  }
                  int rota_escolhida, tentativas = 0;
                  int rota_aleatoria = 1 + (int) (Math.random() * 10);
                  do{
                  Digita("\n\nMestre: Escolha uma rota para seguir: ",TimeUnit.MILLISECONDS, temp_dialog);
                  rota_escolhida = entrada.nextInt();
                  if(tentativas==4){
                  Digita("\n\nMestre: Os goblins foram alertados...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\n\n** Um deles arranca a cabeÃ§a de Rosswald **",TimeUnit.MILLISECONDS, temp_narrativa);
                  Digita("\n\n** Na sequÃªncia, os goblins arrancam fora Ã s suas pernas **",TimeUnit.MILLISECONDS, temp_narrativa);
                  Digita("\n\nMestre: Sem tempo sequer para reagir, vocÃª observa Idril inutilmente tentando lutar...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\n\n** VocÃª morre enquanto assistia Idril ser devorada **",TimeUnit.MILLISECONDS, temp_narrativa);
                  Digita("\n\nMestre: Para sobreviver aos grandes desafios da vida, Ã s vezes uma boa intuiÃ§Ã£o pode nos ajudar...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\n\n** Fim de Jogo **",TimeUnit.MILLISECONDS, temp_narrativa);
                  System.exit(0);
                  }
                   else if(rota_escolhida > rota_aleatoria && (rota_escolhida-rota_aleatoria) == 1){
                  tentativas = tentativas+1;
                  Digita("\n\nMestre: A rota nÃ£o Ã© essa, porÃ©m ela estÃ¡ prÃ³xima...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                  }
                  else if(rota_escolhida < rota_aleatoria && (rota_aleatoria-rota_escolhida) == 1){
                  tentativas = tentativas+1;
                  Digita("\n\nMestre: A rota nÃ£o Ã© essa, porÃ©m ela estÃ¡ prÃ³xima...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                  }
                  else if(rota_escolhida > rota_aleatoria){
                      tentativas = tentativas+1;
                      Digita("\n\nMestre: A rota nÃ£o Ã© essa...",TimeUnit.MILLISECONDS, temp_dialog);
                      Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                   }
                   else if(rota_escolhida < rota_aleatoria){
                      tentativas = tentativas+1;
                      Digita("\n\nMestre: A rota nÃ£o Ã© essa...",TimeUnit.MILLISECONDS, temp_dialog);
                      Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                   }
                else if(rota_escolhida == rota_aleatoria){
                   Digita("\n\nMestre: VocÃªs descobriram uma passagem para Caverna e nÃ£o precisarÃ£o lutar contra os goblins!",TimeUnit.MILLISECONDS, temp_dialog);
                   Digita("\n\nIdril: Conseguimos Rosswald!",TimeUnit.MILLISECONDS, temp_dialog);
                   Digita("\n\nRosswald: Jovem principe... Idril... vamos lÃ¡. Bora chutar a bunda desse Rei DemÃ´nio de uma vez por todas!",TimeUnit.MILLISECONDS, temp_dialog);
                   Digita("\n\nMestre: E juntos, vocÃªs entram na caverna do Rei DemÃ´nio",TimeUnit.MILLISECONDS, temp_dialog);
      }}while(rota_escolhida!=rota_aleatoria);

                }
                
 } while(resp_entrada != 1 && resp_entrada!= 2);
 
 }

     static void capitulo_3() throws Exception{

        Scanner entrada = new Scanner (System.in);
        int resp, resp2, resp3, resp4, resp5, resp6, resp7, resp8, resp9, resp10, resp11, resp12, resp13, resp14;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - CapÃ­tulo 3 - A culpa Ã© sua, nÃ£o minha!",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\n1 - Vamos!!!",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu nÃ£o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp!=1);
          Digita("\n\nMestre: Ao entrar na Caverna do Rei DemÃ´nio, vocÃªs ficam surpresos...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Estava tudo VAZIO! Sem monstros, demÃ´nios ou qualquer coisa assustadora...",TimeUnit.MILLISECONDS, temp_dialog);
          do{
      
        Digita("\n\n1 - Esperem, isso estÃ¡ estranho...",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp2 = entrada.nextInt();
        if(resp2 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp2!=1);

        Digita("\n\nIdril: Sim de fato, por que nÃ£o hÃ¡ nada aqui dentro?",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nRosswald: Hum.. cuidado, demÃ´nios podem ficar invisiveis...",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nMestre: VocÃªs exploram a Caverna, porÃ©m ainda nÃ£o encontram nada. Tudo continua vazio e sem o menor barulho",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nIdril: Rosswald, e se os boatos nÃ£o forem verdade...?",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nRosswald: Eles PRECISAM ser Idril, nÃ£o temos muita escolha...",TimeUnit.MILLISECONDS, temp_dialog);
        do{
      
        Digita("\n\n1 - Boatos? As pistas que vocÃªs disseram na taverna eram apenas boatos?",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp3 = entrada.nextInt();
        if(resp3 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp3!=1);
           Digita("\n\nRosswald: Sim jovem, mas sÃ£o FORTES BOATOS que indicam que o responsÃ¡vel pela praga Ã© o asqueroso Rei DemÃ´nio. NÃ£o faria muita diferenÃ§a te falar isso na taverna.",TimeUnit.MILLISECONDS, temp_dialog);

           do{
      
        Digita("\n\n1 - SEM ESSA! Como podem agir baseado em boatos?",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp4 = entrada.nextInt();
        if(resp4 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp4!=1);
         Digita("\n\nRosswald: NÃ£o mudaria muito, nÃ£o Ã©? VocÃª estava desesperado quando pedimos sua ajuda... nÃ³s tambÃ©m estamos! Pessoas estÃ£o morrendo, cavaleiro! Morrendo a mais de dois meses! Se hÃ¡ alguma pequena chance de vencermos essa doenÃ§a, precisamos agarra-la forte!",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nRosswald: Desculpe, mas ouÃ§a principe, seu pai tambÃ©m Ã© uma das vitimas da praga... NÃ£o se sente tentado a ir atrÃ¡s da menor possibilidade possÃ­vel de encontrar alguma cura?",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nIdril: Sim pequeno cavaleiro, controle suas emoÃ§Ãµes e vamos continuar... Os boatos sÃ£o verdadeiros, e vamos conseguir encontrar uma cura para populaÃ§Ã£o de Alduin com esse Rei DemÃ´nio.",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: E assim vocÃªs prosseguem explorando a masmorra, atÃ© que...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\n** Barulho de ronco ** ",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\nRosswald: Esperem! O que foi isso...?",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\n** Barulho de ronco ** ",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\nMestre: Idril tremendo da cabeÃ§a aos pÃ©s, olha para algo deitado no fim de uma das passagens da caverna.",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\nRosswald: FaÃ§am o menor barulho possÃ­vel...",TimeUnit.MILLISECONDS, temp_dialog);

           do{
      
        Digita("\n\n1 - Rosswald, isso Ã© um....",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp5 = entrada.nextInt();
        if(resp5 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp5!=1);
         Digita("\n\nMestre: DRAGÃƒO!",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Para passarem do dragÃ£o sem acorda-lo, serÃ¡ uma tarefa complicada...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: O chÃ£o da caverna Ã© velho e antigo, por isso possui diversas fendas e rachaduras que fazem barulho ao pisar. A ideia Ã© que passem pelo dragÃ£o silenciosamente e sem pisar em nenhuma das fendas.",TimeUnit.MILLISECONDS, temp_dialog);
          int qtd_caminho = 15;
          int qtd_fendas = 5;
 
          int caminho[] = new int [qtd_caminho]; 
          for (int i = 0; i < caminho.length; i++){
               caminho[i] = (int) ((Math.random() * 0));   
          }
          int sorteia_fendas;
          for(int i=0; i<qtd_fendas;i++){    
            sorteia_fendas = (int) ((Math.random() * (qtd_caminho))); 
            do{
            if(caminho[sorteia_fendas] == -1){ 
            sorteia_fendas = (int) ((Math.random() * (qtd_caminho))); 
            }}while(caminho[sorteia_fendas] == -1);
            caminho[sorteia_fendas] = -1;
}
            Digita("\n\nMestre: Para passar do dragÃ£o, serÃ£o necessÃ¡rios 10 passos. Neste percurso da Caverna contÃ©m cinco fendas no chÃ£o. Que a sorte esteja com vocÃªs...",TimeUnit.MILLISECONDS, temp_dialog);
             Digita("\nMestre: Aaaah, para ajudÃ¡-los, darei uma dica... Se o dragÃ£o se mexer, Ã© por que vocÃªs estÃ£o prÃ³ximos a uma fenda, tomem cuidado!",TimeUnit.MILLISECONDS, temp_dialog);
            String fenda = "fenda";
            String espaco_marcado = "x";
            String espaco_livre = "_";
            System.out.println("\n");
            for(int i =0; i<caminho.length;i++){
                  System.out.println(i+"."+espaco_livre);
            }
                int posicao_escolhida = -1,guarda_posicao = -1, j =0;
                int pontuacao = 0;
                int pontuacao_maxima = (qtd_caminho-qtd_fendas);
                String troca_fenda = "", troca_vazio = "";
                while(j<qtd_caminho){
                j++;
                guarda_posicao = posicao_escolhida;
                do{
                Digita("\n\nMestre: Onde irÃ£o pisar? ",TimeUnit.MILLISECONDS, temp_dialog);
                posicao_escolhida = entrada.nextInt();
                if(posicao_escolhida > (caminho.length-1) || posicao_escolhida < 0 || posicao_escolhida == guarda_posicao){
                 Digita("\n\nMestre: Desculpe cavaleiro, nÃ£o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
                }
                else if(caminho[posicao_escolhida] == -1){
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+fenda);
                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }
                  if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);  
                  }}
                    Digita("\n\nMestre: O dragÃ£o acordou!",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\nMestre: Resultado do seu percurso = "+(pontuacao +" / "+pontuacao_maxima),TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Todos vocÃªs morrem em um piscar de olhos ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\n** Fim de Jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    System.exit(0);
}
                  else if(caminho[posicao_escolhida] == 0 && pontuacao == (pontuacao_maxima-1)){
                  caminho[posicao_escolhida] = 2;
                  pontuacao = pontuacao+1;
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+espaco_livre);

                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);
                  }}
                    Digita("\n\nMestre: VocÃªs conseguiram passar sem pisar em nenhuma fenda!",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\nMestre: Resultado do seu percurso = "+(pontuacao +" / "+pontuacao_maxima),TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nIdril: Uuufaaa! Conseguimos!",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nRosswald: Estamos chegando ao fim da Caverna, sÃ³ mais um pouco e talvez encontraremos o Rei DemÃ´nio.",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nMestre: VocÃªs chegam ao fim da caverna... O lugar estranhamente parecia algum tipo de catedral por debaixo da terra de tÃ£o imenso que era.",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nRosswald: Ok, esperem. SerÃ¡ a qualquer momento...",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\n** 1 minuto se passa **",TimeUnit.MILLISECONDS, temp_narrativa);
                     Digita("\n\nRosswald: A qualquer momento...",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\n** Mais 2 minutos se passam **",TimeUnit.MILLISECONDS, temp_narrativa);
                     Digita("\n\nIdril: Ei Rosswald... no fim das contas eram apenas boatos...",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\n** Idril comeÃ§a a chorar **",TimeUnit.MILLISECONDS, temp_narrativa);
                     Digita("\n\nMestre: Rosswald parece nÃ£o notar.",TimeUnit.MILLISECONDS, temp_dialog);

                     do{
                        Digita("\n\n1 - Ei cara, sua mulher estÃ¡ chorando.",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp6 = entrada.nextInt();
                        if(resp6 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp6!=1);
                       Digita("\n\n** Rosswald continua parado, esperando alguma coisa **",TimeUnit.MILLISECONDS, temp_narrativa);
                      do{
                        Digita("\n\n1 - ROSSWALD! IDRIL ESTÃ CHORANDO, DÃ PARA FAZER ALGUMA COISA?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp7 = entrada.nextInt();
                        if(resp7 != 1){
                        Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                         }}while(resp7!=1);
                        Digita("\n\n** Rosswald nÃ£o move um mÃºsculo sequer **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nRei DemÃ´nio: COMO ESPERADO DO GRANDE BRUXO DO NORTE!",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\n** Idril olha assustada **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nRei DemÃ´nio: Foi o primeiro a me notar hahahaha...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nMestre: O Rei DemÃ´nio era um ser muito assustador. Tinha asas negras pontiagudas, pele negra avermelhada, olhos luminosos, presas e media cerca de 5 metros de altura...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei DemÃ´nio: O que os trazem na minha casa, jovens?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: EntÃ£o vocÃª estava invisivel o tempo todo... Outros demÃ´nios moram aqui?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei DemÃ´nio: Vivo em solidÃ£o bruxo, extrema solidÃ£o... Mas vocÃªs nÃ£o responderam minha pergunta, o que vieram fazer aqui?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: VIEMOS ATRÃS DA CURA DA PRAGA! POR QUE ESTÃ MATANDO O POVO DE ALDUIN? POR QUE?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nRei DemÃ´nio: Ah compreendo... o desespero...",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: RESPONDA SEU NOJENTO DESGRAÃ‡ADO, POR QUE ESTÃ MATANDO Ã€S PESSOAS?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nRei DemÃ´nio: E por qual motivo vocÃª protege Ã s pessoas, pequena Elfa?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\n** Idril fica calada **",TimeUnit.MILLISECONDS, temp_narrativa);
                         Digita("\n\nRei DemÃ´nio: NÃ£o sabe, nÃ£o Ã©?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nIdril: NÃƒO VEM COM ESSA, NÃƒO Ã‰ PRECISO DE UM MOTIVO PARA QUERER A FELICIDADE, A VIDA, A PROSPERIDADE E O SORRISO NO ROSTO DAS PESSOAS!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei DemÃ´nio: Ah Ã© mesmo? Essas palavras soam tÃ£o bonitas quando ditas por uma Elfa. Parecem atÃ© uma serenata.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\n** Rosswald segura a mÃ£o de Idril **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nRosswald: Se acalme Idril, precisamos manter o foco.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: Ã‰ como ela diz, oh Lorde dos DemÃ´nios! Viemos atrÃ¡s da cura da praga. VocÃª deve saber algo a respeito, sim?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei DemÃ´nio: Ah sei sim, tanto quanto qualquer pessoa. EstÃ¡ matando a todos, isso nÃ£o Ã© lindo?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: O que quer dizer..? Como assim qualquer pessoa?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei DemÃ´nio: Todos estÃ£o morrendo, nÃ£o Ã©? Ã‰ natural que o mundo inteiro fique sabendo...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: NÃ£o venha com joguinhos, diga. VocÃª Ã© o culpado disso, nÃ£o Ã©?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei DemÃ´nio: Ã‰ uma acusaÃ§Ã£o bem sÃ©ria, bruxo do norte.",TimeUnit.MILLISECONDS, temp_dialog);
                        do{
                        Digita("\n\n1 - DIGA DE UMA VEZ, MONSTRO! POR QUE ESTÃ MATANDO TODOS COM A PRAGA?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp8 = entrada.nextInt();
                        if(resp8 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp8!=1);

                       Digita("\n\n** Rei DemÃ´nio faz uma reverencia **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nRei DemÃ´nio: O jovem principe de Luke Yeagher, realmente visitas interessantes eu tenho hoje.",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - PERDI MUITOS AMIGOS NA BUSCA PELA CURA E MEU PAI ESTÃ MORRENDO! RESPONDA, FILHO DA MÃƒE!",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp9 = entrada.nextInt();
                        if(resp9 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp9!=1);
                       Digita("\n\nRei DemÃ´nio: Duas acusaÃ§Ãµes sÃ©rias em apenas alguns minutos... e no fim das contas eu sou monstro.",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - DIGA, MALDITO, DIGA DE UMA VEZ POR TODAS! QUAL A SUA RAZÃƒO PARA MATAR Ã€S PESSOAS?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp9 = entrada.nextInt();
                        if(resp9 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp9!=1);
                       Digita("\n\nRei DemÃ´nio: Eu nÃ£o mato Ã s pessoas, principe. Quem mata Ã© a praga. No mÃ¡ximo eu Ã s assisto morrer.",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - POR QUE? POR QUE FAZER ISSO?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp9 = entrada.nextInt();
                        if(resp9 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp9!=1);
                       Digita("\n\nRosswald: Responda logo, vocÃª Ã© ou nÃ£o o responsÃ¡vel pela praga? Se continuar de brincadeiras, morrerÃ¡ aqui e agora!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRosswald: DemÃ´nios alÃ©m de ficarem invisiveis, no geral nÃ£o sÃ£o dificeis de matar. Se forem altos, Ã© sÃ³ pular em cima. Se forem tremendamente fortes, entÃ£o Ã© sÃ³ usar usar magia. VocÃª sabe disso, nÃ£o Ã© Lorde DemÃ´nio?",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei DemÃ´nio: NÃ£o esperava menos coragem do bruxo do norte! Ã‰ exatamente isso.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei DemÃ´nio: Mas o fato Ã© que...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** Rei DemÃ´nio comeÃ§a a se transformar **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nIdril: Esperem, ele estÃ¡...",TimeUnit.MILLISECONDS, temp_dialog);
                        do{
                        Digita("\n\n1 - ENCOLHENDO?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp10 = entrada.nextInt();
                        if(resp10 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp10!=1);
                       Digita("\n\nMestre: O Rei DemÃ´nio se transforma em algo de aparencia humana... na verdade ele se transforma em um verdadeiro humano. E vocÃª lembra dele de alguma lugar... Ele tinha um sorriso no rosto...",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - MAS QUEM Ã‰ VOCÃŠ?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp11 = entrada.nextInt();
                        if(resp11 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp11!=1);
                        Digita("\n\nRosswald: Taverna? O anÃ£o da taverna... Mas que diabos estÃ¡ acontecendo aqui?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nIdril: ImpossÃ­vel! Aquele anÃ£o Ã© um pobre coitado com uma taverna sem lucros por causa da praga, nÃ£o tem como ele ser o Rei DemÃ´nio",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnÃ£o: VocÃªs realmente conseguiram passar pelo desafio dos goblins, estou admirado! Estava torcendo por vocÃªs!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: Mas o que estÃ¡ acontecendo aqui...? AnÃ£o, por que?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnÃ£o: Sempre fui um demÃ´nio, jovens. E nÃ£o, nÃ£o sou o culpado pela praga.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\n** SilÃªncio **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nAnÃ£o: Vivo em minha humilde taverna, observando o quÃ£o determinados conseguem ser os aventureiros. Acreditem, nada Ã© mais legal do que ser aventureiro. Nada. Ã‰ tÃ£o libertador, nÃ£o acham?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnÃ£o: Sinceramente, prefiro mil vezes a minha taverna do que minha casa. Olhem em volta, nem Verrad me faz companhia! Aquele dragÃ£o dorminhoco!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\n** Rosswald e Idril entreolham-se , sem compreender a situaÃ§Ã£o **",TimeUnit.MILLISECONDS, temp_narrativa);
                        do{
                        Digita("\n\n1 - CALA BOCA!",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp11 = entrada.nextInt();
                        if(resp11 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp11!=1);
                       Digita("\n\n** O anÃ£o continua a falar e falar **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nAnÃ£o: Vieram aqui pelos boatos, nÃ£o Ã© jovens? Mas vocÃªs precisam entender, EU NÃƒO SOU O CULPADO DISSO!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRosswald: EntÃ£o quem Ã©? DIGA, ANÃƒO! VOCÃŠ Ã‰ O REI DOS DEMÃ”NIOS, DEVE SABER ALGO A RESPEITO!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnÃ£o: Eu sei quem sÃ£o os culpados... querem ouvir a histÃ³ria?",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nIdril: Por favor, nos ajude! Nos diga!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnÃ£o: Muito bem, tudo comeÃ§ou na terra dos Elfos...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** Idril fica cheia de Ã³dio ao ouvir aquilo **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nAnÃ£o: Havia um experimento sendo feito por um grupo de elfos aventureiros, aah pobrezinhos. Queriam alcanÃ§ar a vida eterna, mal sabiam eles o tamanho do desastre que fariam. Mal sabiam o quÃ£o angustiamente Ã©, nÃ£o poder morrer...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnÃ£o: Eles vieram atÃ© mim pois o processo necessitava da benÃ§Ã£o dos demÃ´nios. Um poderoso demÃ´nio.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnÃ£o: Eu apenas concebi a eles a oportunidade para realizarem um sonho, mas assim que a fÃ³rmula ficou pronta, houve uma explosÃ£o gigantesca, tÃ£o grande que deixou alguns elfos visinhos ao local do experimento, surdos atÃ© hoje!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nIdril: NÃ£o pode ser! Aquela explosÃ£o de Elfheim aconteceu devido a queda de um raio! Era um dia de tempestade.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnÃ£o: VocÃªs realmente gostam de boatos, nÃ£o Ã© jovens? Assustador...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnÃ£o: Enfim, depois disso o mundo estÃ¡ vivendo nessa pandemia da praga atÃ© hoje. E segundos os novos boatos, eu sou o culpado! Hahahahahaha, Ã© tÃ£o bom isso! DemÃ´nios nunca sÃ£o conhecidos por feitos grandiosos assim, geralmente sÃ³ fazem o mal e blÃ¡ blÃ¡ blÃ¡...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnÃ£o: OuÃ§am jovens, vocÃªs estÃ£o de parabÃ©ns por terem chegado atÃ© aqui! Acreditem, se Verrad tivesse sido acordado, virariam raÃ§Ã£o de dragÃ£o! ",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: Se a sua histÃ³ria for verdadeira, entÃ£o se vocÃª retirasse a benÃ§Ã£o demoniaca das pessoas doentes, talvez elas pudessem... talvez ela pudessem...",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAnÃ£o: Eu jÃ¡ disse hoje que nÃ£o esperava menos de vocÃª, bruxo do norte? Realmente um homem sÃ¡bio.",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: VocÃª precisa nos ajudar, AnÃ£o! Por favor, precisa retirar a benÃ§Ã£o dos doentes e acabar com isso!",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAnÃ£o: VocÃªs invadem a minha casa, me acusam, me ameaÃ§am de morte e agora querem que eu ajude vocÃªs..? Querem que eu ajude o MUNDO?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: VOCÃŠ CONTRIBUIU PARA ESSSA PANDEMIA SE TORNAR REALIDADE, CONCEBEU PODER A POBRES ELFOS INOCENTES! PRECISA CONSERTAR O QUE FEZ, MALDITO!",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAnÃ£o: Ã‰ por isso que demÃ´nios sÃ£o legais, nÃ³s nÃ£o temos essa exigencia cega e egoista dos homens. Vivemos de forma simples, sem preconceito e na mais pacÃ­fica paz. Talvez alguns sejam maus, mas quem no mundo Ã© 100% puro?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAnÃ£o: Querem saber por que demÃ´nios ficam invisiveis?",TimeUnit.MILLISECONDS, temp_dialog);
                          do{
                        Digita("\n\n1 - POR FAVOR, ANÃƒO. FAÃ‡A ESSA CRISE PARAR, LHE PROMETO GRANDIOSAS RECOMPENSAS DE LUKE YEAGHER.",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp12 = entrada.nextInt();
                        if(resp12 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp12!=1);
                       Digita("\n\nAnÃ£o: Os demÃ´nios ficam invisiveis para nÃ£o assustar Ã s pessoas... Geralmente nÃ³s nascemos feios, horriveis e assustadores. Todos saem correndo assim que nos veem.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnÃ£o: NÃ£o que isso me deixe triste, Ã© sÃ³ que hÃ¡ tanto preconceito no mundo dos homens... realmente algo chato, sabe? Alguns como eu, depois de muito estudo na vida, aprendem a se transformar em humanos. E assim vivem suas vidas, para sempre como humanos.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnÃ£o: Querem que eu retire a benÃ§Ã£o demÃ´niaca do mundo de Alduin? Querem que eu cure a praga? Quem criou isso foram vocÃªs!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRosswald: Cuidado demÃ´nio, nÃ£o fomos nÃ³s que ajudamos aqueles elfos.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnÃ£o: NÃ£o muda o fato! VocÃªs sÃ£o os aventureiros, vocÃªs criam ambiÃ§Ãµes tÃ£o dificieis de alcanÃ§ar que apelam atÃ© para os demÃ´nios para atingir seus objetivos. NÃ£o ligam para nada! AgradeÃ§am por poder morrer e se livrarem de um mundo tÃ£o maldoso.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nIdril: NÃƒO! NÃƒO PODE FAZER ISSO! PRECISA AJUDAR A POPULAÃ‡ÃƒO DE ALDUIN!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** O anÃ£o se transforma em demÃ´nio novamente **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nRosswald: O QUE PENSA QUE ESTÃ FAZENDO?",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei demÃ´nio: VERRAD! VENHA AQUI.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** o feroz dragÃ£o chega ao local pouco tempo depois **",TimeUnit.MILLISECONDS, temp_narrativa);
                       do{
                        Digita("\n\n1 - MALDITO... O QUE PENSA EM FAZER COM ESSE DRAGÃƒO?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp13 = entrada.nextInt();
                        if(resp13 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, nÃ£o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp13!=1);
                       Digita("\n\nRei demÃ´nio: Alegrem-se jovens, estarei fazendo um favor tirando-os deste mundo tÃ£o ruim.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei demÃ´nio: Verrad, nÃ£o permita que eles escapem!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** O dragÃ£o da um rugido ensurdecedor **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nRosswald: NÃ£o temos a menor chance de vencer...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nIdril: Precisamos pensar em algo rÃ¡pido. Vamos todos morrer em alguns segundos!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei demÃ´nio: Prestigiem o total poder do Rei dos DemÃ´nios, a habilidade profanada do mundo dos mortos, que assola paÃ­ses e destrÃ³i tudo!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei demÃ´nio: ALVORECER DA ESCURIDÃƒO!",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\n** Os trÃªs grandes herÃ³is dÃ£o Ã s mÃ£os, nÃ£o hÃ¡ mais o que fazer... **",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: Assim que o Rei DemÃ´nio usa sua habilidade final, todos vocÃªs morrem.",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: Mas nÃ£o se preocupe, meu jovem cavaleiro. NÃ£o havia como terminar essa histÃ³ria de outro jeito! O ponto Ã© que, vocÃª precisa aprender o seguinte: ",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: Quando estamos assustados, quando parece nÃ£o haver mais esperanÃ§as, precisamos manter a fÃ©, confianÃ§a e racionalidade. E nÃ£o procurar alguÃ©m para culpar. A culpa pode justificar uma causa, mas com certeza nÃ£o vai resolve-la. Problemas nÃ³s teremos a todo momento, mas precisamos encarÃ¡-los juntos. ResolvÃª-los juntos, e nÃ£o culpar Ã s nossas sombras ou os nossos demÃ´nios.",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: MORRAM EM PAZ JOVENS CAVALEIROS E PRESTIGIEM O ALVORECER DA ESCURIDÃƒO!",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\n\n\n\n\n\n\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\n  .....................:: FIM ::.....................",TimeUnit.MILLISECONDS, temp_narrativa);
                       creditos();
                       menu();

                  }
                else if(caminho[posicao_escolhida] == 0 && posicao_escolhida == (qtd_caminho-1) && caminho[posicao_escolhida-1] == -1){
                  caminho[posicao_escolhida] = 2;
                  pontuacao = pontuacao+1;
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+espaco_livre);
                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);
                  }} 
                  Digita("\n\n** O dragÃ£o se mexe ** ",TimeUnit.MILLISECONDS, temp_narrativa);
}
                else if(caminho[posicao_escolhida] == 0 && posicao_escolhida == 0 && caminho[posicao_escolhida+1] == -1){
                  caminho[posicao_escolhida] = 2;
                  pontuacao = pontuacao+1;
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+espaco_livre);
                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);
                  }} 
                   Digita("\n\n** O dragÃ£o se mexe ** ",TimeUnit.MILLISECONDS, temp_narrativa);
}
                else if(caminho[posicao_escolhida] == 0 && posicao_escolhida != 0 && posicao_escolhida !=  (qtd_caminho-1) && (caminho[posicao_escolhida-1] == -1 || caminho[posicao_escolhida+1] == -1) ){
                  caminho[posicao_escolhida] = 2;
                  pontuacao = pontuacao+1;
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+espaco_livre);
                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);
                  }} 
                  Digita("\n\n** O dragÃ£o se mexe ** ",TimeUnit.MILLISECONDS, temp_narrativa);
}
                else if(caminho[posicao_escolhida] == 0){
                  caminho[posicao_escolhida] = 2;
                  pontuacao = pontuacao+1;
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+espaco_livre);
                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);
                  }} 
}
                }while(posicao_escolhida > (caminho.length-1) || posicao_escolhida < 0);       
}

     }
     public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
    }
}
    }