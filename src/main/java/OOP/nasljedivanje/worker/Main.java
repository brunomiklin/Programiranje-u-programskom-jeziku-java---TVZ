package OOP.nasljedivanje.worker;

import java.time.LocalDate;

public class Main {
    static void main() {
        Employe tim = new Employe("Tim", LocalDate.of(1985,11,11),"01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        Employe tim2 = new Employe("Tim", LocalDate.of(1985,11,11),"01/01/2020");
        System.out.println(tim2);
        System.out.println("Age = " + tim2.getAge());
        System.out.println("Pay = " + tim2.collectPay());
    }
}
