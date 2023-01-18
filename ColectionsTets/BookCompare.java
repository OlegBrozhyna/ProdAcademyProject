package ColectionsTets;

import java.util.Comparator;

public class BookCompare implements Comparator <Book> {
    public int compare(Book one, Book two) {
        return (one.title.compareTo(two.title));
    }
}
