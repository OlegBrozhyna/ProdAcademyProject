package ColectionsArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayLIstBufferedReader {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();

        //створюємо обєкт  BufferedReader для введеня знасення з клавіатури
        BufferedReader reader = new BufferedReader(new InputStreamReader(System .in));

        for (int i = 0; i < 3; i++) {
            System.out.println("Imput value[" + i + "]");
            String s = reader.readLine();

            arrayList.add(s);

            // видаляємо омтанній ряжок і добавляємо на початок
        }
        for (int i = 0; i < 5; i++) {
            String s1 = arrayList.remove(arrayList.size()-1);
            arrayList.add(0,s1);


          //виводимо на екран
        }
        for (String s : arrayList) {
            System.out.println(arrayList);
        }


    }
}
