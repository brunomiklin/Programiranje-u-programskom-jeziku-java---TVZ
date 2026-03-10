package Zbirke.ComparableComparator.example1;

public class Cat implements Comparable<Cat> {

    private int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        // < 0      if this < o
        // == 0     if this == o
        // > 0      if this > o
//
//        if(this.age>o.getAge()){
//            return 1;
//        }else if(this.age==o.age){
//            return 0;
//        }
//            return -1;
//

        return this.age-o.age; // ovo je sad uzlazno
    }

}
