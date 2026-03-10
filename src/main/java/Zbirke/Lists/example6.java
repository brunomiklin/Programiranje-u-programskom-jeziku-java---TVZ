package Zbirke.Lists;

import java.util.ArrayList;
import java.util.List;

public class example6 {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2
        list.add(1);  // 3
        list.add(20); // 4
        list.add(20); // 5

        //list.remove(10); // ovo briše po indexu --> IndexOutOfBoudsException
        list.remove((Integer) 10);
        System.out.println(list); // [20, 30, 1, 20, 20]
    }
}
