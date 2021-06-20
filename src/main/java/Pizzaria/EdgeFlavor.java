
package Pizzaria;

import java.util.Scanner;


public class EdgeFlavor {

    int op;
    String border = "";
    double valorBorda;
    int validador = 0;
    Order order = new Order();

    public int validarBorda(int op) {
        switch (op) {
            case 1:
                selectBorder();
                validador = 1;
                break;
            case 2:

                break;
        }
        return 0;
    }

    public String selectBorder() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ESCOLHA UM SABOR DE BORDA");
        System.out.println("[1] - CHEDDAR");
        System.out.println("[2] - CATUPIRY ");
        System.out.println("[3] - ½ NUTELLA ½ DOCE DE LEITE");
        System.out.println("[4] - NUTELLA");
        System.out.println("SELECIONE TIPO DE BORDA: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                border = "CHEDDAR";
                break;

            case 2:
                border = "CATUPIRY";
                break;

            case 3:
                border = "½ NUTELLA ½ DOCE DE LEITE";
                valorBorda = 3;
                break;

            case 4:
                border = "NUTELLA";
                valorBorda = 2;
                break;
        }
        return border;
    }
}