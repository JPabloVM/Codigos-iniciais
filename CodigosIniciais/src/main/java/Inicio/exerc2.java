package ado3;

import java.util.Scanner;

/**
 *
 * @author João Pablo
 */
public class exerc2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1, valor2, valor3;

        System.out.println("Digite o primeiro valor: ");
        valor1 = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = entrada.nextInt();
        System.out.println("Digite o terceiro valor: ");
        valor3 = entrada.nextInt();

        if (valor1 + valor2 > valor3 || valor1 + valor3 > valor2 || valor3 + valor2 > valor1) {
            System.out.println("É um triângulo");
            if (valor3 == valor2 || valor3 == valor1 || valor1 == valor2) {
                System.out.println("O triângulo é Isoceles");
            } else if (valor1 == valor2 && valor2 == valor3) {
                System.out.println("É um triângulo equilátero");
            } else if (valor1 != valor2 && valor2 != valor3 && valor3 != valor1) {
                System.out.println("É um triângulo escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }

    }

}
