package ColectionsTest;

import java.util.Comparator;

public class SortHeight implements Comparator<Mountain> {
    @Override
    public int compare(Mountain one, Mountain two) {
        return two.height-one.height;
    }
}
