package TherdsBankAccount;

public class FamilyBankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;

    }
    public void vithdraw(int amount){
        balance = balance-amount;


    }
}
