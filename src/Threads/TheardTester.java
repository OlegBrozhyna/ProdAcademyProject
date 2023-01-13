package Threads;

public class TheardTester {
    public static void main(String[] args) {
        Runnable theadjob = new MyRunnable();
        Thread meThread = new Thread(theadjob);
        meThread.start();
        System.out.println("back to main");
    }
}


