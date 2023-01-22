package ColectionsTest;

public class Mountain {
    String nane;
    int height;
    Mountain(String  n, int h){
     nane = n;
     height = h;

    }

    @Override
    public String toString() {
        return nane + " " + height;
    }
}
