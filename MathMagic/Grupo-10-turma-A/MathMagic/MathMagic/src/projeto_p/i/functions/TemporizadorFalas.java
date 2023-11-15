
package projeto_p.i.functions;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author jpserignolli
 */
public class TemporizadorFalas {
    public static void Falas(String falas, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : falas.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
        }
    }   
}

