package Task4and5;

import Task1.Bank;
import Task3.User;

/**
 * Created by Guillaume Gingembre on 17/02/2017.
 */
public class BankSystemImpl implements BankSystem {

    // task 4.4
    @Override
    public void someAbstractMethod1() {
        System.out.println("hello I am the implementation of abstract method 1. I belong to " + getClass().getSimpleName());
    }

    @Override
    public void someAbstractMethod2() {
        System.out.println("hello I am the implementation of abstract method 2. I belong to " + getClass().getSimpleName());
    }

    // task 4.5
    @Override
    public void withdrawOfUser(User user, double amount){
        double balance, w;
        Bank bank;

        // get balance and bank of user
        balance = user.getBalance();
        bank = user.getBank();

        // restate amount with commissions
        w = amount + bank.getCommission(amount);

        // check if amount is higher than balance or higher than authorized maximum

        if (balance > bank.getLimitOfWithdrawal()){
            System.out.println("You cannot withdraw this amount. Maximum authorized withdrawal is " + bank.getLimitOfWithdrawal());
        } else if (w > balance){
            System.out.println("Your balance is too low to withdraw " + amount +". Your balance is: " + balance);
        }else{
            user.setBalance(balance - w);
            System.out.println("Please take your cash.\nYou have withdrawn" +
            amount+". Your commissions for this transaction were " + bank.getCommission(amount) +
            ".\nYour new balance is: " + user.getBalance()+".\nThank you for your business.");
        }

    }

    @Override
    public void fundUser(User user, double amount){
        double balance, w;
        Bank bank;

        // get balance and bank of user
        balance = user.getBalance();
        bank = user.getBank();

        // restate amount with commissions
        w = amount - bank.getCommission(amount);

        // check if amount is higher than authorized maximum

        if (balance > bank.getLimitOfFunding()){
            System.out.println("You cannot fund this amount. Maximum authorized funding is " + bank.getLimitOfFunding());
        } else{
            user.setBalance(balance + w);
            System.out.println("You have deposited " +
                    amount+". Your commissions for this transaction were " + bank.getCommission(amount) +
                    ".\nYour new balance is: " + user.getBalance()+".\nThank you for your business.");
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, double amount){
        double balanceFrom, balanceTo, wFrom, wTo;
        Bank bankFrom, bankTo;

        // get balance and bank of user sending money
        balanceFrom = fromUser.getBalance();
        bankFrom = fromUser.getBank();

        // get bank of user receiving money and balance
        balanceTo = toUser.getBalance();
        bankTo = toUser.getBank();

        // get full amount of transfer, with commissions
        wFrom = amount + bankFrom.getCommission(amount);
        wTo = amount - bankTo.getCommission(amount);

        // check if transaction allowed (balance, withdrawal limit, deposit limit)
        // if transaction allowed, proceed with transaction (withdraw, credit, and print message).

        if (wFrom > bankFrom.getLimitOfWithdrawal()){
            System.out.println("You cannot withdraw this amount. Maximum authorized withdrawal is " + bankFrom.getLimitOfWithdrawal());
        } else if (wFrom > balanceFrom){
            System.out.println("Your balance is too low to transfer " + amount +". Your balance is: " + balanceFrom);
        }else if (wTo > bankTo.getLimitOfFunding()){
            System.out.println("You cannot credit this amount to beneficiary. Maximum authorized funding is " + bankTo.getLimitOfFunding());
        } else {
            // set balances
            fromUser.setBalance(balanceFrom - wFrom);
            toUser.setBalance(balanceTo + wTo);
            // print success message
            System.out.println("Transaction is complete: " + fromUser.getName() + " has transferred " + amount + " to " +
            toUser.getName() + ".\n" + fromUser.getName() + ", you have paid " + bankFrom.getCommission(amount) +
            " in commissions and your new balance is now: " + fromUser.getBalance() + ".\n"+
                    toUser.getName() + ", you have paid in commissions " + bankTo.getCommission(amount) +
                    " and your new balance is now: " + toUser.getBalance() + ".");
        }
    }

    @Override
    public void paySalary(User user){

        // credit salary to account
        fundUser(user, (double) user.getSalary());
    }
}
