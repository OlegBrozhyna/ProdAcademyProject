package OOPCat;

public class Cat {
    public String name;
    public int weight;
    public String color;

    public Cat(String name, String color){ // написання з конструктором (alt+insert виклик конструктора)
        this.name= name;
        this.weight = weight;
        this.color = color;
    }
    public Cat(){    // створюємо конструктор щоб не було помилки компіляції

    }

    public String meow() {
        return "meow meow";
    }

    public void jump() {
        System.out.println("hop");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}

