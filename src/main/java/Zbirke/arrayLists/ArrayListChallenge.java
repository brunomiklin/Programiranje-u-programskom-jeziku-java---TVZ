package Zbirke.arrayLists;

import java.util.*;

public class ArrayListChallenge {
    private static Scanner sc = new Scanner(System.in);
    static void main() {


        boolean flag = true;
        ArrayList<String> grocories = new ArrayList<>();
        while (flag){
            printActions();
            switch (Integer.parseInt(sc.nextLine())){
                case 1 -> addItems(grocories);
                case 2 -> removeItems(grocories);
                default -> flag = false;
            }
            grocories.sort(Comparator.naturalOrder());
            System.out.println(grocories);
        }
    }
    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item[s] sepparataed by comma");
        String[] items = sc.nextLine().split(",");
        groceries.addAll(List.of(items));
    }
    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item[s] sepparataed by comma");
        String[] items = sc.nextLine().split(",");
        groceries.removeAll(List.of(items));
    }

    private static void printActions(){
        String textBlock = """
                Available actions:
                
                0 - shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove item(s) from list (comma delimited list)
                
                Enter a number for wich action you want to do:""";

        System.out.println(textBlock + " ");
    }
}
