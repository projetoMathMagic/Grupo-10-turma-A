package projeto_p.i.functions;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Binario {
    

    public static int BinaryToDecimal(String binary) {
        
        // Esta função converte número da base binária para decimal
        // O número entra como um string (String Binary) e passa pelo método integer
        // O Integer é um método que análise e converte diversos tipos "primitivos" em número, ou seja,
        // o número binário que entrou como texto na String Binary, agora passa a falar como um número de classe INT
        // Dessa maneira o RETURN DECIMAL trás esse número agora como decimal.
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }
    
    public static String DecimalToBinary (String decimal) {
        
        // Esta função por sua vez convete número de base DEC para BIN
        // O número entra como um String (String decimal) e passa pelo método INTEGER onde é convertido em binário
        // o RETURN BINARY trás esse número agora como binário.
        int vlDec = Integer.parseInt(decimal);
        String binary = Integer.toBinaryString(vlDec);
        return binary;
    }

    public static void main(String[] args) {
       
        String numero = "110";
        int a = BinaryToDecimal(numero);
        System.out.println(a);
        
        String numeroDec = "11";
        String b = DecimalToBinary(numeroDec);
        System.out.println(b);
    }
}

