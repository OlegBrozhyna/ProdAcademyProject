package ColectionsComparableCar;

import java.util.Arrays;

public class MyProgramCarComparable {
    public static void main(String[] args) {


        Car[] myCar = {new Car("Toyota", "Camry", "Black", 35000, 240, 1300),
                new Car("Porsche", "Cayenne GTS", "Black", 125000, 280, 2500),
                new Car("Wolksvagen", "Golf", "Black", 38000, 250, 1300),
                new Car("Mercedes-Benz", "GL 5500", "Black", 89000, 320, 1500),
                new Car("Audi", "Q8", "Black", 95000, 290, 2600)};



        Arrays.sort(myCar, new SortCarName());
        for (Car car : myCar) {
            System.out.println(car);


        }
    }
}