package HWColections;


import java.util.ArrayList;
import java.util.List;

public class MyProogram {

    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        List<String> arrayList = new ArrayList();

        for (String string : array)
            arrayList.add(string);

        arrayList.remove(0);
        arrayList.remove(0);
        arrayList.remove(arrayList.size() - 1);

        for (String string : arrayList)
            System.out.print(string);
        {
        }
    }
}
