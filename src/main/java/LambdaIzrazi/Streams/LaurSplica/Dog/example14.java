package LambdaIzrazi.Streams.LaurSplica.Dog;

import java.util.List;

public class example14 {
    static void main() {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        list.stream() // 1,2,3,4,5,6,7,8,9,10
                .peek(System.out::print) // 1,2,3,4,5,6,7,8,9,10
                .filter(n-> n%2==0) // 2,4,6,8,10
                .forEach(System.out::print); // 2,4,6,8,10
        //1 2 2 3 4 4 5 6 6 7 8 8 9 10 10


        // .peek(n->output.add(n)) --> nije preopručljivo zbog SIDE EFFECTSA
    }
}
