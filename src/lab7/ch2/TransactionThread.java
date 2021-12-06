package lab7.ch2;

public class TransactionThread extends Thread {
    private BankAccount from;
    private BankAccount to;
    private int amount;
    private String name;
    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        transfer(from, to, amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        //boolean success = false;
        //synchronized (from) { //locking on intrinsic lock of 'from' Object
        try {
            from.withdraw(amount);
            to.deposit(amount);
        } catch (InsufficientFoudException e) {
            System.out.println("Amount exceeds debit");
        }
        //synchronized (to) { //locking on intrinsic lock of 'to' Object

            //    success = true;
          //  }
        //}
        System.out.println("Transfer "+ name+ " was executed.");
        System.out.println(from);
        System.out.println(to);
        //return success;

    }
}
