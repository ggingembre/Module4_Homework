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

    /** set variables
     лимит снятия = 2000, если валюта - USD и 2200, если EUR
     лимит пополнения - 20000, если EUR и 10000, если USD
     месячная ставка - 0% на USD и 1% на EUR
     комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
     2%, если EUR и до 1000 и 4%, если EUR и больше 1000
     */
    private double limitWithdrawalEUR = 2200; // double as amount can be higher than 127
    private double limitWithdrawalUSD = 2000; // double as amount can be higher than 127
    private double limitDepositEUR = 20000; // double as amount can be higher than 127
    private double limitDepositUSD = 10000; // double as amount can be higher than 127
    private double monthlyRateEUR = 0.01; // double as amount can be decimal
    private double monthlyRateUSD = 0.0; // double as amount can be decimal
    private double commHighEUR = 0.04; // double as amount can be decimal
    private double commHighUSD = 0.07; // double as amount can be decimal
    private double commLowEUR = 0.02; // double as amount can be decimal
    private double commLowUSD = 0.05; // double as amount can be decimal
    private double highAmountUSD = 1000; // double as amount can be higher than 127
    private double highAmountEUR = 1000; // double as amount can be higher than 127

    // declare these methods to implement them, but I do not know yet what they will do

    public double getLimitOfWithdrawal() {
        double l = 0;

        if (getCurrency() == Currency.USD){
            l = limitWithdrawalUSD;
        } else if (getCurrency() == Currency.EUR){
            l = limitWithdrawalEUR;
        }
        return l;
    }

    public double getLimitOfFunding() {
        double l = 0;

        if (getCurrency() == Currency.USD){
            l = limitDepositUSD;
        } else if (getCurrency() == Currency.EUR){
            l = limitDepositEUR;
        }
        return l;
    }

    public double getMonthlyRate() {
        double l = 0;

        if (getCurrency() == Currency.USD){
            l = monthlyRateUSD;
        } else if (getCurrency() == Currency.EUR){
            l = monthlyRateEUR;
        }
        return l;
    }

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
