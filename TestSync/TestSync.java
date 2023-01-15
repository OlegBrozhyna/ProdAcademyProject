package TestSync;

public class TestSync implements Runnable {
    private int balance;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            increment(); {
                System.out.println("balance one is - " + balance);
                System.out.println("Balance two is - " + balance);

            }
        }
    }

    private void increment() {
        int i = balance;
        balance = i+1;


    }
}

class TestDrive {
    public static void main(String[] args) {
        TestSync job = new TestSync();
        Thread testOne = new Thread(job);
        Thread testTwo = new Thread(job);
        testOne.start();
        testTwo.start();
    }
}

