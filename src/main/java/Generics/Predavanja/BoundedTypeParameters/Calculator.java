package Generics.Predavanja.BoundedTypeParameters;

public class Calculator <T extends Number>{

    public double add(T a,T b){
        return a.doubleValue()+b.doubleValue();
    }

    public double multiply(T a,T b){
        return a.doubleValue()*b.doubleValue();
    }
}
