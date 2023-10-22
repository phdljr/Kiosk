package chapter3.hw;

import chapter3.hw.calculator.Calculator;
import chapter3.hw.operation.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperation(new AddOperation());
        System.out.println(calculator.calculate(4, 2));

        calculator.setOperation(new SubtractOperation());
        System.out.println(calculator.calculate(4, 2));

        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(4, 2));

        calculator.setOperation(new DivideOperation());
        System.out.println(calculator.calculate(4, 2));

        calculator.setOperation(new ModuloOperation());
        System.out.println(calculator.calculate(4, 2));
    }
}
