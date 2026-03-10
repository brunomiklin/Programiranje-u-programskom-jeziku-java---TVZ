package Zbirke.setsAndMaps;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void main() {
        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");

        printData("Email list", emails);
        printData("Phone list", phones);


        Set<Contact> emails2 = new HashSet<>(emails);
        Set<Contact> phones2 = new HashSet<>(phones);

        printData("Email list", emails2);
        printData("Phone list", phones2);
    }
    public static void printData(String header, Collection<Contact> contact){
        System.out.println("_---------------------------------_");
        System.out.println(header);
        System.out.println("_---------------------------------_");
        contact.forEach(System.out::println);
    }
}
