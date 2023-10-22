package chapter4.hw.operation;

public class SubtractOperation implements AbstractOperation {
    @Override
    public double operate(int num1, int num2) {
        return num1 - num2;
    }
}
