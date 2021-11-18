package Inicio;

import java.util.Scanner;

/**
 *
 * @author João Pablo
 */
public class Multiplos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, multiplos;

        System.out.println("Digite um número: ");
        n = entrada.nextInt();
        multiplos = n * 1;
        System.out.println("O 1° múltiplo de " + n + " é o " + multiplos);
        multiplos = n * 2;
        System.out.println("O 2° múltiplo de " + n + " é o " + multiplos);
        multiplos = n * 3;
        System.out.println("O 3° múltiplo de " + n + " é o " + multiplos);
    }

}
