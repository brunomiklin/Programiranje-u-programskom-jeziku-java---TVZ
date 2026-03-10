package Zbirke.enums;

public enum Topping {

    MUSTARD(1.5),
    PICKELS(1.0),
    BACON(1.2),
    CHEDDAR(1.1),
    TOMMATO(1.7);

    private double price;

    Topping(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFakePrice(){
       return switch (this){
           case MUSTARD -> 1.5;
           case PICKELS -> 1.0;
           case BACON -> 1.2;
           case CHEDDAR -> 1.1;
           case TOMMATO -> 1.7;
       };
    }
}
