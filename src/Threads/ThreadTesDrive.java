package Threads;

import javax.print.DocFlavor;

class ThreadTesDrive {


    public static void main(String[] args) {
        Runnable therdJob = new MyRunnable();
        Thread myThread = new Thread(therdJob);
        myThread.start();
        System.out.println("Back to main");

        Runnable doJod = new MyRunnable();
        Thread myThread1 = new Thread();
        myThread1.start();
        System.out.println("Go to Thread ");
        


    }
}
