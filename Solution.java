import Task1.Bank;
import Task1.ChinaBank;
import Task1.EUBank;
import Task1.USBank;
import Task2.Currency;
import Task3.User;

/**
 * Created by Guillaume Gingembre on 17/02/2017.
 */
public class Solution {
    public static void main(String[] args) {

        //Task 1:
        // create one object of each class to see if it works

        //public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
        // double avrSalaryOfEmployee, long rating, long totalCapital)

        ChinaBank CBank = new ChinaBank(12345, "China", Currency.EUR, 100, 10000,
                1234567,1000000);

        USBank UBank = new USBank(123456, "USA", Currency.USD, 120, 15000,
                11111111,100000000);

        EUBank EBank = new EUBank(1234567, "France", Currency.EUR, 90, 12500,
                222222222,10000000);

        User Guillaume = new User(111,"Guillaume",10000,20,"GoIT",1000, EBank);


        System.out.println(CBank);
        System.out.println(UBank);
        System.out.println(EBank);
        System.out.println(Guillaume);

    }
}

