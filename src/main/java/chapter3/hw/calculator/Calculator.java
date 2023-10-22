package chapter3.hw.calculator;

import chapter3.hw.operation.AbstractOperation;

public class Calculator {
    private AbstractOperation operation;

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int num1, int num2){
        return operation.operate(num1, num2);
    }
}
