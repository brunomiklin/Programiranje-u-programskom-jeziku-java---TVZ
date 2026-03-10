package Zbirke.Lists;

import java.util.ArrayList;
import java.util.List;

public class example4 {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2
        list.add(1);  // 3
        list.add(20); // 4
        list.add(20); // 5

        for (Integer x:list){
            System.out.println(x);
        }
    }
}
