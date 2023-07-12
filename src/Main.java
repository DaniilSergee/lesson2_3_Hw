public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Создан новый счет. Денег на счету " + bankAccount.getAmount());
        bankAccount.deposit(15000);
        System.out.println("Баланс пополнен. Денег на счету " + bankAccount.getAmount());

        while (true){
            try{
                bankAccount.withDraw(6000);
                System.out.println("Успешно. Снято 6000. Остаток денег на счету "
                        + bankAccount.getAmount());
            }catch (LimitException e){
                System.out.println(e.getMessage() + e.getRemainingAmount());
                try {
                    bankAccount.withDraw(((int)bankAccount.getAmount()));
                    System.out.println("Снят остаток денег. Остаток денег на счету " + bankAccount.getAmount());
                }catch (LimitException ex){
                    ex.printStackTrace();
                }
                break;
            }
        }
    }
}