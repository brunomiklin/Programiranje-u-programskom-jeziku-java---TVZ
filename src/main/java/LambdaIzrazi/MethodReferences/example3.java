package LambdaIzrazi.MethodReferences;

import java.util.function.BinaryOperator;

public class example3 {
    static void main() {

        //calcualtor((s1,s2)->s1+s2,"Hello ","World");
        //calcualtor((s1,s2)->s1.concat(s2),"Hello ","World");
        calcualtor(String::concat,"Hello ", "World"); // concat() -> je instance metoda

    }
        private static <T> void calcualtor(BinaryOperator<T> function, T a, T b){
        T result = function.apply(a,b);
        System.out.println("Result: " + result);
    }
}
