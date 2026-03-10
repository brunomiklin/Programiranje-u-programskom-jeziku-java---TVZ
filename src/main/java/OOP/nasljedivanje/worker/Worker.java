package OOP.nasljedivanje.worker;

import java.time.LocalDate;

public class Worker {
    private String name;
    private LocalDate birthDate;
    protected String endDate;

    public Worker(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public Worker(){
    }

    public int getAge(){

        int age = LocalDate.now().getYear()-birthDate.getYear();
        return age;
    };

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
