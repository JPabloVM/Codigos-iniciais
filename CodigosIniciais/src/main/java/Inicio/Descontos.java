package Inicio;

import java.util.Scanner;

/**
 *
 * @author João Pablo
 */
public class Descontos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float compra, desconto1, desconto2, valorTotal;
        System.out.println("Digite o valor da sua compra: ");
        compra = entrada.nextFloat();

        if (compra >= 300.00) {
            desconto1 = (compra * 20) / 100;
            valorTotal = compra - desconto1;
            System.out.println("O valor do seu desconto foi de R$" + desconto1 + ", sendo assim o valor a ser pago é de R$" + valorTotal);
        } else if (compra <= 300) {
            desconto2 = (compra * 15) / 100;
            valorTotal = compra - desconto2;
            System.out.println("O valor do seu desconto foi de R$" + desconto2 + ",sendo assim o valor a ser pago é de R$" + valorTotal);
        } else if (compra <= 0) {
            System.out.println("Valor inválido!");
        }

    }

}
