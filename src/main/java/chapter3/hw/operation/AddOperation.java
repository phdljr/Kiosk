package chapter3.hw.operation;

public class AddOperation implements AbstractOperation{
    @Override
    public double operate(int num1, int num2) {
        return num1 + num2;
    }
}
