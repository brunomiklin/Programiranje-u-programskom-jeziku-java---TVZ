package OOP.enkapsulacija.printer;

public class Main {
    static void main() {
        Printer printer = new Printer(50,true);
        System.out.println("inital page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.println("inital page count = " + printer.getPagesPrinted());

    }
}
