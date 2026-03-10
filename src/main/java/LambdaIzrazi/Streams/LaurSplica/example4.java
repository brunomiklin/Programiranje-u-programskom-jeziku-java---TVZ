package LambdaIzrazi.Streams.LaurSplica;

import java.util.List;

public class example4 {
    static void main() {
        List<Integer> list = List.of(1,5,6,3,8,9);

//        try{
            list.stream()


                    .forEach(x->{

                        try {
                            m(x); // try-catch unutar forEacha(), a ne okolambde
                        }catch (Exception e){

                        }

                    });
//        }catch (Exception e){}

    }

    static void m(int x) throws Exception{
        if(x%2==0){
            throw new Exception("Greška");
        }
    }
}
