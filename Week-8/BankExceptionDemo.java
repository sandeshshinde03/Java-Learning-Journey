public class BankExceptionDemo {
    public static void main(String[] args) {
        Bank b = new Bank();
        try {
            b.withdraw(7000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}