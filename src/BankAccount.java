public class BankAccount {
    private double amount = 0;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount += sum;
    }
    public void withDraw(int sum) throws LimitException{
        if (sum > amount){
            throw new LimitException("Ошибка. Запрашиваемая сумма на снятие больше чем остаток денег на счете" +
                    " который равен: ", amount);
        }else {
            amount = amount - sum;
        }
    }
}
