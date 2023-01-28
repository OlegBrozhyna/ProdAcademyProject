package ColectionsComparableCar;

public class Car { // implements Comparable {
    private String brand;
    private String name;
    private String color;

    private int price;
    private int speed;

    private int weight;

    public Car(String brand, String name, String color, int price, int speed, int weight) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }

  //  @Override
//    public int compareTo(Object o) {
//        if (this.price > ((Car) o).price) {
//            return 1;
//        } else if (this.price < ((Car) o).price) {
//            return -1;
//        } else {
//            return 0;
//        }
// }
}
