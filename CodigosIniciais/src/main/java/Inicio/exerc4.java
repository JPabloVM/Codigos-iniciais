package ado3;

import java.util.Scanner;

/**
 *
 * @author João Pablo
 */
public class exerc4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        System.out.println("Digite um valor de 1 a 7: ");
        dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Esse número corresponde ao Domingo");
                break;
            case 2:
                System.out.println("Esse número corresponde á Segunda-Feira");
                break;
            case 3:
                System.out.println("Esse número corresponde á Terça-Feira");
                break;
            case 4:
                System.out.println("Esse número corresponde á Quarta-Feira");
                break;
            case 5:
                System.out.println("Esse número corresponde á Quinta-Feira");
                break;
            case 6:
                System.out.println("Esse número corresponde á Sexta-Feira");
                break;
            case 7:
                System.out.println("Esse número corresponde ao Sábado");
                break;
            default:
                System.out.println("Valor inválido");
        }

    }

}
