package Zbirke.Predavanja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    static void main() {
        List<Integer> brojevi = Arrays.asList(1,2,3,4,5);

        // Tradicionalni pristum
        Integer sum =0;
        for(Integer broj:brojevi){
            if(broj%2==0){
                sum+= broj;
            }

        }


        // Stream API pristup
         sum = brojevi.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum();



    }
}
