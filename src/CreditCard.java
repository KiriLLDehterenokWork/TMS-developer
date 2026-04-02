public class CreditCard {
    private long accountNumber;
    private double currentAmount = 0;

    public CreditCard(long accountNumber, double initialAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = initialAmount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public double getCurrentAmount(){
        return currentAmount;
    }

    public void addMoney(double amount){
        if(amount > 0){
            currentAmount += amount;
            System.out.println("На карту " + getAccountNumber() + " зачислено " + amount + " руб.");
        }else{
            System.out.println("Сумма зачисления должна быть положительной.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0){
            if(currentAmount >= amount){
                currentAmount -= amount;
                System.out.println("С карты " + getAccountNumber() + " снято " + amount + "руб.");
            }else{
                System.out.println("Недостаточно средств на карте " + getAccountNumber() + ", попробуйте еще раз.");
            }
        }else{
            System.out.println("Сумма снятия не может быть отрицательной.");
        }
    }

    public void displayInfo(){
        System.out.println("Номер карты " + getAccountNumber());
        System.out.println("Текущая сумма " + getCurrentAmount() + "руб.");
    }
}
