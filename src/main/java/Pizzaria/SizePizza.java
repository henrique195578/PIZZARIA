package Pizzaria;

public class SizePizza {

    int QuantitySlices;
    double BorderlessPrice;
    double PriceWithBorder;
    String Size;
    int validador = 0;
    EdgeFlavor edgeflavor = new EdgeFlavor();

    public int selectSize(int op) {

        switch (op) {
            case 1:
                QuantitySlices = 5;
                Size = "GIGANTE";
                BorderlessPrice = 75;
                PriceWithBorder = 80;
                break;

            case 2:
                QuantitySlices = 4;
                Size = "FAMILIA";
                BorderlessPrice = 66;
                PriceWithBorder = 69.5;
                break;

            case 3:
                QuantitySlices = 3;
                Size = "MEDIA";
                BorderlessPrice = 52;
                PriceWithBorder = 56.5;
                break;

            case 4:
                QuantitySlices = 3;
                Size = "PEQUENA";
                BorderlessPrice = 42;
                PriceWithBorder = 44.5;
                break;

            case 5:
                QuantitySlices = 2;
                Size = "BROTO";
                BorderlessPrice = 28;
                validador = 1;
                break;
        }
        return QuantitySlices;
    }
}