package Task3;

import Task1.Bank;

/**
 * Created by Guillaume Gingembre on 17/02/2017.
 */
public class User {

    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }


    @Override
    public String toString() {
        return "The user ID is: " + id + ";\n" +
                "The user's name is: " + name + ";\n" +
                "The user's balance is: " + balance + ";\n" +
                "The user has been working for " + monthsOfEmployment + " months;\n" +
                "The user's employer is: " + companyName + ";\n" +
                "The user's salary is: " + salary + " ;\n" +
                "The user's bank is: " + bank.getClass().getSimpleName() + " ;\n"; // how can I get just the bank name here?

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
