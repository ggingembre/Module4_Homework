package Task1;

import Task2.Currency;

/**
 * Created by Guillaume Gingembre on 15/02/2017.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                     double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    /** set variables
     лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
     лимит пополнения - 10000, если EUR, и нет лимита, если USD
     месячная ставка - 1% на USD и 2% на EUR
     комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
     6%, если EUR и до 1000 и 8%, если EUR и больше 1000
     */

    private double limitWithdrawalEUR = 1200; // double as amount can be higher than 127
    private double limitWithdrawalUSD = 1000; // double as amount can be higher than 127
    private double limitDepositEUR = 20000; // double as amount can be higher than 127
    private double limitDepositUSD = 1000000000; // double as amount can be higher than 127
    private double monthlyRateEUR = 0.02; // double as amount can be decimal
    private double monthlyRateUSD = 0.01; // double as amount can be decimal
    private double commHighEUR = 0.08; // double as amount can be decimal
    private double commHighUSD = 0.07; // double as amount can be decimal
    private double commLowEUR = 0.06; // double as amount can be decimal
    private double commLowUSD = 0.05; // double as amount can be decimal
    private double highAmountUSD = 1000; // double as amount can be higher than 127
    private double highAmountEUR = 1000; // double as amount can be higher than 127

    // declare these methods to implement them, but I do not know yet what they will do

    @Override
    public double getLimitOfWithdrawal() {
        double l = 0;

        if (getCurrency() == Currency.USD){
            l = limitWithdrawalUSD;
        } else if (getCurrency() == Currency.EUR){
            l = limitWithdrawalEUR;
        }
        return l;
    }

    @Override
    public double getLimitOfFunding() {
        double l = 0;

        if (getCurrency() == Currency.USD){
            l = limitDepositUSD;
        } else if (getCurrency() == Currency.EUR){
            l = limitDepositEUR;
        }
        return l;
    }

    @Override
    public double getMonthlyRate() {
        double l = 0;

        if (getCurrency() == Currency.USD){
            l = monthlyRateUSD;
        } else if (getCurrency() == Currency.EUR){
            l = monthlyRateEUR;
        }
        return l;
    }

    @Override
    public double getCommission (double summ) {
        double l = 0;

        if (getCurrency() == Currency.USD){
            if (summ <= highAmountUSD){
                l = commLowUSD;
            } else {
                l = commHighUSD;
            }
        } else if (getCurrency() == Currency.EUR){
            if (summ <= highAmountEUR){
                l = commLowEUR;
            } else {
                l = commHighEUR;
            }
        }
        return l * summ;
    }

}
