package OOPTheardsInheritanceTestingFerm;

import OOPTheardsInheritanceTesting.Cat;
import OOPTheardsInheritanceTesting.Dog;

public class FermProgram implements Runnable {

    public static void main(String[] args) {
        Cat cat = new Cat("milk", "Bembi", "home", 1, 2);
        Dog dog = new Dog("meet", "Lucky", "home", 3, 2);
        Panter panter = new Panter("meet", "Black Jo", "Jungle", 5, 6);
        Tiger tiger = new Tiger("meet", "Sher-Han", "Jungle", 8, 7);
        Wolf wolf = new Wolf("meet", "Akella", "forest", 6, 9);

        Thread cats = new Thread(cat);
        Thread dogs = new Thread(dog);
        Thread panters = new Thread(panter);
        Thread tigers = new Thread(tiger);
        Thread wolves = new Thread(wolf);

        cats.setName(" My name is Bembi im a Cat ");
        dogs.setName(" My name is Lucky im e Dog ");
        panters.setName(" My name is Black-Jo im e Panther ");
        tigers.setName(" My name is Sher-Han im a Tiger ");
        wolves.setName(" My name is Akella im a Wolf ");

        cats.getName();
        dogs.getName();
        panters.getName();
        tigers.getName();
        wolves.getName();

        cats.start();
        dogs.start();
        panters.start();
        tigers.start();
        wolves.start();


        dog.makeNoise();
        dog.name();
        dog.setAge();
        dog.sleep();


        tiger.makeNoise();
        tiger.name();
        tiger.sleep();

        wolf.name();
        wolf.sleep();
        wolf.makeNoise();

        System.out.println();
        
        System.out.println(Thread.currentThread().getName() + " Cat " + cats);
        System.out.println(Thread.currentThread().getName() + " Dog " + dogs);
        System.out.println(Thread.currentThread().getName() + "Panther" + panters);
        System.out.println(Thread.currentThread().getName() + "Tiger " + tigers);
        System.out.println(Thread.currentThread().getName() + " Wolf " + wolves);


        System.out.println();
        
        System.out.println("Cat " + cat);
        System.out.println("Dog " + dog);
        System.out.println("Panter " + panter);
        System.out.println("Tiger " + tiger);
        System.out.println("Wolf" + wolf);


    }

    @Override
    public void run() {

    }
}
