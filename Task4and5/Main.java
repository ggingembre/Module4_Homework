package Task4and5;

import Task1.ChinaBank;
import Task1.EUBank;
import Task1.USBank;
import Task2.Currency;
import Task3.User;
import Task4and5.BankSystem;
import Task4and5.BankSystemImpl;

/**
 * Created by Guillaume Gingembre on 17/02/2017.
 */
public class Main {
    public static void main(String[] args) {

        // to create the users, we need to create banks. I will create 6 banks, to use all currency configurations

        // 2 EU banks

        EUBank EBankEUR = new EUBank(1234567, "Germany", Currency.EUR, 200, 15000,
                222222221,15000000);

        EUBank EBankUSD = new EUBank(1234567, "France", Currency.USD, 90, 12500,
                222222222,10000000);


        //2 US banks
        USBank UBankUSD = new USBank(123456, "USA", Currency.USD, 120, 15000,
                11111111,100000000);

        USBank UBankEUR = new USBank(123457, "USA", Currency.EUR, 100, 12000,
                111111,90000000);

        //2 China banks
        ChinaBank CBankEUR = new ChinaBank(12345, "China", Currency.EUR, 100, 10000,
                1234567,1000000);

        ChinaBank CBankUSD = new ChinaBank(12346, "China", Currency.USD, 1000, 11000,
                12345678,1100000);




        // create 6 users
        User Igor = new User(100,"Igor",20000,30,"Igor Co",2000, EBankEUR);
        User Anna = new User(101,"Anna",30000,12,"Anna Co",3000, EBankUSD);

        User Joe = new User(200,"Joe",100000,100," IceCream Co",4000, UBankUSD);
        User Jane = new User(201,"Jane",60000,30,"CIA Co",3000, UBankEUR);

        User Ying = new User(301,"Ying",100,20,"Apple",100, CBankUSD);
        User Yang = new User(302,"Yang",200,15,"Happiness Co",50, CBankEUR);


        // printing output for task 5
        System.out.println("The banks are: ");
        System.out.println(EBankEUR);
        System.out.println(EBankUSD);
        System.out.println(UBankEUR);
        System.out.println(UBankUSD);
        System.out.println(CBankEUR);
        System.out.println(CBankUSD);

        System.out.println("The users are: ");
        System.out.println(Igor);
        System.out.println(Anna);
        System.out.println(Joe);
        System.out.println(Jane);
        System.out.println(Ying);
        System.out.println(Yang);

        // task 6 : 4 operations per user
        /**
        void withdrawOfUser(User user, double amount);
        void fundUser(User user, double amount);
        void transferMoney(User fromUser, User toUser, double amount);
        void paySalary(User user);
        */

        // declare framework from which you can call the interface methods
        BankSystemImpl myWorld = new BankSystemImpl();

        myWorld.withdrawOfUser(Igor,1000);
        myWorld.fundUser(Igor,500);
        myWorld.transferMoney(Igor, Anna, 100);
        myWorld.paySalary(Igor);

        myWorld.withdrawOfUser(Anna,100);
        myWorld.fundUser(Anna,1000);
        myWorld.transferMoney(Anna, Yang, 100000);
        myWorld.paySalary(Anna);

        myWorld.withdrawOfUser(Joe,2000);
        myWorld.fundUser(Joe,10000);
        myWorld.transferMoney(Joe, Jane, 1000);
        myWorld.paySalary(Joe);

        myWorld.withdrawOfUser(Jane,100000000);
        myWorld.fundUser(Jane,1000);
        myWorld.transferMoney(Jane, Anna, 1000);
        myWorld.paySalary(Jane);

        myWorld.withdrawOfUser(Ying,1000);
        myWorld.fundUser(Ying,500);
        myWorld.transferMoney(Ying, Anna, 10);
        myWorld.paySalary(Ying);

        myWorld.withdrawOfUser(Yang,100);
        myWorld.fundUser(Yang,5);
        myWorld.transferMoney(Yang, Ying, 90);
        myWorld.paySalary(Yang);

    }

}
