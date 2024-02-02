public class FixedDepositAccount extends BankAccount {

    public double interest;
    public double duration; 

    public FixedDepositAccount(String holderName, double balance) {
        super(holderName, balance); 
    }

    public FixedDepositAccount(String holderName, double balance, double interest) {
        super(holderName, balance); 
        this.interest = interest;
    }

    public FixedDepositAccount(String holderName, double balance, double interest, double duration) {
        super(holderName, balance); 
        this.interest = interest;
        this.duration = duration;
    }

    @Override
    public void deposit (double amount) {
        System.err.println("Operations not allowed");
    }

    @Override
    public void withdraw(double amount) {
        System.err.println("Operations not allowed");
    }
}

