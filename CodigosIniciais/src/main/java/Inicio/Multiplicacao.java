package Inicio;

import java.util.Scanner;

/**
 *
 * @author João Pablo
 */
public class Multiplicacao{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2, n3, multiplicacao;

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextFloat();

        System.out.println("Digite o terceiro número: ");
        n3 = entrada.nextFloat();

        multiplicacao = n1 * n2 * n3;
        System.out.println("O resultado da multiplicação dos números escolhidos é: " + multiplicacao);
    }

}
