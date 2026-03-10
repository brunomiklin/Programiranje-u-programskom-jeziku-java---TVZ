package OOP.nasljedivanje.worker;

import java.time.LocalDate;

public class SalariedEmployee extends Employe{

    private boolean retaired = false;
    private double annualSalary;

    public SalariedEmployee(String name,LocalDate birthDate,String hireDate,double annualSalary){
        super(name,birthDate,hireDate);
        this.annualSalary = annualSalary;
    }

    public void retaire(){
        retaired =true;
    }

    public boolean isRetaired(){
        return this.retaired;
    }

    @Override
    public double collectPay(){
        return (int)annualSalary/26;
    }
}
