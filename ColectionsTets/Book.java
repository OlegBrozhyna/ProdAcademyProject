package ColectionsTets;

public class Book implements Comparable{

     String title;
     public Book(String t){
         title = t;
     }

    @Override
    public int compareTo(Object b) {
         Book book = Book((String) b);

        return (title.compareTo((book.title)));
    }
     @Override
    public String toString() {
        return "Book{" +
                "title = '" + title + '\'' +
                '}';
    }
}

