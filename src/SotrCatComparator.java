package OOPinterface;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Comparator;

public abstract class SotrCatComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cat cat = (Cat) o1;
        Cat cat1 = (Cat) o2;
        int age = cat.getAge();
        int age1 = cat1.getAge();
        if (age > age1) {
            return 1;
        }
        if (age < age1) {
            return -1;
        }
        return 0;
    }

    public abstract int compare(Cat o1, Cat o2);
}


// @Override
//    public int compare(Object o1, Object o2) {
//        Cat cat = (Cat) o1;
//        Cat cat1 = (Cat) o2;
//        String name1 = cat.getName();
//        String name2 = cat.getName();
//        if (name1.compareTo(name2) > 0) {
//            return 1;
//        }
//        if (name1.compareTo(name2) < 0) {
//            return -1;
//        }
//        return 0;
//
//    }
//}