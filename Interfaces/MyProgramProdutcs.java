package OOPinterface;

import java.util.Arrays;

public class MyProgramProdutcs {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bembi", "White", 1);
        Cat cat2 = new Cat("Homer", "Red", 3);
        Cat cat3 = new Cat("Joni", "Gray", 5);
        Cat cat4 = new Cat("Bart", "Blac", 2);
        Cat cat5 = new Cat("murzik", "White", 7);

        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};

        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();
        Arrays.sort(cats, new SotrCatComparator() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return 0;
            }
        });
        for (Cat cat : cats) {
            System.out.println(cat);


        }
        ;

    }

}
// TextFileSaveService ts = new TextFileSaveService(new File("cat.txt"));
//        try {
//            ts.saveToCSVFile((GetFateToTextFile) cat1, cat2, cat3, cat4, cat5);
//        } catch (IOExceptione e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
