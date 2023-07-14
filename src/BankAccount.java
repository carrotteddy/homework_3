public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withdraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Сумма превышает баланс", amount);
        }
        amount -= sum;
    }
}
