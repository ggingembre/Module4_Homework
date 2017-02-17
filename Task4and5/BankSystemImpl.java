package Task4and5;

/**
 * Created by Guillaume Gingembre on 17/02/2017.
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void someAbstractMethod1() {
        System.out.println("hello I am the implementation of abstract method 1. I belong to " + getClass().getSimpleName());
    }

    @Override
    public void someAbstractMethod2() {
        System.out.println("hello I am the implementation of abstract method 2. I belong to " + getClass().getSimpleName());
    }
}
