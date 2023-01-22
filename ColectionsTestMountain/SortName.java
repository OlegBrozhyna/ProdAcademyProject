package ColectionsTest;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortName implements Comparator<Mountain> {
    @Override
    public int compare(Mountain one, Mountain two) {
        return one.nane.compareTo(two.nane);


    }
}
