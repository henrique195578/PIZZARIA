
package Pizzaria;

import java.util.Scanner;

public class Order {

    int x = 0;
    double valorTotal;

    public void order() {
        SizePizza sizePizza = new SizePizza();
        Flavor flavor = new Flavor();
        EdgeFlavor edgeFlavor = new EdgeFlavor();
        Drink drink = new Drink();

        Scanner entrada = new Scanner(System.in);

        System.out.println("SELECIONE UM TAMANHO DE PIZZA");
        System.out.println("[1] - GIGANTE");
        System.out.println("[2] - FAMILIA ");
        System.out.println("[3] - MEDIA ");
        System.out.println("[4] - PEQUENA");
        System.out.println("[5] - BROTO");
        System.out.println("ESCOLHA UM TAMANHO DE PIZZA: ");
        sizePizza.selectSize(entrada.nextInt());

        while (x < sizePizza.QuantitySlices) {
            Scanner entrada2 = new Scanner(System.in);

            System.out.println("SELECIONE UM SABOR DE PIZZA");
            System.out.println("[1] - 5 QUEIJOS");
            System.out.println("[2] - FRANGO CATUPIRY ");
            System.out.println("[3] - CHEDDAR ");
            System.out.println("[4] - CALABRESA");
            System.out.println("[5] - CHOCOLATE ");
            System.out.println("[6] - PRESTIGIO ");
            System.out.println("[7] - SALMAO COM ALCAPARRAS ");
            System.out.println("[8] - CAMARAO ");
            System.out.println("[9] - ABACAXI COM CANELA");
            System.out.println("Insira aqui o sabor da pizza: ");
            flavor.selectFlavor(entrada2.nextInt());
            x++;
        }
        
        if (sizePizza.validador == 0){
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("GOSTARIA DE ADICIONAR BORDA EM SUA PIZZA?");
        System.out.println("[1] - SIM");
        System.out.println("[2] - NAO");
        edgeFlavor.validarBorda(entrada3.nextInt());
        }else{
            
        }

        double valor;
        if (edgeFlavor.validador == 1) {
            valor = sizePizza.PriceWithBorder;
        } else {
            valor = sizePizza.BorderlessPrice;
        }

        while (drink.validador == 1) {
            Scanner entrada4 = new Scanner(System.in);
            System.out.println("GOSTARIA DE ALGUMA BEBIDA?");
            System.out.println("[1] - SIM");
            System.out.println("[2] - NAO");

            drink.validarDrink(entrada4.nextInt());
        }

        valorTotal = valor + flavor.valorSabor + edgeFlavor.valorBorda + drink.valorDrink;

        System.out.println("TAMANHO SELECIONADO: " + sizePizza.Size);
        System.out.println("SABORES ESCOLHIDOS: " + flavor.listaSabores);
        System.out.println("BORDA COM: " + edgeFlavor.border);
        System.out.println("BEBIDA SELECIONADA E: " + drink.listaBebidas);
        System.out.println("TOTAL DO PEDIDO: " + valorTotal);

    }
}