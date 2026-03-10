package OOP.nasljedivanje.worker;

import java.time.LocalDate;

public class Employe extends Worker{
    private long employeeid;
    private String hireDate;

    private static int emploeyeNumber=1;

    public Employe(String name, LocalDate birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeid = Employe.emploeyeNumber++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "employeeid=" + employeeid +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
