package ColectionsTest;

import java.util.*;

public class LinkedListTest implements Cloneable {
    public int compare(Mountain one, Mountain two){
        return (two.height-one.height);

    }
    public static void main(String[] args) {
        LinkedList<Mountain> mountains = new LinkedList<Mountain>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Marum", 14156));
        mountains.add(new Mountain("KaslRog", 14265));
        System.out.println();
        System.out.println("With out sorting " + mountains);
        System.out.println();
        SortName sortName = new SortName();
        Collections.sort(mountains,sortName);
        System.out.println("Sort Mountain name " + mountains);
        System.out.println();
        SortHeight sortHeight = new SortHeight();
        Collections.sort(mountains,sortHeight);
        System.out.println("Sort Mountain height " + sortHeight);
        System.out.println(mountains);

    }

    }



