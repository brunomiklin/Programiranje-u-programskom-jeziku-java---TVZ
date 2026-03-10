package LambdaIzrazi.LambdaExpressions;

public class Main {
    static void main() {

        int result = calculator((a,b)->a+b,5,2);
        int result2 = calculator(Integer::sum,5,2);
        double result3 = calculator((Double a, Double b)->a*b,25.0,3.2);
    }
    public static <T> T calculator(Operation<T> function, T value1, T value2){
        T result = function.operate(value1,value2);
        return result;
    }
}
