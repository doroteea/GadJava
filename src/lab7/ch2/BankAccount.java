package lab7.ch2;

public class BankAccount {
        private String name;
        private int debit;

        public BankAccount(String name, int debit) {
            this.name = name;
            this.debit = debit;
        }

        synchronized void withdraw(double amount) throws InsufficientFoudException {
            if(amount > debit) {
                throw new InsufficientFoudException();
            }simulateLongDatabaseCall();
            this.debit -= amount;
        }

        void deposit(double amount) {
            simulateLongDatabaseCall();
            this.debit += amount;
        }

        private void simulateLongDatabaseCall() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return "Bank Account named" +
                    name + '\'' +
                    " has debit " + debit;
        }
}
