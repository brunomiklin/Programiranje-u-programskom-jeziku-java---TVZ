package LambdaIzrazi.MethodReferences;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

class PlainOld{
    private static int last_id = 1;

    private int id;
    public PlainOld() {
        id = last_id++;
        System.out.println("Creating a PlainOld Object id = " + id);

    }
}

public class example2 {
    static void main() {


        calcualtor(Integer::sum,10,25);         //calcualtor((a,b)->a+b,10,25);
        calcualtor(Double::sum,2.5,7.5);        //calcualtor((a,b)->a+b,2.5,7.5);


        Supplier<PlainOld> reference = PlainOld::new; // Supplier<PlainOld> reference1 = ()-> new PlainOld();
        PlainOld pojo = reference.get();

    }
    private static <T> void calcualtor(BinaryOperator<T> function, T a, T b){
        T result = function.apply(a,b);
        System.out.println("Result: " + result);
    }
}
