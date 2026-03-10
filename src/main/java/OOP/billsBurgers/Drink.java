package OOP.billsBurgers;

public class Drink extends SideItem {
    private String size;

    public Drink(String type,double price,String size){
        this.size = size;
        super(type,switch (size){
            case "S"->price*10;
            case "M"->price*20;
            case "L"->price*30;
            default -> {
                size="S";
               yield price*10;
            }
        });
    }

    public void printItem(){

    }
}
