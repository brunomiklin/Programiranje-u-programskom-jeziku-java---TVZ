package OOP.kompozicija;

public class PersonalComputer extends Product{
    private Monitor monitor;
    private MotherBoard motherBoard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer,
                            Monitor monitor, MotherBoard motherBoard,
                            ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.computerCase = computerCase;
    }

    public void drawLogo(){
        monitor.drawPixelAt(120,50,"Logo");
    }
    public Monitor getMonitor() {
        return monitor;
    }



    public MotherBoard getMotherBoard() {
        return motherBoard;
    }



    public ComputerCase getComputerCase() {
        return computerCase;
    }


}
