package LambdaIzrazi.LambdaIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person(String firstName,String lastName){
        @Override
        public String toString() {
          return firstName + " " + lastName;
        }
    }
    static void main() {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Lucy","Van Pelt"),
                new Person("Sally","Brown"),
                new Person("Linus","Van Pelt"),
                new Person("Peppermint","Patty"),
                new Person("Charlie","Brown")));

        Comparator<Person> comparatorLastName = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        };

        people.sort((o1,o2)->o1.lastName.compareTo(o2.lastName));
        System.out.println(people);


        // Ovo nije @FunctionalInterface jer ima svoju apstraktnu metodu i još jednu nasljedenju apstraktnu metodu
        interface EnhancedComparator<T> extends Comparator<T>{
            int secondLevel(T o1,T o2);
        }
        var comparaterMixed = new EnhancedComparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName.compareTo(o2.lastName);
                return (result==0?secondLevel(o1,o2):result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        };


        people.sort(comparaterMixed);
        System.out.println(people);
    }
}
