
package Pizzaria;

import java.util.ArrayList;
import java.util.Scanner;


public class Drink {

    int op;
    String drink = "";
    double valorDrink;
    int validador = 1;
    ArrayList<String> listaBebidas = new ArrayList();

    public int validarDrink(int op) {

        switch (op) {
            case 1:
                selectDrink();
                break;
            case 2:
                validador = validador - 1;
                break;

        }
        return 0;
    }

    public ArrayList selectDrink() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ESCOLHA QUAL BEBIDA QUER BEBER ");
        System.out.println("[1] - COCA COLA 2 LT ");
        System.out.println("[2] - CERVEJA HEINEKEN 330 ML ");
        System.out.println("[3] - SUCO PRATZ 900 ML ");
        System.out.println("[4] - AGUA MINERAL 600 ML");
        System.out.println("ESCOLHA UMA DAS BEBIDAS:");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                listaBebidas.add("COCA COLA 2 LT");
                valorDrink = valorDrink + 9.5;
                break;

            case 2:
                listaBebidas.add("CERVEJA HEINEKEN 330 ML");
                valorDrink = valorDrink + 6.5;
                break;

            case 3:
                listaBebidas.add("SUCO PRATZ 900 ML");
                valorDrink = valorDrink + 12.5;
                break;

            case 4:
                listaBebidas.add("AGUA MINERAL 600 ML");
                valorDrink = valorDrink + 3.5;
                break;
        }

        return listaBebidas;

    }

}