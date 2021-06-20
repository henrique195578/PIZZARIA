
package Pizzaria;

import java.util.ArrayList;


public class Flavor {

    double valorSabor;
    SizePizza size = new SizePizza();
    ArrayList<String> listaSabores = new ArrayList();

    Order order = new Order();

    public ArrayList selectFlavor(int op) {

        switch (op) {
            case 1:
                listaSabores.add("5 QUEIJOS");
                break;
            case 2:
                listaSabores.add("FRANGO CATUPIRY");
                break;
            case 3:
                listaSabores.add("CHEDDAR");
                valorSabor += 3.50;
                break;
            case 4:
                listaSabores.add("CALABRESA");
                break;
            case 5:
                listaSabores.add("CHOCOLATE");
                break;
            case 6:
                listaSabores.add("PRESTIGIO");
                break;
            case 7:
                listaSabores.add("SALMAO COM ALCAPARRAS");
                valorSabor += 4;
                break;
            case 8:
                listaSabores.add("CAMARAO");
                valorSabor += 4.5;
                break;
            case 9:
                listaSabores.add("ABACAXI COM CANELA");
                break;
        }

        return listaSabores;
    }

}