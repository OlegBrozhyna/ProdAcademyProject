package ColectionsTestHashMap;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Alex", 33);
        scores.put("Javelina", 23);
        scores.put("Bayraktar", 54);
        scores.put("Bayraktar",53);
        System.out.println(scores);
        System.out.println();
        System.out.println(scores.get("Bayraktar"));
    }
}
