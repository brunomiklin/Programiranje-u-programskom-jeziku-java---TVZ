package Zbirke.arrayLists;

import java.util.ArrayList;
import java.util.Comparator;

record GroceryItem(String name,String type,int count) implements Comparator<GroceryItem> {

    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s",count,name.toUpperCase(),type);
    }


    @Override
    public int compare(GroceryItem o1, GroceryItem o2) {
       return o1.count-o2.count;
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}

public class ArrayLists {
    static void main() {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","PRODUCE",6);
        groceryArray[2] = new GroceryItem("oranges","PRODUCE",5);
        //System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList(); // RAW-USE of a type
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");


        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("Butter"));
        groceryItems.add(new GroceryItem("milk"));
        groceryItems.add( new GroceryItem("oranges","PRODUCE",5));
        groceryItems.set(0,new GroceryItem("apples","PRODUCE",6));
        System.out.println(groceryItems);


        // .add(0, ...) će dodati na početak i ove sve pomakni u desno
        // .set(0, ...) će zamjeniti item na indeksu 0

    }
}
