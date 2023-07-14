public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(15000);

        System.out.println("Текущий депозит: " + account1.getAmount() + " сом");
        try {
            while (true) {
                try {
                    account1.withdraw(6000);
                } catch (LimitException e) {
                    double remainingAmount = e.getRemainingAmount();
                    account1.withdraw((int) remainingAmount);
                    System.out.println("Снято: " + remainingAmount + " сом");
                    break;
                }
                System.out.println("Снято: 6000 сом");
            }
        } catch (LimitException e) {
            System.out.println("Оставшаяся сумма на счете: " + account1.getAmount() + " сом");
        }
        System.out.println("Текущий депозит: " + account1.getAmount() + " сом");
    }
}
