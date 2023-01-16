package Movie;

import ThreadAccum.TheardTwo;

public class MovieProgam implements Runnable{
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = " Gone with the Stock ";
        one.gengre = " Tragic ";
        one.rating = 3;

        Movie two = new Movie();
        two.title = " Lost in Cubicle Space ";
        two.gengre = " Comedy ";
        two.rating = 5;

        Movie three = new Movie();
        three.title  = "Fire Dotp";
        three.gengre = "Tragic and Comedy ";
        three.rating = 10;

        Thread movieOne = new Thread(one);
        Thread movietwo = new Thread(two);
        Thread movieThree = new Thread(three);

        movieOne.setName("Gone with the Stock");
        movietwo.setName("Lost in Cubicle Space ");
        movieThree.setName("Fire Dotp");
        movieOne.getName();
        movietwo.getName();
        movieThree.getName();
        movieOne.start();
        movietwo.start();
        movieThree.start();

        one.playIt();
        one.rating();
        one.gengre();
        two.playIt();
        two.rating();
        two.gengre();
        three.playIt();
        three.rating();
        three.gengre();

        System.out.println();
        System.out.println(one);
        System.out.println(three);
        System.out.println(two);
        System.out.println();
        System.out.println(Thread.currentThread().getName()+ one);
        System.out.println(Thread.currentThread().getName() + two);
        System.out.println(Thread.currentThread().getName() + three);
    }


    @Override
    public void run() {

    }
}
