package KlaseIObjekti.account;

public class Account {
    private String accountNumber;
    private Double accountBalance=0.0;
    private String customerName;
    private String email;
    private String phoneNumber;


    public Account(){
        System.out.println("Empty constructor called");
        this("56789",2.20,"Default name","Default email","Default phone");
    }

    public Account(String number,double balance,String customerName,String email,String phone){
        System.out.println("Account constructor with parametars called");
        setAccountNumber(number);
        this.accountBalance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void depostiFunds(double amount){
        this.accountBalance += amount;
        System.out.println("Dodanih " + amount + "$ na račun. Iznos na raučunu " + this.accountBalance);
    }

    public void withdrawFunds(double amount){
        double temp = this.accountBalance-amount;
        if(temp<0){
            System.out.println("Ne možete otići u minus!");
        }else {
            this.accountBalance-=amount;
            System.out.println("Oduzeto " + amount + "$ sa računa. Iznos na raučunu " + this.accountBalance);
        }
    }
}
