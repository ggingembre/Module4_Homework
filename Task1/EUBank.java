package Task1;

/**
 * Created by Guillaume Gingembre on 15/02/2017.
 */
public class EUBank implements Bank {

    private int limitOfWithdrawal, limitOfFunding, monthlyRate, commission;

    int getLimitOfWithdrawal(){
        return limitOfWithdrawal;
    }

    int getLimitOfFunding(){
        return limitOfFunding;
    }

    int getMonthlyRate(){
        return monthlyRate;
    }


    int getCommission(int summ){
        return summ * commission;
    }

}
