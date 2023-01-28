package ColectionsComparableCar;

import java.util.Comparator;

public class SortCarName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String brand1 =((Car)o1).getBrand();
        String brand2 =((Car)o2).getBrand();
        return brand2.compareTo(brand1);

    }
}
