package Task1;

import Task2.Currency;

/**
 * Created by Guillaume Gingembre on 15/02/2017.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                     double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    // declare these methods to implement them, but I do not know yet what they will do

    public int getLimitOfWithdrawal() {
        return 0;
    }

    public int getLimitOfFunding() {
        return 0;
    }

    public int getMonthlyRate() {
        return 0;
    }

    public int getCommission(int summ) {
        return 0;
    }

}
