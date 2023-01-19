package ColectionsTetsAnimals;

import java.util.ArrayList;
import java.util.Arrays;

public class TesGenerics1 {
    public static void main(String[] args) {
        new TesGenerics1().go();

    }

    private void go() {

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        takeAnimls (animals);
    }
    public void takeAnimls(ArrayList<Animal>animals){
        for (Animal a: animals) {
            a.eat();
            a.barck();
            a.meow();
            a.sleep();

        }
        
        // Animal[] animals = new Animal[]{new Dog(), new Dog(), new Cat()};
        // Dog[] dogs = new Dog[]{new Dog(), new Dog(), new Dog()};
        //  Cat[]cats = new Cat[]{new Cat(),new Cat(),new Cat()};
        // public void takeAnimls(Animal[]animals){
        //        for (Animal a: animals) {
        //           a.eat();
        //           System.out.println(a);
        //           System.out.println(animals);

    }


}



