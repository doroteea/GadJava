package lab4.exceptions.ex1;

public class DivByZeroException extends RuntimeException{
    public DivByZeroException() {
        super("Can't calculate the salary for 0 hours");
    }
}
