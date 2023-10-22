package chapter4.logic;

import chapter4.exception.BadException;

public class Test {
    public void printSomething(boolean occurException) throws BadException{
        if(occurException){
            throw new BadException();
        }
        System.out.println("출력");
    }
}
