package Inicio;

import java.util.Scanner;

/**
 *
 * @author João Pablo
 */
public class TabuadaSimples {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10 para  cálculo da tabuada: ");
        String numeroStr = entrada.nextLine();

        int numero = Integer.parseInt(numeroStr);

        int fator = 1;
        while (fator < 11) {
            int resultado = numero * fator;
            System.out.println("" + numero + "x" + fator + "=" + resultado);
            fator = fator + 1;
        }

    }
}
