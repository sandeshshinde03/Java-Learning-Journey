class Bank {
    int balance = 5000;

    void withdraw(int amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdraw Success. Remaining: " + balance);
    }
}