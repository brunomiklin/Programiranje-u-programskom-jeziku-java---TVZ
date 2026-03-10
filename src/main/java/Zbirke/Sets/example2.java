package Zbirke.Sets;

import java.util.Set;

public class example2 {
    static void main() {
//         Set<Integer> set1 = Set.of(10,1000,23,1000,300,256); --> IlegalArgumentException

        Set<Integer> set1 = Set.of(10,1000,23,300,256);

        for (Integer x : set1){
            System.out.println(x);
        }
    }
}
