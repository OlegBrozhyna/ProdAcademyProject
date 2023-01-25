package ColectionsList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ColectionsListArrayList {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList= new LinkedList<>();
        int n = 1000000;
        int m = 1000;
        for (int i = 0; i < n; i++) {
            arrayList.add(Math.random()*10);
            linkedList.add(Math.random()*10);

        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < m; i++) {
            arrayList.get((int) (Math.random()*(n-1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < m; i++) {
            linkedList.get((int)(Math.random()*m-1));
            
        }
        System.out.println(System.currentTimeMillis()- startTime);
        }
    }


