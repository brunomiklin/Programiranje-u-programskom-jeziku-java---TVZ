package KlaseIObjekti.account;

public class Main {
    static void main() {
        Account bobsAccount = new Account();
        //Account bobsAccount = new Account("12345",10000.0,"Bob brown","myemail@gn.con","09965594229");
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depostiFunds(250.0);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);
    }
}
