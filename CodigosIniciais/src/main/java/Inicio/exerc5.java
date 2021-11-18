package ado3;

import java.util.Scanner;

/**
 *
 * @author João Pablo
 */
public class exerc5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta = "A";
        String a;

        System.out.println("A seguir, apresentamos quatro números em suas representações binárias: \n (1)0101001; \n (2)1101001; \n (3)0001101; \n (4)1010110; \n ");
        System.out.println("Escolha a alternativa que representa a soma dos "
                + "números acima convertidos para o formato decimal.");
        System.out.println(" (A)245 \n (B)101 \n (C)111 \n (D)267 \n (E)213 \n ");
        resposta = entrada.nextLine();
        switch (resposta) {
            case "a":
                System.out.println("Resposta correta");
                break;
            case "b":
                System.out.println("Resposta incorreta");
                break;
            case "c":
                System.out.println("Resposta incorreta");
                break;
            case "d":
                System.out.println("Resposta incorreta");
                break;
            case "e":
                System.out.println("Resposta incorreta");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

}
