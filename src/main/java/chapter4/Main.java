package chapter4;

import chapter4.exception.BadException;
import chapter4.logic.Test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.printSomething(true);
            System.out.println("try");
        } catch (BadException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
            return;
        }
    }
}
