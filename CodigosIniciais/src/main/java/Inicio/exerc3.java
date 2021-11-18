package ado3;

import java.util.Scanner;

/**
 *
 * @author João Pablo
 */
public class exerc3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano;
        System.out.println("Digite os 4 dígiitos de um ano para saber se ele é bissexto ou não: ");
        ano = entrada.nextInt();
        if ((ano % 400 == 0) || ((ano % 4 == 0)) && (ano % 100 != 0)) {
            System.out.println("O ano de " + ano + " é bissexto");
        } else {
            System.out.println("O ano de " + ano + " não é bissexto");
        }

    }

}
