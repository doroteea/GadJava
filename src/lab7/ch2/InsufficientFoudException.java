package lab7.ch2;

public class InsufficientFoudException extends Exception{
    public InsufficientFoudException(){
        super("The provided amount exceeds the debit of your account.");
    }
}
