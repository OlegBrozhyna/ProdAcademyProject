package ColectionsTets;

import java.util.TreeSet;

public class TestDriveBook  {
    public static void main(String[] args) {
        
        Book book1= new Book("How Cat work");
        Book book2 = new Book("Java in the best");
        Book book3 = new Book("Man in the moon");

        BookCompare bookCompare = new BookCompare();
        TreeSet<Book> three = new TreeSet<Book>(bookCompare);

        three.add(new Book("How Cat work"));
        three.add(new Book("Java in the best"));
        three.add(new Book(""Man in the moon"));
        System.out.println(three);
        System.out.println(book1);

    }
    public void go (){
        


    }

}
