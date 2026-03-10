package KlaseIObjekti.instanceMetoda;

import KlaseIObjekti.staticVariable.Animal;

public class Dog extends Animal {

    private static String x = "lol";
    private int x2;
    public Dog(String x){

    }
    public Dog(){
        super();

    }
    public void bark(){
        System.out.println(x);
        System.out.println(x2);
        super.x = "bolacc";
        this.x = "bolac2";
    }
    public static void staticBark(int x){
        System.out.println(x);
        //System.out.println(x2);

    }
}
