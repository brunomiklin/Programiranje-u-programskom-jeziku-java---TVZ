package Zbirke.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    static void main() {
        String[] items = {"apples","bannanas","milk","eggs"};


        List<String> list = List.of(items); // List.of() vraća tip tipa List<>
//        System.out.println(list);

//        System.out.println(list.getClass().getName());
        //list.add("yogurt"); UnsuportedOperationException


        ArrayList<String> groceries = new ArrayList<>(list); // Pretvaranje IMMUTABLE list u MUTTABLE
        groceries.add("yogurt");
//        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles","mustard","cheese")); // konstruktor ArrayList-a prima listu
//        System.out.println(nextList);

        groceries.addAll(List.of("majoneza","krumpir","mustard")); // .addAll() -> prima listu


//        System.out.println("Third item = " + groceries.get(2));


        if(groceries.contains("mustard")){
//            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");
//        System.out.println("First = " + groceries.indexOf("yogurt"));
//        System.out.println("Last = " + groceries.lastIndexOf("yogurt"));


//        System.out.println(groceries);
//        groceries.remove(1);
//        System.out.println(groceries);
//        groceries.remove("yogurt");
//        System.out.println(groceries);


        groceries.removeAll(List.of("apples","eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples","milk","mustard")); // ostavlja sve one koji postoje od ovdje navedenih
        System.out.println(groceries);

        groceries.clear(); // prazni listu
        System.out.println(groceries);
        System.out.println(groceries.isEmpty()); // true


        groceries.addAll(List.of("apples","milk","mustard","cheese"));
        groceries.addAll(Arrays.asList("eggs","pickels","mustard","ham"));

        groceries.sort(Comparator.naturalOrder()); // == groceries.sort(null)
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        GroceryItem[] groceryItems2 = new GroceryItem[]{new GroceryItem("b"),new GroceryItem("d")};
        Arrays.sort(groceryItems2,Comparator.comparing(GroceryItem::name));

    }
}
