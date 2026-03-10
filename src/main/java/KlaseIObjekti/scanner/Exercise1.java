package KlaseIObjekti.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Integer broj,brojac=1,sum=0;
        while (brojac<6){
            System.out.print("Unesi broj #" + brojac + ": ");
            try {
                broj = sc.nextInt();
                sum+=broj;
            }catch (InputMismatchException e){
                sc.nextLine();
                continue;
            }
            brojac++;
        }

        System.out.println("Suma iznosi " + sum);
    }
}
