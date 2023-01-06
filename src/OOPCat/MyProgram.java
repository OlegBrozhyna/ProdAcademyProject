package OOPCat;

public class MyProgram {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name = "Bembi";
        cat1.color = "Black";
        cat1.weight = 5;
        System.out.println(cat1.meow());
        System.out.println(cat1.name);
        System.out.println(cat1.toString());
        cat1.jump();
        cat1.meow();

        Cat cat2 = new Cat("Joni", "White");

        System.out.println(cat1);
        System.out.println(cat2);

        // Користувацькі типи посилань ( Використання статичних методів)
          Cat cat3 =getCatWhite();

          System.out.println(cat3);

          Cat[] cats = new Cat[]{cat1,cat2,cat3};
          for (Cat cat: cats){
            System.out.println(cat);

            }
          }
          public static String getCatName(Cat cat){
              return cat.name;
          }
          public static Cat getCatWhite(){
            Cat cat= new Cat("", "white");
              return cat;
        //  }
    }
}
