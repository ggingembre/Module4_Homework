package Task4and5;

import Task3.User;

/**
 * Created by Guillaume Gingembre on 17/02/2017.
 */
public interface BankSystem {

    // I imagine that at this stage (4.4) we do not need to populate this with methods, as no instructions has been given

    void someAbstractMethod1();
    void someAbstractMethod2();

    // Task 5 (4.5)

    void withdrawOfUser(User user, double amount); // amount as double as can be large and decimal
    void fundUser(User user, double amount); // amount as double as can be large and decimal
    void transferMoney(User fromUser, User toUser, double amount); // amount as double as can be large and decimal
    void paySalary(User user);

}
