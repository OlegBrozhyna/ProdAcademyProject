package ColectionsArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayLIstReverse {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        // для вводу з клавіатури BufferedReader
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        //заповнюємо масив циклом
        for (int i = 0; i < 3; i++) {
            System.out.println("imput value[" + i + "]");
            String s = reader.readLine();
            // добавляємо значення в кінець масива
            arrayList.add(s);
        }
        // циклом проходимо довжину масива
        for (int i = 0; i < arrayList.size(); i++) {
            // Записуємо значчення останнього елемента в  змінну j
            int j = arrayList.size() - i- 1;

            System.out.println(arrayList.get(j));

        }
    }
}
