package Iznimke;

import java.util.Scanner;

public class BezObradeIznimke {
    public static int podijeli(int x,int y){
        return x/y;
    }
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dva broja: ");

        int prvi = sc.nextInt();
        int drugi = sc.nextInt();
        System.out.println("Rezultat " + podijeli(prvi,drugi));
        sc.close();
    }
}
