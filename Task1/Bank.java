package Task1;

import Task2.Currency;

/**
 * Created by Guillaume Gingembre on 15/02/2017.
 */

public abstract class Bank {
    //declare fields
    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    // declare constructor with all fields

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    //declare abstract methods
    abstract int getLimitOfWithdrawal();
    abstract int getLimitOfFunding();
    abstract int getMonthlyRate();
    abstract int getCommission(int summ);

    // declare non abstract methods
    double moneyPaidMonthlyForSalary(){
           return numberOfEmployees * avrSalaryOfEmployee;
            }


    // Print method

    @Override
    public String toString() {
        return "The bank ID is: " + id + ";\n" +
        "The bank country is: " + bankCountry + ";\n" +
        "The bank reporting currency is: " + currency + ";\n" +
        "The bank employs " + numberOfEmployees + " people;\n" +
        "The average salary of the employees is:" + avrSalaryOfEmployee + ";\n" +
        "The bank's rating is:" + rating + " ;\n" +
        "The bank's total capital is:" + totalCapital + " ;\n";
    }


    // declare get and set methods

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

}
