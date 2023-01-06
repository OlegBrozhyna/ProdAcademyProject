package OOPCar;

import OOPCat.Cat;

public class MyProgram {
    public static void main(String[] args) {
        Car car= new Car("blue",1300,2011);

      //  car.color = "Blue";
      //  car.weight = 1300;
      //  car.year = 2011;
      //  car.acelerations(50);

        car.setColor("Blue");
        car.setWeight(1300);
        car.setYear(2011);
        car.acelerations(50);

        System.out.println(car.getColor());
        System.out.println(car.getWeight());
        System.out.println(car.getYear());

        System.out.println();

        System.out.println(car);


    }
}
