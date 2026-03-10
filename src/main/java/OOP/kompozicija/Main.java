package OOP.kompozicija;

public class Main {
    static void main() {
            ComputerCase theCase = new ComputerCase("2208","Dell","240");
            Monitor monitor = new Monitor("27inch Beast","Acer",27,"2540 x 1440");
            MotherBoard motherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.4.4");
            PersonalComputer thePC = new PersonalComputer("2208","Dell",monitor,motherBoard,theCase);


//            thePC.getMonitor().drawPixelAt(10,10,"red");
//            thePC.getMotherBoard().loadProgram("Windows OS");
//            thePC.getComputerCase().presPowerButton();
        thePC.drawLogo();
    }
}
