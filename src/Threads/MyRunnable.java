package Threads;

public class MyRunnable implements Runnable {


    @Override
    public void run() {
        go();
        {

        }
    }


    public void go() {
        System.out.println("Finfsh work");
        doMore();

    }

    public void doMore() {
        System.out.println("Tap the stack");

    }
}




