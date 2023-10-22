package chapter4.hw;

import chapter4.hw.operation.*;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        if (!Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException("정수값");
        }

        calculator.setFirstNumber(Integer.parseInt(firstInput));

        // 해당 인스턴스의 설정 값이 바꼈기 때문에, 이를 내보냄으로써 필요하다면 쓰일 수 있도록 하는 용도
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {
        if (!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("정수값");
        }

        calculator.setSecondNumber(Integer.parseInt(secondInput));
        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("사칙연산자(를)");
        }

        switch (operationInput) {
            case "+" -> calculator.setOperation(new AddOperation());
            case "-" -> calculator.setOperation(new SubtractOperation());
            case "*" -> calculator.setOperation(new MultiplyOperation());
            case "/" -> calculator.setOperation(new DivideOperation());
            case "%" -> calculator.setOperation(new ModuloOperation());
        }

        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
