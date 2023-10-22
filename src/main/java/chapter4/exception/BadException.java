package chapter4.exception;

public class BadException extends Exception{
    public BadException() {
        super("안좋은 예외");
    }
}
