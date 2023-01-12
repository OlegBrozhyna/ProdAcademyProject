package TherdsBankAccount;

public class FamilyAccount implements Runnable {

    private FamilyBankAccount bankAccount = new FamilyBankAccount();

    public static void main(String[] args) {
        FamilyAccount familyAccount = new FamilyAccount();
        Thread husband = new Thread(familyAccount);
        Thread wife = new Thread(familyAccount);
        husband.setName(" Alex ");
        wife.setName(" Olga ");
        husband.start();
        wife.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            makePay(10);
            if (bankAccount.getBalance() < 0) {
                System.out.println(" Owerdrow ");
            }
        }

    }

    private synchronized void makePay(int amout) {
        if (bankAccount.getBalance() >= amout) {
            System.out.println(Thread.currentThread().getName() + " the phone rang ");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to shop ");
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " buy products ");
            bankAccount.vithdraw(amout);
            System.out.println(Thread.currentThread().getName() + " complete the with pay ");
        } else {
            System.out.println(" Sorry not enoug for " + Thread.currentThread().getName());
        }
    }
}

